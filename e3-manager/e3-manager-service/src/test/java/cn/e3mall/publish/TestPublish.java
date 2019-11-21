package cn.e3mall.publish;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPublish {
	@Test
	public void publishService() throws Exception {
//		这个方法可以用来发布服务，表示服务的发布和tomcat没有关系
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		System.out.println("服务已经启动。。。。");
//		需要键盘敲入回车才能够结束
		System.in.read();
		System.out.println("服务已经关闭");
		
	}
}
