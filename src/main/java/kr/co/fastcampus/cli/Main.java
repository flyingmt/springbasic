package kr.co.fastcampus.cli;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.sql.SQLException;

@Slf4j
class Main {
	public static void main(String[] args) throws SQLException {
		log.info("Hello, world!!");

		//ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("dao.xml");
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("kr.co.fastcampus.cli");

		//ConnectionFactory factory = context.getBean(ConnectionFactory.class);
		//Connection connection = factory.getConnection();
		//log.info("" + (connection != null));
		context.close();

	}
}