package javaConfigSimple;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class TestJava {
	//简单对象（区别于有依赖的对象）
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void test() {
		//基于注解，自动装配1
		//assertNotNull(cd);
		cd.play();
	}
}
