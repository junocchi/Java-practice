package com.ju.dto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@Column
	private int rollNo;
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private int classNo;
	@Column
	private String address;
	@Column
	private long phoneNumber;

	public Student(int rollNo, String name, int age, int classNo, String address, long phoneNumber) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.classNo = classNo;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getClassNo() {
		return classNo;
	}

	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", classNo=" + classNo + ", address="
				+ address + ", phoneNumber=" + phoneNumber + "]";
	}

}
