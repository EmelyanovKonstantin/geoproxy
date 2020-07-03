package ru.emelyanovkonstantin.geoproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import ru.emelyanovkonstantin.geoproxy.filter.pre.SimpleFilter;
/**
 * Created by EmelyanovKonstantin on 03.07.2020
 *
 * Simple GeoproxyApplication
 * @version 1.0
 */

@EnableZuulProxy
@SpringBootApplication
public class GeoproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeoproxyApplication.class, args);
	}
	@Bean
	public  SimpleFilter simpleFilter(){
		return  new SimpleFilter();
	}

}