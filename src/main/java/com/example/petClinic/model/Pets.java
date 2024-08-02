package com.example.petClinic.model;

public class Pets {

	Integer pid;
	String petName;
	String typeOfAnimal;
	String ownerName;
	
	public Pets() {
		// TODO Auto-generated constructor stub
	}

	public Pets(Integer pid, String petName, String typeOfAnimal, String ownerName) {
		this.pid = pid;
		this.petName = petName;
		this.typeOfAnimal = typeOfAnimal;
		this.ownerName = ownerName;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getTypeOfAnimal() {
		return typeOfAnimal;
	}

	public void setTypeOfAnimal(String typeOfAnimal) {
		this.typeOfAnimal = typeOfAnimal;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "Pets [pid=" + pid + ", petName=" + petName + ", typeOfAnimal=" + typeOfAnimal + ", ownerName="
				+ ownerName + "]";
	}
	
	
	
}// END of main class
