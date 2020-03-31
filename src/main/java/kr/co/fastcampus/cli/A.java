package kr.co.fastcampus.cli;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Slf4j
@Component
public class A {
    @Resource private B b;
    @Autowired private ApplicationContext context;
    @Value("${catalog.name}") String catalogName;
    @Value("#{systemProperties['java.home']}") String javaHome;
    @Value("#{systemProperties['hello']}") String hello;

    @PostConstruct
    void init() {
        log.info("" + context);
        log.info("" + catalogName);
        log.info("" + javaHome);
        log.info("" + hello);
    }

    @PreDestroy
    void destroy() {
        log.info("destroy");
    }
}
