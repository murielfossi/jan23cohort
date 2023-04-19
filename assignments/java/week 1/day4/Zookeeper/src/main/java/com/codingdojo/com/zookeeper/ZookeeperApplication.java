package com.codingdojo.com.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZookeeperApplication {

	public static void main(String[] args) {
		
		
		Gorilla JB = new Gorilla("JB");
		JB.throwThings();
		JB.throwThings();
		JB.throwThings();
		
		JB.eatBananas();
		JB.eatBananas();
		
		JB.climb();
		SpringApplication.run(ZookeeperApplication.class, args);
		
		
		
		
		
		Bat Hercule = new Bat("Hercule");
		Hercule.attackTown();
		Hercule.attackTown();
		Hercule.attackTown();
		
		Hercule.eatHumans();
		Hercule.eatHumans();
		
		Hercule.fly();
		Hercule.fly();
		Hercule.displayEnergy();
	
	}

}
