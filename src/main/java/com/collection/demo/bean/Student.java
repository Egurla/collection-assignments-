package com.collection.demo.bean;

public class Student {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Sbranch == null) ? 0 : Sbranch.hashCode());
		result = prime * result + Sid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Sbranch == null) {
			if (other.Sbranch != null)
				return false;
		} else if (!Sbranch.equals(other.Sbranch))
			return false;
		if (Sid != other.Sid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	private int Sid;
	private String name;
	private String Sbranch;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSbranch() {
		return Sbranch;
	}
	public void setSbranch(String sbranch) {
		Sbranch = sbranch;
	}
	public Student(int sid, String name, String sbranch) {
		this.Sid = sid;
		this.name = name;
		this.Sbranch = sbranch;
	}
	
	
}
