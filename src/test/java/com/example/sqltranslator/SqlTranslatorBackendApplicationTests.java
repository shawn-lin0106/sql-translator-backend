package com.example.sqltranslator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class SqlTranslatorBackendApplicationTests {

    @Test
    void contextLoads() {
        // 测试Spring应用上下文能否正常加载
    }

}