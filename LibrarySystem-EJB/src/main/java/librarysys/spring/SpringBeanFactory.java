package librarysys.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class SpringBeanFactory implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	public static Object getBean(String beanName){
		return applicationContext.getBean(beanName);
	}
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringBeanFactory.applicationContext = applicationContext;
	}

}
