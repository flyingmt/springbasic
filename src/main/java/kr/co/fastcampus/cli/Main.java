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

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppDefaultConfig.class, AppDevConfig.class);
		context.refresh();
		var dao = context.getBean(Dao.class);
		dao.run();

		context.close();

	}
}