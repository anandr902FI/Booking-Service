package com.upgrad.bookingservice.Booking.Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
@EnableFeignClients
@EnableAspectJAutoProxy
public class BookingServiceApplication {

    public static void main(String[] args) {

		SpringApplication.run(BookingServiceApplication.class, args);
    }

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

}
