package com.wozu.todo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@PropertySource("/secrets.properties")
@Configuration
public class PropConfig {

    @Autowired
    Environment environment;

}
