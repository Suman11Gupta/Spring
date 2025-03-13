package com.example;

import org.springframework.stereotype.Component;

@Component
public class passport {
int number;
String validyear;

public passport() {
	super();
	// TODO Auto-generated constructor stub
}

public passport(int number, String validyear) {
	super();
	this.number = number;
	this.validyear = validyear;
}


public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public String getValidyear() {
	return validyear;
}

public void setValidyear(String validyear) {
	this.validyear = validyear;
}

@Override
public String toString() {
	return "passport [number=" + number + ", validyear=" + validyear + "]";
}

}
