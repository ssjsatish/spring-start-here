package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class DemoApp {
    public static void main(String[] args) {
        System.out.println("Using multiple beans of same type with abstraction IoC");
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var commentService = context.getBean(CommentService.class);
        var commnet = new Comment();
        commnet.setAuthor("Satish Patel");
        commnet.setText("Using multiple beans of same type ");
        commentService.publishComment(commnet);
    }
}
