package com.example.demo;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan(value={"com.example.demo.test.mapper"})
public class Demo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}

	/*
     * SqlSessionFactory 설정 
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
        
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        
        sessionFactory.setDataSource(dataSource);
        System.out.println("노트북 로직 수정"); // <<<<TEST        
        System.out.println("노트북 로직 수정2"); // <<<<TEST
        System.out.println("테탑 로직 수정"); // <<<<TEST
        System.out.println("테탑 로직 수정2"); // <<<<TEST
        System.out.println("노트북 로직 수정3"); // <<<<TEST
        System.out.println("노트북 로직 수정4"); // <<<<TEST
        System.out.println("테탑 로직 수정3"); // <<<<TEST

        return sessionFactory.getObject();
    }
}
