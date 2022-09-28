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
			repository.save(new Comic("Game Of Thrones", 300, "George R. R. Martin"));
			repository.save(new Comic("The Hobbit", 250, "J R. R. Tolkien"));
			repository.save(new Comic("Harry Potter", 320, "J. K. Rowling"));
			repository.save(new Comic("The Shining", 180, "Stephen King"));
			repository.save(new Comic("Overlord", 120, "Kugane Maruyama"));

			System.out.println(repository.findAll());
		};
	}
}