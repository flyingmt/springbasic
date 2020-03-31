package kr.co.fastcampus.cli;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.sql.SQLException;

@Slf4j
class Main {
	public static void main(String[] args) throws SQLException {
		log.info("Hello, world!!");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//context.register(AppConfig.class);
		context.scan("kr.co.fastcampus.cli");
		context.refresh();

		val b = context.getBean(B.class);
		log.info("" + b);

		context.close();

	}
}