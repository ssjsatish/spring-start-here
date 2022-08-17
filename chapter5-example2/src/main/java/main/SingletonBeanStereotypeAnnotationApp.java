package main;

import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

public class SingletonBeanStereotypeAnnotationApp {
    public static void main(String[] args) {
        System.out.println("Singleton bean using stereotype annotation");
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        var service1 = context.getBean(UserService.class);
        var service2 = context.getBean(CommentService.class);

        boolean areBothServiceSame = service1.getCommentRepository() == service2.getCommentRepository();

        System.out.println(areBothServiceSame);
    }
}
