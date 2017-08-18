package xmlConfigSimple;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJava {
	//简单对象（区别于有依赖的对象）
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void test() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xmlConfigSimple/applicationContext.xml");
		cd = (CompactDisc) ctx.getBean("compactDisc");
		cd.play();
		ctx.close();
	}
}
