package com.xxlai.demo.res;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xxlai.demo.service.IDemoService;

@Component
@Path("demo")
public class DemoRes {
	@Autowired
    IDemoService demoService;

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return demoService.say();

    }
}
