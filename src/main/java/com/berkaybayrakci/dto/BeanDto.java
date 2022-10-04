package com.berkaybayrakci.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder //Design Pattern yapısı

// DTO : Data Transfer Object
public class BeanDto {

    private Long id;
    private String beanName;
    private String beanData;

    //Initial
    public void initialBeanMethod() {
        log.info("Before the Bean starts");
        System.out.println("The method to run before the Bean starts");
    }

    //Destroy
    public void destroyBeanMethod() {
        log.info("After the Bean finished");
        System.err.println("The method to run after the Bean finished");

    }

}
