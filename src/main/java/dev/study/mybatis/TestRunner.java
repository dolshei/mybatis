package dev.study.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;

@Component
public class TestRunner implements ApplicationRunner {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        // DataSource
        Connection connection = dataSource.getConnection();
        System.out.println("DBCP : " + dataSource.getClass());
        System.out.println("url : " + connection.getMetaData().getURL());
        System.out.println("UserName : = " + connection.getMetaData().getUserName());

        // JdbcTemplate
//        jdbcTemplate.execute("INSERT INTO Products (prod_name, prod_price) values ('버킷햇', 6900)");
    }
}
