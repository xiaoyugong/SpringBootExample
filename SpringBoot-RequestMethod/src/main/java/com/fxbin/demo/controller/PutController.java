package com.fxbin.demo.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: fxbin
 * Date: 2018/5/23
 * Time: 22:22
 * Description:
 */
@RestController
public class PutController {

    private final Map<String, Object> params = new HashMap<String, Object>();

    @PutMapping("/put")
    public Object put(String id){
        params.clear();
        params.put("id", id);
        return params;
    }
}
