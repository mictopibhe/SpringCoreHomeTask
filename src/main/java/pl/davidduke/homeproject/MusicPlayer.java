package pl.davidduke.homeproject;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;

public class MusicPlayer {

	private List<Music> musicGenres;
	
	@Value("${musicPlayer.volume}")
	private int volume;

	public MusicPlayer(List<Music> musicGenres) {
		super();
		this.musicGenres = musicGenres;
	}
	

	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String playMusic() {
		Random random = new Random();
		return "Playing " + musicGenres.get(random.nextInt(musicGenres.size())).getSong() + ". With volume " + volume;
	}
}
