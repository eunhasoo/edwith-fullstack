package com.eunhasoo.todo.dto;

public class TodoDto {

	private Long id;
	private String name;
	private String regDate;
	private int sequence;
	private String title;
	private String type;

	
	public TodoDto(Long id, String type) {
		this.id = id;
		this.type = type;
	}
	
	public TodoDto(String title, String name, int sequence) {
		this.title = title;
		this.name = name;
		this.sequence = sequence;
	}
	
	public TodoDto(Long id, String name, String regDate, int sequence, String title, String type) {
		this.id = id;
		this.title = title;
		this.sequence = sequence;
		this.name = name;
		this.regDate = regDate;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Todo [" + getId() + "] " + getName() + " <" + getRegDate() + ">";
	}

}
