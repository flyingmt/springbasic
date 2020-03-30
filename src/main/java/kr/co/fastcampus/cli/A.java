package kr.co.fastcampus.cli;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Slf4j
public class A {
    @Resource(name="appBeanB1") private B b;
    @Autowired private ApplicationContext context;
    @Value("${catalog.name}") String catalogName;
    @Value("#{systemProperties['java.home']}") String javaHome;

    @PostConstruct
    void init() {
        log.info("" + context);
        log.info("" + catalogName);
        log.info("" + javaHome);
    }
}
