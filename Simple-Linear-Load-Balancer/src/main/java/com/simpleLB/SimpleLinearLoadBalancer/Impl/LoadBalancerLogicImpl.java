package com.simpleLB.SimpleLinearLoadBalancer.Impl;

import java.util.ArrayList;
import java.util.List;

public class LoadBalancerLogicImpl {
	static int count = 0;
	public String getUrl() {
		List<String> urlList = new ArrayList<String>();
		urlList.add("http://localhost:9001/getUrlPort");
		urlList.add("http://localhost:9002/getUrlPort");
		int urlMain = count % (urlList.size());
		count += 1;
		return urlList.get(urlMain);
	}

}
