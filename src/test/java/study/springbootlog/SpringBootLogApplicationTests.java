package study.springbootlog;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SpringBootLogApplicationTests {

	@Test
	@DisplayName("로깅 테스트")
	void loggingTest() {
		for (int i = 0; i < 10000; i++) {
			log.error("공습경보 {}", i + 1);
		}
	}

}
