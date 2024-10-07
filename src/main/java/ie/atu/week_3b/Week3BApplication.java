package ie.atu.week_3b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week3BApplication {
	public static void main(String[] args) {
		SpringApplication.run(Week3BApplication.class, args);
	}
}
