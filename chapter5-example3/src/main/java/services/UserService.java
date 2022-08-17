package services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class UserService {
    public UserService() {
        System.out.println("User Service is created lazily using @Lazy annotation.");
    }
}
