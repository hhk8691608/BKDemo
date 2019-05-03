package com.example.demo.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.slf4j.LoggerFactory;

import com.example.demo.Controller.IndexControlle;

import ch.qos.logback.classic.Logger;

public class URLDecoderOrEncoder {
	
	public static org.slf4j.Logger LOG = LoggerFactory.getLogger(URLDecoder.class);
	
	/**
	 *  编码
	 * @param sourceStr
	 * @return
	 */
	public static String encodeUTF8(String sourceStr) {
		try {
			String encodeStr = URLEncoder.encode(sourceStr, "UTF-8");
			return encodeStr;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 *  解码
	 * @param sourceStr
	 * @return
	 */
	public static String decodeUTF8(String encodeStr) {
		try {
			String decoderStr = URLDecoder.decode(encodeStr, "UTF-8");
			return decoderStr;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		
		String sourceStr = "宝安中心";
		String encodeStr = URLDecoderOrEncoder.encodeUTF8(sourceStr);
		LOG.info(encodeStr);
//		
//		String decoderString = URLDecoderOrEncoder.decodeUTF8(encodeStr);
//		LOG.info(decoderString);
		
		String dd = "rs%E6%A1%83%E5%9B%AD";
		String reuslt = URLDecoderOrEncoder.decodeUTF8(dd);
		LOG.info(reuslt);
	
	}

}
