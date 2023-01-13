package ma.app.studentsapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import ma.app.studentsapp.entities.Student;
import ma.app.studentsapp.repositories.StudentRepository;

@SpringBootApplication
//@ComponentScan(basePackages = {"ma.app.productsapp.ProductsAppApplication"})
public class ProductsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductsAppApplication.class, args);
    }
    
    @Autowired
	private StudentRepository studentRepository;
    
    @Bean
    CommandLineRunner start(StudentRepository studentRepository){
        return args -> {
        	studentRepository.save(new Student(null,"Nabil","drissi", "nabil.drissi@gmail.com", "91060034"));
        	studentRepository.save(new Student(null,"Mouna","salem", "mouna.salem@gmail.com", "93760034"));
        	studentRepository.save(new Student(null,"Ahmed","hamed", "ahmed.hamed@gmail.com", "93778034"));
        	studentRepository.findAll().forEach(p->{
				System.out.println(p.getEmail());
			});
        };
    }
 
}
