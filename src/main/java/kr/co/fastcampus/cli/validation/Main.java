package kr.co.fastcampus.cli.validation;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.validation.BindException;


@Slf4j
public class Main {
    public static void main(String[] args) {
        val person = new Person("", 200);
        val personValidator = new PersonValidator();
        if (personValidator.supports(person.getClass())) {
            BindException error = new BindException(person, "person");
            personValidator.validate(person, error);

            log.error(">> " + error.hasErrors());
            log.error("" + error.getAllErrors());
        } else {
            log.error("invalid class");
        }
    }
}
