package com.boot;

import org.apache.catalina.Context;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author xfan
 * @version created on 2017/12/21 -- 14:18
 * @discription spring boot application entrance
 */

@SpringBootApplication
@EnableScheduling
public class SpringBootLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLearningApplication.class, args);
    }

    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();

        TomcatContextCustomizer contextCustomizer = new TomcatContextCustomizer() {
            @Override
            public void customize(Context context) {
            // TODO Auto-generated method stub
                context.addWelcomeFile("/templates/index.jsp");
            }
        };
        factory.addContextCustomizers(contextCustomizer);

        return factory;
    }

}
