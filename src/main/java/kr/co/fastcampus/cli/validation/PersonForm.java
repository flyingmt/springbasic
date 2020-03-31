package kr.co.fastcampus.cli.validation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
public class PersonForm {
    @NotNull
    @Size(max=3)
    private String name;

    @Min(0)
    private int age;
}