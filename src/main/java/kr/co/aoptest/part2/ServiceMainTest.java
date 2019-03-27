package kr.co.aoptest.part2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ServiceMainTest {

	public static void main(String[] args) {
		
		String aop="src/main/java/kr/co/aoptest/part2/aop.xml";
		ApplicationContext context=new FileSystemXmlApplicationContext(aop);
		
		// POJO방식 객체 생성
		// Service svc=new ServiceImp();
		
		// Spring bean방식 객체 생성
		Service svc=(Service)context.getBean("serviceImp");
		
		svc.first();
		svc.first("korea");
		
		svc.second();
		
		
	}
}
