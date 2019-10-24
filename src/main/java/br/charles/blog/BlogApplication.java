package br.charles.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	
}

//	insert two elements

//		@EnableMongoRepositories(basePackageClasses = UserRepository.class)
//		@Configuration
//		public class MongoDBConfig {
//		
//		
//		    @Bean
//		    CommandLineRunner commandLineRunner(UserRepository userRepository) {
//		        return strings -> {
//		            userRepository.save(new Users(1, "Peter", "Development", 3000L));
//		            userRepository.save(new Users(2, "Sam", "Operations", 2000L));
//		        };
//		    }
//		
//		}