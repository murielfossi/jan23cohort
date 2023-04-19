package com.codingdojo.com.zookeeper;

public class Gorilla extends Mammal {

	
	
	         //==========================================================
			//============CONSTRUCTOR===================================
			//===========================================================


	public Gorilla(String name) {
		super(name);
		
	}



			//===============================================================
			// =============METHODS=========================================
			//==============================================================

			

	public void throwThings() {
		this.energyLevel -= 5;
		System.out.printf("\n(This Gorilla) threw something! Energy has decreased by 5  it's now %d",this.energyLevel);
	}
	
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.printf("%s ate a banana and is satisfied! %s's energy level is now %d.\n", this.name, this.name, this.energyLevel);
	}
	
	public void climb() {
		this.energyLevel -= 10;
		System.out.printf("%s has climbed a tree! %s's energy level is now %d.\n", this.name, this.name, this.energyLevel);
	}

			//=====================================================
			//=================== GETTERS & SETTERS======================
			//===============================================================

	
	
	
	
	
	
	
	
}
