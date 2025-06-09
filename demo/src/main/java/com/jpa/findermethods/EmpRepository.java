package com.jpa.findermethods;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface EmpRepository extends JpaRepository<Emp, Integer> {

	//selecting all the column values
	List<Emp> findByNameEquals(String name);
	List<Emp> findByAgeBetween(int start,int end);
	List<Emp> findByNameLike(String name);
	List<Emp> findByNameContaining(String name);
	List<Emp> findByAgeLessThanEqualAndAgeGreaterThanEqual(double start ,double end);
//	Emp  findByName(String name);
	List<ScalarInterfaceOfEmp> findByName(String name);
	
	@Query(value = "select id,name from Emp")
	List<Object[]> findAllEmp();
	
	@Query("select name from Emp")
	Object[] selectNames();
	
	@Query("update Emp set age = :age where name = :name")
	@Modifying
	@Transactional
	int UpdateAgeByName(@Param("name")String name ,@Param("age") int age);
}
