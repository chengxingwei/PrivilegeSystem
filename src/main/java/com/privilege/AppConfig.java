package com.privilege;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import java.io.FileInputStream;
import java.util.Properties;

@SpringBootApplication
@MapperScan("com.privilege.mapper")
public class AppConfig  extends  SpringBootServletInitializer{
    public  static  void main(String[] args) throws  Exception{
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("F:\\Intellij IDEA\\PrivilegeSystem\\src\\main\\resources\\application.properties");
        properties.load(fileInputStream);
        SpringApplication app = new SpringApplication(AppConfig.class);
        app.setDefaultProperties(properties);
        app.run(args);
    }
}
