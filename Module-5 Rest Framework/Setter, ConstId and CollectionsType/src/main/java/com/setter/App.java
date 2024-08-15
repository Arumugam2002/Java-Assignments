
package com.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext con = new ClassPathXmlApplicationContext("com/setter/Config.xml");
        Student student = (Student) con.getBean("stud");

        System.out.println(student);  
    }
}

