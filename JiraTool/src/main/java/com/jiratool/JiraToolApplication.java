package com.jiratool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.jiratool")
@EnableAsync
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
