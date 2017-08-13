package com.app.ioc.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestBean {
	private List al;
	private Set s;
	private Map map;

	public TestBean() {
		System.out.println("Test Bean Constructor..");
	}

	public void setAl(List al) {
		this.al = al;
	}

	public void setS(Set s) {
		this.s = s;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public List getAl() {
		return al;
	}

	public Set getS() {
		return s;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void printList() {
		for (Object object : al) {
			System.out.println(object.toString());
		}
	}
	public void printMap(){
		Set s = map.entrySet();
		for (Object object : s) {
			Map.Entry me = (Map.Entry) object;
			System.out.println(me.getKey()+"/"+me.getValue());
		}
	}
}
