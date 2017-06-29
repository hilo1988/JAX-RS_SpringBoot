package com.yoidukigembu.jaxsb.controller;

import com.yoidukigembu.jaxsb.model.db.entity.MUser;
import com.yoidukigembu.jaxsb.model.db.repository.UserRepository;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by hilo on 2017/06/30.
 */
@Path("/")
@Component
@Data
public class TestController {

    private final UserRepository repository;

    @GET
    public String index() {
        return "Hello World!";
    }
}
