package com.khadri.spring.boot.application.props.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.khadri.spring.boot.application.props.student.Student;

@Component
public class StudentRunner implements ApplicationRunner {

	@Autowired
	private Student student;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getAddress().getAddressLine1());
		System.out.println(student.getAddress().getAddressLine2());
	}

}
