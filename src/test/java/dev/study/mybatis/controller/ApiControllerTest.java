package dev.study.mybatis.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class ApiControllerTest {

    @Autowired
    ApiController apiController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getMockMvcTest() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/api"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("MockMVC TEST"));
    }

}
