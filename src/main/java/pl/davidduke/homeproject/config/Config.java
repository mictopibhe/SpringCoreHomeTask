package pl.davidduke.homeproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import pl.davidduke.homeproject.Music;
import pl.davidduke.homeproject.MusicPlayer;
import pl.davidduke.homeproject.genres.*;


import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class Config {
	@Bean
	@Scope("prototype")
	public ClassicalMusic classicalMusic() {
		return new ClassicalMusic();
	}

	@Bean
	public RockMusic rockMusic() {
		return new RockMusic();
	}

	@Bean
	public PopMusic popMusic() {
		return new PopMusic();
	}

	@Bean
	public List<Music> listRadioStation() {
		return Arrays.asList(classicalMusic(), rockMusic(), popMusic());
	}

	@Bean
	public MusicPlayer musicPlayer() {
		return new MusicPlayer(listRadioStation());
	}

}
