package com.irving.knowledge.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;



/**
 * RestTemplate 主要作用就是简化java使用 HttpClient调用其他服务
 */
@Controller
public class RestTemplateTest {

    private  static  final Logger log =LoggerFactory.getLogger(RestTemplateTest.class);
    @RequestMapping(value = "/restTemplate/get")
    public  void restTemplateGet(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/simple/request" ;
        String result  = restTemplate.getForObject(url,String.class);
        log.info(result);
    }

}
