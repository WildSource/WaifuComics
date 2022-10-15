package com.waifucomics.waifuwebapp;

import com.waifucomics.waifuwebapp.entitites.Comic;
import com.waifucomics.waifuwebapp.repositories.ComicRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WaifuComicsApplication
{
	public static void main(String[] args) {
		SpringApplication.run(WaifuComicsApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ComicRepository repository)
	{
		return (args) ->
		{
			System.out.println(repository.findAll());
		};
	}
}