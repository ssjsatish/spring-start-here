package services;

import org.springframework.stereotype.Component;

@Component
public class CommentService {
    public CommentService() {
        System.out.println("Created Comment Service without using @Lazy annotation.");
    }
}
