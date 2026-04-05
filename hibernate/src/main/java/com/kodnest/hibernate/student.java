package com.kodnest.hibernate;

import java.util.Objects;

public class student {
  int id;
  String name;
  String gender;
  int age;
  String collage;
  String university;
  int tenmarks;
  int twemarks;
  int degmarks;
  address address; //Aggregation
  public student() {
	super();
	// TODO Auto-generated constructor stub
  }
  public student(int id, String name, String gender, int age, String collage, String university, int tenmarks,
		int twemarks, int degmarks, com.kodnest.hibernate.address address) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.age = age;
	this.collage = collage;
	this.university = university;
	this.tenmarks = tenmarks;
	this.twemarks = twemarks;
	this.degmarks = degmarks;
	this.address = address;
  }
  public int getId() {
	return id;
  }
  public void setId(int id) {
	this.id = id;
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public String getGender() {
	return gender;
  }
  public void setGender(String gender) {
	this.gender = gender;
  }
  public int getAge() {
	return age;
  }
  public void setAge(int age) {
	this.age = age;
  }
  public String getCollage() {
	return collage;
  }
  public void setCollage(String collage) {
	this.collage = collage;
  }
  public String getUniversity() {
	return university;
  }
  public void setUniversity(String university) {
	this.university = university;
  }
  public int getTenmarks() {
	return tenmarks;
  }
  public void setTenmarks(int tenmarks) {
	this.tenmarks = tenmarks;
  }
  public int getTwemarks() {
	return twemarks;
  }
  public void setTwemarks(int twemarks) {
	this.twemarks = twemarks;
  }
  public int getDegmarks() {
	return degmarks;
  }
  public void setDegmarks(int degmarks) {
	this.degmarks = degmarks;
  }
  public address getAddress() {
	return address;
  }
  public void setAddress(address address) {
	this.address = address;
  }
  @Override
  public String toString() {
	return "student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", collage=" + collage
			+ ", university=" + university + ", tenmarks=" + tenmarks + ", twemarks=" + twemarks + ", degmarks="
			+ degmarks + ", address=" + address + ", getId()=" + getId() + ", getName()=" + getName() + ", getGender()="
			+ getGender() + ", getAge()=" + getAge() + ", getCollage()=" + getCollage() + ", getUniversity()="
			+ getUniversity() + ", getTenmarks()=" + getTenmarks() + ", getTwemarks()=" + getTwemarks()
			+ ", getDegmarks()=" + getDegmarks() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
  }
  @Override
  public int hashCode() {
	return Objects.hash(address, age, collage, degmarks, gender, id, name, tenmarks, twemarks, university);
  }
  @Override
  public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	student other = (student) obj;
	return Objects.equals(address, other.address) && age == other.age && Objects.equals(collage, other.collage)
			&& degmarks == other.degmarks && Objects.equals(gender, other.gender) && id == other.id
			&& Objects.equals(name, other.name) && tenmarks == other.tenmarks && twemarks == other.twemarks
			&& Objects.equals(university, other.university);
  }
  
}
