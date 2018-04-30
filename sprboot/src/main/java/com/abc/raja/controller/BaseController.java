package com.abc.raja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.raja.bean.Employee;

//@CrossOrigin // TODO Do the CrossOrigin with the Spring Security Configuration later....
@RestController
public class BaseController {

	@GetMapping("/show-time")
	public List<Employee> getTime() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("John", 345, 3434.34F));
		list.add(new Employee("Rose", 135, 4453.22F));
		return list;
	}

}
