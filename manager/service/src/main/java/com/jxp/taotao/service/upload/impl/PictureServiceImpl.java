package com.jxp.taotao.service.upload.impl;

import com.jxp.taotao.service.upload.PictureService;
import com.jxp.taotao.utils.FtpUtil;
import com.jxp.taotao.utils.IDUtils;
import com.mysql.jdbc.UpdatableResultSet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/23
 * Time: 22:35
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class PictureServiceImpl implements PictureService {
    @Value("${FTP_IMAGE_IP}")
    private String ftpImageIp;
    @Value("${FTP_IMAGE_PORT}")
    private int ftpImagePort;
    @Value("${FTP_IMAGE_USER}")
    private String ftpImageUser;
    @Value("${FTP_IMAGE_PASSWORD}")
    private String ftpImagePassword;
    @Value("${FTP_IMAGE_HTTP_PATH}")
    private String ftpImageHttpPath;

    @Override
    public Map upload(MultipartFile uploadFile) {
        Map<String, Object> returnMap = new HashMap<String, Object>();
        try {
            String oldPictureName = uploadFile.getOriginalFilename();
            String newPictureName = IDUtils.genImageName();
            String fileName = newPictureName+oldPictureName.substring(oldPictureName.lastIndexOf("."));


            boolean isUploadSuccess = FtpUtil.uploadFile(ftpImageIp, ftpImagePort, ftpImageUser, ftpImagePassword, "/", "/", fileName, uploadFile.getInputStream());
            String imagePath = ftpImageHttpPath+ fileName;

            if (isUploadSuccess){
                returnMap.put("error", 0);
                returnMap.put("message", imagePath);
            }else {
                returnMap.put("error", 1);
                returnMap.put("message", "图片上传失败");
            }

        } catch (IOException e) {
            e.printStackTrace();
            returnMap.put("error", 0);
            returnMap.put("message", "图片上传失败");
            return returnMap;
        }
        return returnMap;
    }
}
