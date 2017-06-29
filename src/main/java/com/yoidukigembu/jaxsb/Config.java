package com.yoidukigembu.jaxsb;

import com.yoidukigembu.jaxsb.controller.TestController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Created by hilo on 2017/06/30.
 */
@Component
@ApplicationPath("/")
public class Config extends ResourceConfig {
    public Config() {
        packages(TestController.class.getPackage().getName());
    }
}
