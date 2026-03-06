package org.example;

import org.example.model.Manager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("/spring.xml");
//        Manager manager1 = context.getBean("manager", Manager.class);
//        manager1.work();
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Manager m1 = (Manager) context.getBean("manager");
        m1.work();
        }
    }

