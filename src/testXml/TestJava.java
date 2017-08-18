package testXml;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJava {
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void test() {
		//基于注解，自动装配2
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("testXml/applicationContext.xml");
		cd = ctx.getBean(CompactDisc.class);
		cd.play();
		ctx.close();
	}
}
