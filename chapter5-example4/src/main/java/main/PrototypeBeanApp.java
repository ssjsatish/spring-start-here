package main;

import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class PrototypeBeanApp {
    public static void main(String[] args) {
        System.out.println("Demo of Prototype bean app");
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        var cs1 = context.getBean(CommentService.class);
        var cs2 = context.getBean(CommentService.class);

        boolean areBothSame = cs1 == cs2;

        System.out.println(areBothSame);
    }
}
