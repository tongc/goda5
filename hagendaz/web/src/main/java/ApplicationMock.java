import com.goda5.hagendaz.web.controller.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import java.util.Arrays;

/**
 * Created by tong on 24/10/2015.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.goda5.hagendaz.web.controller"}, includeFilters = @ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE, value={TestController.class}))
public class ApplicationMock {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ApplicationMock.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
