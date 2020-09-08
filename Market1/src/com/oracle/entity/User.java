package com.oracle.entity;

public class User {
private String name;//ÓÃ»§Ãû
private String password;//ÃÜÂë
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [name=" + name + ", password=" + password + "]";
}

}
