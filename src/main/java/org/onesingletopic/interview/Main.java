package org.onesingletopic.interview;


import org.onesingletopic.interview.utils.InterviewService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("New Assignment using dependency injection with spring !");
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            InterviewService interviewService = context.getBean(InterviewService.class);

            for (Integer i : interviewService.dummy_function(10)) {
                System.out.println("i = " + i);
            }
        }


    }
}