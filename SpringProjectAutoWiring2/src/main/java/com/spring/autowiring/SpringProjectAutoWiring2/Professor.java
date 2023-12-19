package com.spring.autowiring.SpringProjectAutoWiring2;

public class Professor 
{
	int p_id;
	String p_name;
	String p_subject;
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professor(int p_id, String p_name, String p_subject) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_subject = p_subject;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_subject() {
		return p_subject;
	}
	public void setP_subject(String p_subject) {
		this.p_subject = p_subject;
	}
	@Override
	public String toString() {
		return "Professor [p_id=" + p_id + ", p_name=" + p_name + ", p_subject=" + p_subject + "]";
	}
	

}
