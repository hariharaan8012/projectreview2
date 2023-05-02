package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="hello")
public class IplModel 
{
	@Id 
   private int Iplnum;
   private String Iplname;
   private String Iplversion;
public int getIplnum() {
	return Iplnum;
}
public void setCarnum(int Iplnum) {
	this.Iplnum = Iplnum;
}
public String getIplname() {
	return Iplname;
}
public void setIplname(String Iplname) {
	this.Iplname = Iplname;
}
public String getCarversion() {
	return Iplversion;
}
public void setIplversion(String Iplversion) {
	this.Iplversion = Iplversion;
}
}
   