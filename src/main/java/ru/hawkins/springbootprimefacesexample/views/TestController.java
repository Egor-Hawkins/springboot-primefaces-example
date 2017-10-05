package ru.hawkins.springbootprimefacesexample.views;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(value = "session")
public class TestController {
    private String someString;

    private static final Logger logger = LogManager.getLogger(TestController.class);

    @PostConstruct
    public void init() {
        logger.info("Test view created");
        someString  = "some string value from bean";
    }

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }
}
