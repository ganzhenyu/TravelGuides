package TravelGuide;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="TravelGuide.mapper")
public class TravelGuidesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelGuidesApplication.class, args);
	}
}
