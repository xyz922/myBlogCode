package cn.xyz.blog.code;

import cn.xyz.blog.code.listener.ApplicationStartedEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author: xuyuzhen
 * @date: 2022/11/6
 */
@SpringBootApplication
public class AppMain extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(AppMain.class);
        ApplicationStartedEventListener asel = new ApplicationStartedEventListener();
        app.addListeners(asel);
        app.run(args);
    }

}
