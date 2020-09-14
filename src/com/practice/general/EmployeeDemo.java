package com.practice.general;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeDemo {

public static void main(String[] args) {
List<EmployeeBean>empList = new ArrayList<EmployeeBean>();
empList.add (new EmployeeBean(100, "Prabhanjan"));
empList.add (new EmployeeBean(200, "Suresh"));
empList.forEach(i->System.out.println(i));
}
}	


