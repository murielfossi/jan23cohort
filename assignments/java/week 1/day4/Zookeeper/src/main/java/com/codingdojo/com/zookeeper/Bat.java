package com.codingdojo.com.zookeeper;

public class Bat extends Mammal{


	
    //==========================================================
	//============CONSTRUCTOR===================================
	//===========================================================


	public Bat(String name) {
		super(name);
		
		this.energyLevel = 300;
	}



	//===============================================================
	// =============METHODS=========================================
	//==============================================================

	
	public void fly() {
		this.energyLevel -= 50;
		System.out.printf("\nThis Gorilla threw something! Energy has decreased by 50 to %d",this.energyLevel);
	}
	
	public void eatHumans() {
		this.energyLevel += 25;
		System.out.printf("\nThis Gorilla ate some bananas. Energy has increased by 25 to %d",this.energyLevel);
	}
	
	public void attackTown() {
		this.energyLevel -= 100;
		System.out.printf("\nThis Gorilla climbed a tree! Energy has decreased by 100 to %d",this.energyLevel);
	}


	//=====================================================
	//=================== GETTERS & SETTERS======================
	//===============================================================





	
	
	
}
