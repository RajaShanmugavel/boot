package com.abc.raja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abc.raja.bean.Employee;

//@CrossOrigin // TODO Do the CrossOrigin with the Spring Security Configuration later....
@RestController
public class BaseController {

	List<Employee> list = new ArrayList<>();

	@GetMapping("/get-employees")
	public List<Employee> getEmployees() {
		return list;
	}

	@PostMapping("/add-employee")
	public Integer addEmployee(@RequestBody Employee employee) {
		list.add(employee);
		return list.size();
	}

	@PostMapping("/remove-employee")
	public Integer removeEmployee(@RequestBody Employee employee) {
		list.forEach(emp -> {
			if (emp.getEmpId().equals(employee.getEmpId())) {
				list.remove(employee);
			}
		});
		return list.size();
	}

	@PostMapping("/login")
	public User loginUser(User user) {
		return user;
	}

}
