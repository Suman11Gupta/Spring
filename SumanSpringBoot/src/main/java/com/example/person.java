package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class person {
int age;
String name;
@Autowired
passport pass;


public person() {
	super();
	// TODO Auto-generated constructor stub
}
public person(int age, String name, passport pass) {
	super();
	this.age = age;
	this.name = name;
	this.pass = pass;
}


public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public passport getPass() {
	return pass;
}
public void setPass(passport pass) {
	this.pass = pass;
}


@Override
public String toString() {
	return "person [age=" + age + ", name=" + name + ", pass=" + pass + "]";
}


}
