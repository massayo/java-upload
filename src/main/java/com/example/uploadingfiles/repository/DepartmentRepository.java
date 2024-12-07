package com.example.uploadingfiles.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.uploadingfiles.entity.Department;


public interface DepartmentRepository extends JpaRepository<Department, Long> {
	@Query("from Department order by name")
	List <Department> findOrderByName();
}

