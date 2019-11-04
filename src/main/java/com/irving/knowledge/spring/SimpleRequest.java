package com.irving.knowledge.spring;

import com.irving.knowledge.spring.util.dto.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 构建简单的java请求
 */
@RestController
public class SimpleRequest {

    private static final Logger log = LoggerFactory.getLogger(SimpleRequest.class);

    @RequestMapping(value = "/simple/request")
    public ResponseDto simpleRequest(String id){

        log.debug("=========debug");
        log.info("=========info");
        log.error("=========error");
        Map<String,Object> data = new HashMap<>();
        data.put("bindResult","1");
        return new  ResponseDto(data,"0","成功");

    }
}
