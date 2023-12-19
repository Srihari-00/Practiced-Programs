package com.spring.employee.SpringProjectEmployee;

import java.util.*;

public class Employee 
{
	List<String> technologies;
	Set<String> projects;
	Map<String,String> companies;
	public Employee() {
	}
	public Employee(List<String> technologies, Set<String> projects, Map<String, String> companies) {
		super();
		this.technologies = technologies;
		this.projects = projects;
		this.companies = companies;
	}
	public List<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	public Set<String> getProjects() {
		return projects;
	}
	public void setProjects(Set<String> projects) {
		this.projects = projects;
	}
	public Map<String, String> getCompanies() {
		return companies;
	}
	public void setCompanies(Map<String, String> companies) {
		this.companies = companies;
	}
	@Override
	public String toString() {
		return "Employee [technologies=" + technologies + ", projects=" + projects + ", companies=" + companies + "]";
	}
	
}