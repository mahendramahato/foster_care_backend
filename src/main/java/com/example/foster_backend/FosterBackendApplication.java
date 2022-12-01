package com.example.foster_backend;

import com.example.foster_backend.model.AAnimal;
import com.example.foster_backend.model.AssignedAnimals;
import com.example.foster_backend.model.Client;
import com.example.foster_backend.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FosterBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FosterBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private AnimalRepository animalRepository;

	@Autowired
	private AAnimalRepository aAnimalRepository;

	@Autowired
	private AssignedAnimalsRepository assignedAnimalsRepository;

	@Override
	public void run(String... args) throws Exception {
//		Client client = new Client();
//		client.setFirstName("John");
//		client.setLastName("Doe");
//		client.setEmail("doe@gmail.com");
//		client.setCellPhone("337-238-8789");
//		client.setArea("Will be fostered inside the house");
//		client.setExperience("Have foster different animals");
//
//		AAnimal animal1 = new AAnimal();
//		animal1.setPetName("Goray");
//		animal1.setAnimalType("Bottle Baby Puppies");
//		animal1.setAssign_status("Yes");
//		animal1.setAppointment_information("No appointments");
//		animal1.setAppointment_scale("Low");
//
//		AAnimal animal2 = new AAnimal();
//		animal2.setPetName("Kaley");
//		animal2.setAnimalType("Bottle Baby Puppies");
//		animal2.setAssign_status("Yes");
//		animal2.setAppointment_information("No appointments");
//		animal2.setAppointment_scale("Low");
//
//		client.getAanimals().add(animal1);
//		client.getAanimals().add(animal2);
//
//		clientRepository.save(client);


//
//		AAnimal aAnimal = new AAnimal();
//		aAnimal.setAfirstName("John");
//		aAnimal.setAlastName("Doe");
//		aAnimal.setAemail("doe@gmail.com");
//		aAnimal.setAcellPhone("337-238-8789");
//		aAnimal.setAarea("Will be fostered inside the house");
//		aAnimal.setAexperience("Have foster different animals");
//
//		AssignedAnimals assignedAnimals1 = new AssignedAnimals();
//		assignedAnimals1.setPetName("Goray");
//		assignedAnimals1.setAnimalType("Bottle Baby Puppies");
//		assignedAnimals1.setAssign_status("Yes");
//		assignedAnimals1.setAppointment_information("No appointments");
//		assignedAnimals1.setAppointment_scale("Low");
//
//		AssignedAnimals assignedAnimals2 = new AssignedAnimals();
//		assignedAnimals2.setPetName("Kaley");
//		assignedAnimals2.setAnimalType("Bottle Baby Puppies");
//		assignedAnimals2.setAssign_status("Yes");
//		assignedAnimals2.setAppointment_information("No appointments");
//		assignedAnimals2.setAppointment_scale("Low");
//
//		aAnimal.getAanimals().add(assignedAnimals1);
//		aAnimal.getAanimals().add(assignedAnimals2);
//
//		aAnimalRepository.save(aAnimal);
	}
}
