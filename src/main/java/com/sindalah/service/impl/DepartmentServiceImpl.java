package com.sindalah.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sindalah.model.Department;
import com.sindalah.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Override
	public Department saveDepartment(Department department) {

		return department;
	}

	@Override
	public List<Department> fetchDepartmentList() {

		List<Department> list = new ArrayList<>();
		list.add(new Department(1l, "ADMIN", "mumbai", "MUM"));
		list.add(new Department(2l, "PAYMENTS", "bangalore", "BAN"));
		list.add(new Department(3l, "CREDIT", "hyderabad", "HYD"));

		return list;
	}

	@Override
	public Department updateDepartment(Department department, Long departmentId) {

		return new Department(departmentId, "PAYMENTS", "mumbai", "MUM");
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {

	}

}
