package kr.co.fastcampus.cli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Main {
	private static Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		logger.info("Hello, world!!");

		ApplicationContext context = new ClassPathXmlApplicationContext("dao.xml");

		var dao = context.getBean("dao", Dao.class);
		dao.run();
	}
}