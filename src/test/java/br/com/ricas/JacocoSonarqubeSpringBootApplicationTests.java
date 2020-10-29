package br.com.ricas;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
class JacocoSonarqubeSpringBootApplicationTests {

	@Test
	void contextLoads() {
		try {
			JacocoSonarqubeSpringBootApplication.main(new String[] {});
		} catch (Exception e) {
			fail(e);
		}
	}
}
