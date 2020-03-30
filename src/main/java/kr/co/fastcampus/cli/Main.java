package kr.co.fastcampus.cli;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.sql.SQLException;

@Slf4j
class Main {
	public static void main(String[] args) throws SQLException {
		log.info("Hello, world!!");

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("dao.xml");

		//ConnectionFactory factory = context.getBean(ConnectionFactory.class);
		//Connection connection = factory.getConnection();
		//log.info("" + (connection != null));
		context.close();

	}
}