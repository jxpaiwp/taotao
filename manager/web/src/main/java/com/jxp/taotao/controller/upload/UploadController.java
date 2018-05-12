package com.jxp.taotao.controller.upload;

import com.jxp.taotao.service.upload.PictureService;
import com.jxp.taotao.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/23
 * Time: 22:51
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
public class UploadController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping("/pic/upload")
    @ResponseBody
    public String pictureUpload(MultipartFile uploadFile){
        Map upload = this.pictureService.upload(uploadFile);
        String s = JsonUtils.objectToJson(upload);
        return s;
    }
}
