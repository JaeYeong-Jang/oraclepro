package com.javaex.phone;

public class PersonVo {
	
	//Fields
	private int presonId;
	private String name;
	private String hp;
	private String company;
	
	//Constructors
	public PersonVo() {
		
	}
	
	public PersonVo(int personId, String name, String hp, String company) {
		
		this.presonId = personId;
		this.name = name;
		this.hp = hp;
		this.company = company;
		
	}

	//g/s
	public int getPresonId() {
		return presonId;
	}

	public void setPresonId(int presonId) {
		this.presonId = presonId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	//Method
	
	
}
