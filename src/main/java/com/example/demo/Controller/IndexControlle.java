package com.example.demo.Controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexControlle {
	public static Logger LOG = LoggerFactory.getLogger(IndexControlle.class);
	
	
	@ResponseBody
	@RequestMapping("/index")
	public Map<String,String> index(){
		LOG.info("index start .... ");
		Map<String,String> result = new HashMap<>();
		result.put("code", "200");
		result.put("msg", "success");
		LOG.info("index end .... ");
		return result;
	}
	
	
	
	@ResponseBody
	@RequestMapping(value="/get",method= RequestMethod.GET)
	public Map<String,String> get(){
		Map<String,String> result = new HashMap<>();
		result.put("code", "200");
		result.put("msg", "get success");
		return result;
	}
	
	
	
	@ResponseBody
	@RequestMapping(value="/post",method= {RequestMethod.POST})
	public Map<String,String> post(){
		Map<String,String> result = new HashMap<>();
		result.put("code", "200");
		result.put("msg", "post success");
		return result;
	}
	
	
}
