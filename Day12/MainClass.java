package com.coforge.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;
import org.hibernate.query.Query;

import com.coforge.model.Course;
import com.coforge.model.Student;

public class MainClass {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		// ================= INSERT (run once to populate data) =================

//		 1. Create and save courses FIRST, independently
//		Course java = new Course("Java");
//		Course springBoot = new Course("Spring Boot");
//		Course hibernate = new Course("Hibernate");
//		Course angular = new Course("Angular");
//
//		session.save(java);
//		session.save(springBoot);
//		session.save(hibernate);
//		session.save(angular);
//
//		// 2. Now create students and link to already-persisted courses
//		Student srakshin = new Student("srakshin");
//		srakshin.getCourses().add(java);
//		srakshin.getCourses().add(springBoot);
//
//		Student varshith = new Student("varshith");
//		varshith.getCourses().add(java);
//		varshith.getCourses().add(hibernate);
//
//		
//		session.save(srakshin);
//		session.save(varshith);
//		
//
//		System.out.println("Data inserted successfully!");
		
		// ================= HQL SELECT ALL STUDENTS =================

//		Query<Student> query = session.createQuery("from Student", Student.class);
//		java.util.List<Student> list = query.list();
//		for (Student s : list) {
//			System.out.println(s.getStudentName() + " -> " + s.getCourses());
//		}

		// ================= HQL SELECT STUDENT BY ID =================

		Query<Student> query = session.createQuery("from Student where studentId = :id", Student.class);
		query.setParameter("id", 1);

		List list = (List) query.list();
		System.out.println(list);

		
		transaction.commit();
		session.close();
		factory.close();
	}
}