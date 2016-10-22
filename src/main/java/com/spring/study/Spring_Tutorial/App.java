package com.spring.study.Spring_Tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext con=new FileSystemXmlApplicationContext("beans.xml");
	
        Person person=(Person)con.getBean("person");
        person.Spreak();
    }
}
