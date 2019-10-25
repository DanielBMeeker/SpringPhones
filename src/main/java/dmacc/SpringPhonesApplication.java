package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Phone;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PhoneRepository;

@SpringBootApplication
public class SpringPhonesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringPhonesApplication.class, args);
//ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//		
//		Phone p = appContext.getBean("phone", Phone.class);
//		
//		System.out.println(p.toString());
	}

	@Autowired
	PhoneRepository repo;

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		//This Phone P will add the phone we made in the bean configuration to the database
		Phone p = appContext.getBean("phone", Phone.class);
		repo.save(p);
		//This Phone D will not use the bean but instead the phone we create with this constructor
		//to persist to the database
		Phone d = new Phone("515-123-4567", "Samsung", "Galaxy S10", 64);
		repo.save(d);
		List<Phone> allPhones = repo.findAll();
		for (Phone phone : allPhones) {
			System.out.println(phone.toString());
		}
		((AnnotationConfigApplicationContext) appContext).close();
	}
}
