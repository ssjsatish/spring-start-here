package main;

import config.AppConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class AopDemoApp {
    public static void main(String[] args) {
        System.out.println("Demostrating AOP in Spring");
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        var service = context.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setText("This is a demo of Spring AOP");
        comment.setAuthor("Satish Patel");
        service.publishComment(comment);

        // System.out.println(service.getClass());
    }
}
