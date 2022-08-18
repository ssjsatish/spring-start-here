package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import services.CommentService;

@Configuration
@ComponentScan(basePackages = "services")
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public LoggingAspect aspect() {
        return new LoggingAspect();
    }
}
