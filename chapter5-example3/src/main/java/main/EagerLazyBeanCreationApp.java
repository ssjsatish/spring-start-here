package main;

import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.UserService;

public class EagerLazyBeanCreationApp {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        // var commentSvc = context.getBean(CommentService.class);
        var userSvc = context.getBean(UserService.class);

    }
}
