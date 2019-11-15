package com.gaoxiong.read_write;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author gaoxiong
 * @ClassName Main
 * @Description
 * @date 2019/11/15 11:23
 */
@SpringBootApplication
@MapperScan({"com.gaoxiong.read_write.dao"})
public class Main {
    public static void main ( String[] args ) {
        SpringApplication.run(Main.class, args);
    }
}
