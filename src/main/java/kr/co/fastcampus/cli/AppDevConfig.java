package kr.co.fastcampus.cli;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.sql.Connection;

@Configuration
@Profile("dev")
public class AppDevConfig {
    @Bean
    public B b() {
        return new B();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public A a(B b) {
        return new A(b);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public ConnectionFactory connectionFactory() {
        return new ConnectionFactory("org.h2.Driver", "jdbc:h2:file:~/test", "sa", "");
    }

    @Bean
    public Connection connection(ConnectionFactory connectionFactory) {
        return connectionFactory.getConnection();
    }

    @Bean
    public Dao dao(Connection connection) {
        return new Dao(connection);
    }
}
