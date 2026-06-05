package com.amrita;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.amrita.Entity.Student;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext ab = new ClassPathXmlApplicationContext("Config.xml");
        Student s = (Student) ab.getBean("student");
        s.display();
    }
}