package com.example.micronaut

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/")
class HelloController {

    @Get("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    fun index(): Map<String, String> {
        return mapOf("message" to "Hello, world!")
    }

    @Get("/fail")
    fun fail(){
        throw Exception("fails")
    }

}
