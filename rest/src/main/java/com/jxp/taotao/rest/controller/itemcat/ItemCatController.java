package com.jxp.taotao.rest.controller.itemcat;

import com.jxp.taotao.rest.bean.itemcat.CatResult;
import com.jxp.taotao.rest.service.itemcat.ItemCatService;
import com.jxp.taotao.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/25
 * Time: 0:21
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
public class ItemCatController {

    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping(value = "/itemcat/list",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String getItemcatList(String callback){
        CatResult itemCatList = this.itemCatService.getItemCatList();
        String json = JsonUtils.objectToJson(itemCatList);

        return callback + "(" + json + ");";
//        写法二:不需要些produces 该类为返回json
//        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(itemCatList);
//        mappingJacksonValue.setJsonpFunction(callback);
//        return mappingJacksonValue;
    }
}
