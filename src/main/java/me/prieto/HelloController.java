package me.prieto;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/hello")
public class HelloController {

    @Get(value = "/index")
    @Produces(MediaType.TEXT_PLAIN)
    public String index() {
        return "Hello world";
    }
}