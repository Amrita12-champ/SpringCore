package com.amrita;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.amrita.Entity.Student;
public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        Student s = context.getBean("student", Student.class);
        System.out.println(s);

        s.display();

        context.close();
    }
}