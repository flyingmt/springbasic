package kr.co.fastcampus.cli;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

@Slf4j
class Main {
	public static void main(String[] args) throws SQLException {
		log.info("Hello, world!!");

		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		//ApplicationContext context = new ClassPathXmlApplicationContext("dao.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		A a1 = context.getBean("A", A.class);
		A a2 = context.getBean("A", A.class);

		log.info("result: " + (a1 == a2));

		//var dao2 = context.getBean("dao2", Dao2.class);
		//dao2.run();
	}
}