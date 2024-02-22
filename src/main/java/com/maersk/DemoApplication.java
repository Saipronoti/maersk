package com.maersk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RestController
	public static class MyController {
		@GetMapping("/demo")
		public Mono<String> greetingMessage(){
			return computeMessage();
		}

		private Mono<String> computeMessage(){
			return Mono.just("Hello");
		}
	}

}
