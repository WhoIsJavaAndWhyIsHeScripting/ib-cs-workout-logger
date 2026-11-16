package ibcs.workout_logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class WorkoutLoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkoutLoggerApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(defaultValue = "Internet") String name) {
		return "Hello " + name;
	}

}
