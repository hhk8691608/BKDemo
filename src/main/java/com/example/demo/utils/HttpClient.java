package com.example.demo.utils;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.bk.service.TenancyService;

public class HttpClient {
	
	public static Logger LOG = LoggerFactory.getLogger(TenancyService.class);
	
	private final static String TEST_LOCALHOST = "http://127.0.0.1:8080/get";
	private final static String BK_ZU_FANG_INFO = "https://sz.zu.ke.com/zufang/pg1rs%E6%A1%83%E5%9B%AD/";
	
	public static void main(String[] args) {
		
		CloseableHttpClient  httpclient = HttpClients.createDefault();
		CloseableHttpResponse response =null;
		try {
			
			HttpGet httpget = new HttpGet(BK_ZU_FANG_INFO);
			response = httpclient.execute(httpget);
			  HttpEntity entity = response.getEntity();
				System.out.println("----------------------------------------");
				System.out.println(response.getStatusLine());
				if (entity != null) {
					System.out.println("Response content length: " + entity.getContentLength());
					System.out.println(EntityUtils.toString(entity));
					EntityUtils.consume(entity);
				}
			  
		} catch (Exception e) {
			LOG.debug("Dedug starting ..................................");
			LOG.debug(e.getMessage());
		} finally {
			try {
				response.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
