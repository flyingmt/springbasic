package kr.co.fastcampus.cli;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.sql.SQLException;

@Slf4j
@Configuration
@ComponentScan(basePackageClasses = Main.class)
class Main {
	public static void main(String[] args) throws SQLException {
		log.info("Hello, world!!");

		//ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("dao.xml");
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		val b = context.getBean(B.class);
		log.info("" + b);

		//ConnectionFactory factory = context.getBean(ConnectionFactory.class);
		//Connection connection = factory.getConnection();
		//log.info("" + (connection != null));
		context.close();

	}
}