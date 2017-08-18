package javaConfigSimple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class CDPlayerConfig {
	// @Bean
	// public CompactDisc sgtPeppers(){
	// return new SgtPeppers();
	// }
	
	// 通过Java代码装配Bean
	@Bean
	public CompactDisc randomBeatlesCD() {
		int choice = (int) Math.floor(Math.random() * 4);
		switch (choice) {
		case 0:
			return new SgtPeppers();
		case 1:
			return new WhiteAlbum();
		case 2:
			return new HardDayNight();
		default:
			return new SgtPeppers();
		}

	}
}
