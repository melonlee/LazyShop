package org.lazy4j.shop.common.utils.net;

import org.apache.http.client.methods.HttpGet;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author：Melon
 * @Date：2017/11/28
 * @Time：下午10:54
 */
public class HttpHeader {
	
	private HashMap<String,String> headerMap ;
	
	public HttpHeader(HashMap<String, String> map){
		this.headerMap = map;
	}
	
	public HttpHeader(){
		this.headerMap = new HashMap<String, String>();
	}
	
	public void addParam(String key, String value){
		this.headerMap.put(key, value);
	}
	
	public Map getHeaderMap(){
		return this.headerMap;
	}
	
	
	public HttpGet attachHeader(HttpGet httpGet){
		for(String key : this.headerMap.keySet()){
			httpGet.setHeader(key, this.headerMap.get(key));
		}
		return httpGet;
	}

}
