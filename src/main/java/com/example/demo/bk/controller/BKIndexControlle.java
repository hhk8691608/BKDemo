package com.example.demo.bk.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="bk")
public class BKIndexControlle {
	public static Logger LOG = LoggerFactory.getLogger(BKIndexControlle.class);
	
	
	@ResponseBody
	@RequestMapping("/index")
	public Map<String,String> index(){
		Map<String,String> result = new HashMap<>();
		result.put("code", "200");
		result.put("msg", "bk success");
		return result;
	}
	
	
	
	
}
