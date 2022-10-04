package com.berkaybayrakci.bean;

import com.berkaybayrakci.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration  // Bean Configuration
public class BeanConfig {

    @Bean(initMethod = "initialBeanMethod", destroyMethod = "destroyBeanMethod")
    @Scope("singleton") // request - session


    public BeanDto beanDto() {

        return BeanDto.builder().id(0L).beanName("bean Name").beanData("bean Data").build();
    }
}
