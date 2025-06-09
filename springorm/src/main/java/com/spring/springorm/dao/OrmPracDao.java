package com.spring.springorm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.springorm.entities.OrmPrac;

@Component
//@Transactional
public class OrmPracDao {

	@Autowired
	HibernateTemplate ht;
	
	//insert the new object into the data base
	@Transactional
	public int insert(OrmPrac p) {
		return (int)ht.save(p);
//		System.out.println(ht.merge(p));
		
//		return 1;
	}
	
	public void update(OrmPrac p) {
//		if(ht.contains(p)) {
//			
			ht.update(p);
//			return true;
//		}
//		else{
//			return false;
//		}
	}
	
	public void delete(OrmPrac p) {
//		if(ht.contains(p)) {
//			
			ht.delete(p);
//			return true;
//		}
//		else {
//			return false;
//		}
	}
	
	public OrmPrac display(int id) {
		return ht.get(OrmPrac.class, id);
	}
	
	public List<OrmPrac> displayAll(){
		return ht.loadAll(OrmPrac.class);
	}
}
