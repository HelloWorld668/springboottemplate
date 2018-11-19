package com.xc.springboottemplate.web;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
/*
 * spring boot test mvc
 */
@SpringBootTest
public class HelloWorldControllerTest {
    
    private MockMvc mockMvc;
    
    @Before
    public void setup(){
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
    }
    @Test
    public void test() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello?name=test").accept(MediaType.APPLICATION_JSON_UTF8)).andDo(print());
    }
}
