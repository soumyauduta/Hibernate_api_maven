package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.tut.Student;



public class CriteriaExample {
   public static void main(String[] args) {
	Session s = new Configuration().configure().buildSessionFactory().openSession();
	Criteria c=s.createCriteria(Student.class);
	c.add(Restrictions.eq("city", "mumbai"));
	List<Student> students=c.list();
	for(Student stud:students) {
		System.out.println(stud);
	}
	
	s.close();
}
}
