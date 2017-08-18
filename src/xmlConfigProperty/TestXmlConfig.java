package xmlConfigProperty;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXmlConfig {
	@Test
	public void test() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xmlConfigProperty/applicationContext.xml");
		MediaPlayer cd = ctx.getBean(MediaPlayer.class);
		cd.play();
		ctx.close();
	}
}
