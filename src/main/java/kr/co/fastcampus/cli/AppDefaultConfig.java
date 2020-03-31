package kr.co.fastcampus.cli;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import java.sql.Connection;

@Configuration
@Profile("default")
@PropertySource("classpath:application.properties")
public class AppDefaultConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public ConnectionFactory connectionFactory(
            @Value("${jdbc.driver-class}") String driverClass,
            @Value("${jdbc.url}") String url,
            @Value("${jdbc.user}") String user,
            @Value("${jdbc.password}") String password

    ) {
        return new ConnectionFactory(driverClass, url, user, password);
    }
}
