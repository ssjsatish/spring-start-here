package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class DIWithFrameworkAbstractionApplication {
    public static void main(String[] args) {
        System.out.println("Dependency Injection with abstraction");
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var comment = new Comment();
        comment.setText("This is demo of DI with framework using Abstraction");
        comment.setAuthor("Satish Patel");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
