package com.springservice.springe2eservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.springservice.springe2eservice.SpringE2EServiceApplication.helloWorld;

@SpringBootTest
class SpringE2EServiceApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void helloWorldTest() {
        assert helloWorld().equals("Hello World");
    }

    @Test
    void main() {
        SpringE2EServiceApplication.main(new String[] {});
    }
}
