package main;

import aop.LoggingAspect;
import config.AppConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

import java.util.logging.Logger;

public class SpringAopApplication {
    public static void main(String[] args) {
        final Logger logger = Logger.getLogger(LoggingAspect.class.getName());
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        var commentService = context.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setAuthor("Satish Patel");
        comment.setText("This is a demo for explaining Spring AOP feature.");
        String value = commentService.publishComment(comment);
        logger.info(value);
    }
}
