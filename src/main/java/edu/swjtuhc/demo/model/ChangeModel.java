package edu.swjtuhc.demo.model;


public class ChangeModel{
	String emile;
	int age;
	String gender;
	String name;
	public String getEmile() {
		return emile;
	}
	public void setEmile(String emile) {
		this.emile = emile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ChangeModel [emile=" + emile + ", age=" + age + ", gender=" + gender + ", name=" + name
				+ ", getEmile()=" + getEmile() + ", getAge()=" + getAge() + ", getGender()=" + getGender()
				+ ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}