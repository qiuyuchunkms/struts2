package com.ambow.st.user.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestArrayListGroupByKey {

	public static void main(String[] args) {
		/* 1、准备数据* */
		ValueStackBo sku1 = new ValueStackBo("user", "name", "qyc1");
		ValueStackBo sku2 = new ValueStackBo("user1", "name", "qyc2");
		ValueStackBo sku3 = new ValueStackBo("user1", "age", "23");
		ValueStackBo sku4 = new ValueStackBo("user2", "age", "21");
		ValueStackBo sku5 = new ValueStackBo("user2", "name", "qyc");

		List<ValueStackBo> skuVoList = Arrays.asList(new ValueStackBo[] { sku1, sku2, sku3, sku4, sku5 });

		/* 2、分组算法* */
		Map<String, List<ValueStackBo>> skuIdMap = new HashMap<String, List<ValueStackBo>>();
		for (ValueStackBo skuVo : skuVoList) {
			List<ValueStackBo> tempList = skuIdMap.get(skuVo.getClazz());
			/* 如果取不到数据,那么直接new一个空的ArrayList* */
			if (tempList == null) {
				tempList = new ArrayList<ValueStackBo>();
				tempList.add(skuVo);
				skuIdMap.put(skuVo.getClazz(), tempList);
			} else {
				/* 某个sku之前已经存放过了,则直接追加数据到原来的List里* */
				tempList.add(skuVo);
			}
		}

		/* 3、遍历map,验证结果* */
		for (String skuId : skuIdMap.keySet()) {
			System.out.println(skuIdMap.get(skuId));
		}
	}
}