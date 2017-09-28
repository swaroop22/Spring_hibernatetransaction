package com.boot.txmanage;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.boot"})
public class BootHibTransactionApplication {
	
	public static Logger log = Logger.getLogger(BootHibTransactionApplication.class);
	
	
	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(BootHibTransactionApplication.class, args);
		log.debug("Application Successfully Started");
		
		log.info("sessionFactory bean - "+getBeanDefs("sessionFactory"));
	}
	
	public static boolean getBeanDefs(String beanName) {
		if(applicationContext.containsBean(beanName)) {
			return true;
		}
		return false;
	}
}
