package com.example.demo.springcache.domain;

public class Student {

	private String id;
	private String name;
	private String clz;

	
	public Student(String id, String name, String clz) {
		super();
		this.id = id;
		this.name = name;
		this.clz = clz;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getClz() {
		return clz;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setClz(String clz) {
		this.clz = clz;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", clz=" + clz + "]";
	}

}
