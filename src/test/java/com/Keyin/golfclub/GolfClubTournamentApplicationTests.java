package com.Keyin.golfclub;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class GolfClubTournamentApplicationTests {
    @Test
    void contextLoads() {
        // Basic test to ensure the application context loads
    }
}
