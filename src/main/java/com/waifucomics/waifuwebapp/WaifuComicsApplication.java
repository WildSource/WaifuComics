package com.waifucomics.waifuwebapp;

import com.waifucomics.waifuwebapp.artist.Artist;
import com.waifucomics.waifuwebapp.artist.ArtistRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WaifuComicsApplication
{
	public static void main(String[] args) {
		SpringApplication.run(WaifuComicsApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ArtistRepository repository)
	{
		return (args) ->
		{
			repository.deleteAll();
			System.out.println(repository.findAll());
		};
	}
}