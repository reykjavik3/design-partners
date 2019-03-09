package com.letcode;


import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


/**
 * create by murong
 * create in 2019-2-22
 */
public class TestSpring{

    public static void main(String[] args) {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        Teacher teacher = (Teacher)xmlBeanFactory.getBean("teacher");
        System.out.println(teacher.sayHello());
    }
}

