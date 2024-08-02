package com.example.petClinic.model;

import java.util.List;

public class Response {

	Integer code;
	String message;
	List<Pets> pets;
	
	public Response() {
		// TODO Auto-generated constructor stub
	}

	public Response(Integer code, String message, List<Pets> pets) {
		this.code = code;
		this.message = message;
		this.pets = pets;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Pets> getPets() {
		return pets;
	}

	public void setPets(List<Pets> pets) {
		this.pets = pets;
	}

	@Override
	public String toString() {
		return "Response [code=" + code + ", message=" + message + ", pets=" + pets + "]";
	}
	
	
	
}// END of main class
