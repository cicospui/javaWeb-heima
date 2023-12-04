package com.example.anexample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class AnexampleApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testUuid() {
        for(int i = 0; i < 100; i++) {
            System.out.println(UUID.randomUUID().toString());
        }
    }

}
