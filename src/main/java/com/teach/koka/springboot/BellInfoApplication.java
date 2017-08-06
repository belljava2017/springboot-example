package com.teach.koka.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="com.teach.koka.springboot")
public class BellInfoApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(BellInfoApplication.class, args);
        System.out.println( "Hello World!" );
    }
}