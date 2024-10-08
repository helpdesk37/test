package com.jiratool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.jiratool")
public class JiraToolApplication /*implements CommandLineRunner*/{
	/*@Autowired
	private ApplicationContext applicationContext;*/

	public static void main(String[] args) {
		SpringApplication.run(JiraToolApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		Arrays.sort(beanDefinitionNames);
		for (String bean : beanDefinitionNames) {
			System.out.println(bean);
		}
	}*/

	
}
