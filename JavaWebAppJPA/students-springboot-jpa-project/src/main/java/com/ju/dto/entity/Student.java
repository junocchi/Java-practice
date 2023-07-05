package com.ju.dto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STUDENTJPA")
public class Student {
	@Id
	@Column
	private int RollNo;
	@Column
	private String Name;
	@Column
	private String Age;
	@Column
	private String StuClass;
	@Column
	private String Address;
	@Column
	private String PhoneNumber;

	public Student(int rollNo, String name, String age, String stuClass, String address, String phoneNumber) {
		super();
		RollNo = rollNo;
		Name = name;
		Age = age;
		StuClass = stuClass;
		Address = address;
		PhoneNumber = phoneNumber;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public String getStuClass() {
		return StuClass;
	}

	public void setStuClass(String stuClass) {
		StuClass = stuClass;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", Name=" + Name + ", Age=" + Age + ", StuClass=" + StuClass + ", Address="
				+ Address + ", PhoneNumber=" + PhoneNumber + "]";
	}

}
