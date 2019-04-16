package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    /*public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }*/

    public static void main(String[] args) {
        //定义5个大臣
        int ministerNum =5;
        for(int i=0;i<ministerNum;i++){
            Emperor emperor = Emperor.getInstance();
            System.out.print("第"+(i+1)+"个大臣参拜的是：");
            emperor.say();
        }
    }

}
