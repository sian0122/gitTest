package com.siao.chen.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */

//自動掃描 Spring Bean 元件
@SpringBootApplication
public class App 
{
	
    public static void main( String[] args )
    {
       SpringApplication.run(App.class, args);
    }
}
