package com.bptn.course.day_06.GetterSetter;

public class Person {
	   private String name;
	   private int age;
	   
	   // getter
	   public String getName() {
	      return name;
	   }
	   
	   // getter
	   public int getAge(String apiKey) {
		  // logic to validate the apiKey
	      return age;
	   }

	   // setter
	   public boolean setName(String theNewName) {
	      if (theNewName != null) {
	         this.name = theNewName;
	         return true;
	      }
	      return false;
	   }
	}

