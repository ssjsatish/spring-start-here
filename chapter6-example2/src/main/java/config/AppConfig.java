package config;

import aop.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "services")
@EnableAspectJAutoProxy
public class AppConfig {
    // adding LoggingAspect to Spring context since @Aspect annotation is not stereotype
    @Bean
    public LoggingAspect aspect() {
        return new LoggingAspect();
    }
}
