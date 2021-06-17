package model.dao;

import java.util.List;

import model.entites.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department byFindId(Integer id);
	List<Department> findAll();

}
