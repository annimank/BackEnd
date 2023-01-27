package fi.haagahelia.handlinglists;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.handlinglists.domain.Student;
import fi.haagahelia.handlinglists.domain.StudentRepository;

@SpringBootApplication
public class HandlinglistsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HandlinglistsApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(StudentRepository repository) {
		return (args) -> {
			//code here
			//demo data
			Student s1 = new Student("Donna", "Davies");
			Student s2 = new Student("Jukkis", "Juhana");
			Student s3 = new Student("Nimi", "Niminen");
			
			repository.save(s1);
			repository.save(s2);
			repository.save(s3);
			
		};
	}

}
