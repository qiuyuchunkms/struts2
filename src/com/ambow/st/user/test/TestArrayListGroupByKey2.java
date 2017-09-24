package com.ambow.st.user.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestArrayListGroupByKey2 {

	public static void main(String[] args) {
		
		

		String s = "user.name,user3.name,user2.name,user.age";
		String[] ss = s.split(",");
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();

		for (int i = 0; i < ss.length; i++) {
			String[] sss = ss[i].split("\\.");
			Map<String, String> map = new HashMap<String, String>();
			for (int j = 0; j < sss.length; j++) {
				map.put(sss[0], sss[1]);
			}
			list.add(map);
		}
		
		/* 2、分组算法* */
		Map<String, List<Map<String, String>>> map = new HashMap<String, List<Map<String, String>>>();
		for (Map<String, String> skuVo : list) {

			List<Map<String, String>> tempList = map.get(skuVo.entrySet().iterator().next().getKey());
			/* 如果取不到数据,那么直接new一个空的ArrayList* */
			if (tempList == null) {
				tempList = new ArrayList<Map<String, String>>();
				tempList.add(skuVo);
				map.put(skuVo.entrySet().iterator().next().getKey(), tempList);
			} else {
				/* 某个sku之前已经存放过了,则直接追加数据到原来的List里* */
				tempList.add(skuVo);
			}
		}

		/* 3、遍历map,验证结果* */
		for (String skuId : map.keySet()) {
			System.out.println(map.get(skuId));
		}
	}
}