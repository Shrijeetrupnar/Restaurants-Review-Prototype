package com.restaurantsreview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.restaurantsreview.web.RestaurantInfoController.java"})
public class RestaurantsreviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantsreviewApplication.class, args);
	}

}
