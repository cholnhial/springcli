package com.cholnhial.springcli;

import com.cholnhial.springcli.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringcliApplication implements CommandLineRunner {

	@Autowired
	private FeedbackService feedbackService;

	public static void main(String[] args) {
		SpringApplication.run(SpringcliApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Arrays.stream(args).forEach(System.out::println);
		var feedbacks = feedbackService.getAllFeedbacks();
		feedbacks.forEach(f -> System.out.println(f.getFeedback()));
	}
}
