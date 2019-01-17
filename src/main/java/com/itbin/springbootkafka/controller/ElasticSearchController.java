package com.itbin.springbootkafka.controller;

import com.itbin.springbootkafka.elasticsearch.ElasticsearchUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by LIBIN on 2019/1/15 18:33
 * Description:
 */
@RestController
@RequestMapping(value = "/es")
public class ElasticSearchController {

    @GetMapping(value = "/getInfo")
    public Map<String, Object> getInfo(){

        return  ElasticsearchUtils.searchDataById("cdp_event","event","10001","name");

    }
}
