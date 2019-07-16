package com.yonye.spring.test;

import com.yonye.spring.dev.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {

@Test
    public void before(){
    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring-context.xml");

    Hello hello=(Hello) applicationContext.getBean("hello");
    hello.SetInfo("wuhu");
    System.out.println("sdfsdf");
    System.out.print(hello.getInfo());


}
}

