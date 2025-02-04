package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller FindById(Integer id);
	List<Seller> FindAll();
	List<Seller> FindByDepartment(Department department);

}
