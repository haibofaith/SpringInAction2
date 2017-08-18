package javaConfigComplex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
	//方案一、二都需要这个注入的对象这个方法支持
	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
	
	// 方案一
	// @Bean
	// public CDPlayer cdPlayer() {
	// return new CDPlayer(sgtPeppers());
	// }

	// 方案二
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		return new CDPlayer(compactDisc);
	}

}
