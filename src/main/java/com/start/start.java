package com.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Administrator on 2017/6/26 0026.
 */
@EnableJpaRepositories(basePackages = "com.*")
@ComponentScan("com.*")
@EntityScan("com.*")
@EnableTransactionManagement
@SpringBootApplication
public class start extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(start.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(start.class,args);
    }

}
