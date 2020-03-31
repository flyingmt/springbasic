package kr.co.fastcampus.cli;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class A {
    private B b;

    public A(B b) {
        this.b = b;
    }

    void init() {
        log.info("init");
    }

    void destroy() {
        log.info("destroy");
    }
}
