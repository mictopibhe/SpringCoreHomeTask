package pl.davidduke.homeproject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.davidduke.homeproject.config.Config;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		
		System.out.println(musicPlayer.playMusic());
		
		context.close();

	}

}
