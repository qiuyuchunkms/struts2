package com.ambow.st.user.webapp;

import java.beans.IntrospectionException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ambow.st.user.model.User;
import com.ambow.st.user.model.User2;
import com.ambow.st.user.model.User3;
import com.ambow.st.user.model.User4;
import com.ambow.st.user.test.ValueStackBo;
import com.ambow.st.user.util.BeanToMapUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

//@Controller(value = "userAction")
public class UserAction extends ActionSupport implements ModelDriven<Object> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private User2 user2;
	private User3 user3;
	private User4 user4;

	@Override
	public User getModel() {
		return user;
	}

	@SuppressWarnings({ "unchecked", "unused", "rawtypes" })
	public <T> String getUsers() {

		try {
			Field method[] = this.getClass().getDeclaredFields();

			HttpServletRequest request = ServletActionContext.getRequest();
			Map<String, Object> map1 =   new HashMap<String, Object>();
			Set<Map.Entry<String, Object>> set = map1.entrySet();

			List<Map<String, String>> list = new ArrayList<Map<String, String>>();
			for (Entry<String, Object> entry : set) {
				String key = entry.getKey();
				Object[] value = (Object[]) entry.getValue();
				Map<String, String> map2 = new HashMap<String, String>();
				map2.put(key, value[0] + "");
				list.add(map2);
			}

			List<ValueStackBo> boList = new ArrayList<ValueStackBo>();
			for (int i = 0; i < list.size(); i++) {
				Map<String, String> map2 = list.get(i);
				String key = map2.entrySet().iterator().next().getKey();
				String value = map2.entrySet().iterator().next().getValue();
				String[] keys = key.split(",");
				for (int j = 0; j < keys.length; j++) {
					String keyName = keys[j];
					String[] keyNames = keyName.split("\\.");
					String key_k = keyNames[0];
					String key_v = keyNames[1];
					ValueStackBo bo = new ValueStackBo(key_k, key_v, value);
					boList.add(bo);
				}

			}
			/* 2、分组算法* */
			Map<String, List<ValueStackBo>> valueStrackBo = new HashMap<String, List<ValueStackBo>>();
			for (ValueStackBo skuVo : boList) {
				List<ValueStackBo> tempList = valueStrackBo.get(skuVo.getClazz());
				/* 如果取不到数据,那么直接new一个空的ArrayList* */
				if (tempList == null) {
					tempList = new ArrayList<ValueStackBo>();
					tempList.add(skuVo);
					valueStrackBo.put(skuVo.getClazz(), tempList);
				} else {
					/* 某个sku之前已经存放过了,则直接追加数据到原来的List里* */
					tempList.add(skuVo);
				}
			}

			/* 3、遍历map,验证结果* */
			List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
			Map<String, Map<String, Object>> map3 = new HashMap<String, Map<String, Object>>();

			for (String skuId : valueStrackBo.keySet()) {
				List<ValueStackBo> bos = valueStrackBo.get(skuId);
				Map<String, Object> map2 = new HashMap<String, Object>();
				for (int i = 0; i < bos.size(); i++) {
					ValueStackBo bo = bos.get(i);
					map2.put(bo.getType(), bo.getValue());
				}
				map3.put(skuId, map2);
			}

			Set<String> set3 = map3.keySet();
			List<Object> classList = new ArrayList<Object>();
			for (Iterator<String> iter = set3.iterator(); iter.hasNext();) {
				String key = iter.next();
				Map<String, Object> value = map3.get(key);
				for (int i = 0; i < method.length; i++) {
					Field method1 = method[i];
					String methodName = method1.getName();
					Class t = method1.getType();
					if (key.equals(methodName)) {
						Class class1 = Class.forName(t.getName());
						Object obj = BeanToMapUtil.map2Class(class1, value);
						
						classList.add(obj);
					}
				}
			}

			for (int i = 0; i < classList.size(); i++) {
				Object t = classList.get(i);
				System.out.println(t);
			}
		} catch (SecurityException e) {
 			e.printStackTrace();
		} catch (IllegalAccessException e) {
 			e.printStackTrace();
		} catch (InstantiationException e) {
 			e.printStackTrace();
		} catch (InvocationTargetException e) {
 			e.printStackTrace();
		} catch (IntrospectionException e) {
 			e.printStackTrace();
		} catch (ClassNotFoundException e) {
 			e.printStackTrace();
		}
		return "success";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User2 getUser2() {
		return user2;
	}

	public void setUser2(User2 user2) {
		this.user2 = user2;
	}

	public User3 getUser3() {
		return user3;
	}

	public void setUser3(User3 user3) {
		this.user3 = user3;
	}

	public User4 getUser4() {
		return user4;
	}

	public void setUser4(User4 user4) {
		this.user4 = user4;
	}
	
	

}
