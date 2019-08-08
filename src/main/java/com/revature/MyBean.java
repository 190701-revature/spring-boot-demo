package com.revature;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("tomcat")
public class MyBean {

}
