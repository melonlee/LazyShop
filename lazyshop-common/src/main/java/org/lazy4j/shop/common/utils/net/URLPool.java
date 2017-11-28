package org.lazy4j.shop.common.utils.net;

import java.util.List;
import java.util.Stack;

/**
 * @Author：Melon
 * @Date：2017/11/28
 * @Time：下午10:54
 */
public class URLPool {

	private static URLPool Instance;
	private Stack<String> stack;
	
	private URLPool(){
		stack = new Stack<String>();
	}
	
	public static URLPool getInstance(){
		if(Instance == null){
			Instance = new URLPool();
		}
		return Instance;
	}
	
	public void batchPush(List<String> URLS){
		for(String URL : URLS){
			if(!stack.contains(URL)){
				stack.push(URL);
			}
		}
	}
	
	public void pushURL(String URL){
		if(!stack.contains(URL)){
			stack.push(URL);
		}
	}
	
	public boolean hasNext(){
		return !(stack.isEmpty());
	}
	
	public String popURL(){
		if(hasNext()){
			return stack.pop();
		} else {
			return null;
		}
	}
	
	
}
