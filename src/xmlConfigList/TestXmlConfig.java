package xmlConfigList;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXmlConfig {
	@Test
	public void test() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xmlConfigList/applicationContext.xml");
		CompactDisc cd = ctx.getBean(CompactDisc.class);
		cd.play();
		ctx.close();
	}
}
