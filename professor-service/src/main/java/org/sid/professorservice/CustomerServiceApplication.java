package org.sid.professorservice;

import org.sid.professorservice.entities.Professor;
import org.sid.professorservice.repository.ProfessorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;




@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	 @Bean
	    CommandLineRunner start(ProfessorRepository professorRepository, RepositoryRestConfiguration restConfiguration){
	        return args -> {
	        	restConfiguration.exposeIdsFor(Professor.class);
	        	professorRepository.save(new Professor(null,"Mohammed","DRISSI","Computer science assistant", "nabil.drissi@gmail.com", "91060034"));
	        	professorRepository.save(new Professor(null,"Sana","SALEM","Computer science assistant", "sana.salem@gmail.com", "98088034"));
	        	professorRepository.findAll().forEach(p->{
					System.out.println(p.getEmail());
				});
	        };
	    }
}
