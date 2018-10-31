package com.micro.zuul;

import com.micro.zuul.error.ErrorFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@EnableZuulProxy
@SpringCloudApplication
public class GateWayApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(GateWayApplication.class);
    }

    @Bean
    public CommonsMultipartResolver getMultipartResolver() {
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        commonsMultipartResolver.setMaxUploadSize(524288000L);
        commonsMultipartResolver.setDefaultEncoding("UTF-8");
        return commonsMultipartResolver;
    }

    /**
     * 添加过滤器，打印路由错误原因
     *
     * @return
     */
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }

}
