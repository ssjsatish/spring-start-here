package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class SingletonBeanApplication {
    public static void main(String[] args) {
        System.out.println("Singleton behavior of Spring beans");
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var cs1 = context.getBean(CommentService.class);
        var cs2 = context.getBean(CommentService.class);
        boolean areSameObject = cs1==cs2;
        System.out.println(areSameObject);
    }
}
