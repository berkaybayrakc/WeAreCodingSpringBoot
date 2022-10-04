package com.berkaybayrakci.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@Controller
public class PostConstructTutorials {



/*    @Autowired
    Logger LOG;

    //because "this.LOG" is null ERROR
    // No Args Constructor
    public PostConstructTutorials() {
        LOG.info("Log info called");
    }

    @PostConstruct
    public void init() {
        LOG.info("log info called");
    }


    public static void main(String[] args) {
        PostConstructTutorials beanController = new PostConstructTutorials();
        System.out.println(beanController);
    }*/

}
