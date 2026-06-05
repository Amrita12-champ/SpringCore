package com.amrita;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.amrita.Entity.Car;
import com.amrita.Entity.Engine;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext ab = new ClassPathXmlApplicationContext("config.xml");

        Engine eng = ab.getBean("engine", Engine.class);
        Car car = ab.getBean("car", Car.class);
        car.SelfStart();
    }
}