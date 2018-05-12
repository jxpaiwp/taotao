package com.jxp.taotao.service.upload;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/23
 * Time: 22:26
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface PictureService {
    public Map upload(MultipartFile uploadFile);
}
