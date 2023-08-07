package com.example.jenkinsmaven;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class JenkinsTest {

    @Test
    void testApplicaiton(){
        assertEquals(true, true);
    }

}
