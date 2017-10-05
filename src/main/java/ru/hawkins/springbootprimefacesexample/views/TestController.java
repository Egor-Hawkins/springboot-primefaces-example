package ru.hawkins.springbootprimefacesexample.views;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(value = "session")
public class TestController {
    private String someString;

    @PostConstruct
    public void init() {
        someString  = "some string value from bean";
    }

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }
}
