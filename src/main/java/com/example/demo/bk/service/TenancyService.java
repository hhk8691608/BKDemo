package com.example.demo.bk.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.bk.controller.BKIndexControlle;

/**
 * 完成租房信息的爬取
 * @author Administrator
 *
 */
@Service(value="tenancyService")
public class TenancyService {
	
	
	public static Logger LOG = LoggerFactory.getLogger(TenancyService.class);
	
	private static final String ZU_FANG = "https://sz.zu.ke.com/zufang/";
	
	public void crawlTest() {
		
		
		
		
	}

}
