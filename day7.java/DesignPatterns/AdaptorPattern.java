package DesignPatterns;
//structural design pattern-It is concerned with how classes and objects can be composed, to form larger structures.
//The structural design patterns simplifies the structure by identifying the relationships.
//These patterns focus on, how the classes inherit from each other and how they are composed from other classes.
//An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly.
interface Bird
{
	// birds implement Bird interface that allows
	// them to fly and make sounds adapteive interface
	public void fly();
	public void makeSound();
}

class Sparrow implements Bird
{
	// a concrete implementation of bird
	public void fly()
	{
		System.out.println("Flying");
	}
	public void makeSound()
	{
		System.out.println("Chirp Chirp");
	}
}

interface ToyDuck
{
	// target interface
	// toyducks dont fly they just make
	// squeaking sound
	public void squeak();
}

class PlasticToyDuck implements ToyDuck
{
	public void squeak()
	{
		System.out.println("Squeak");
	}
}

class BirdAdapter implements ToyDuck
{
	// We need to implement the interface for client expects to use.
	Bird bird;
	public BirdAdapter(Bird bird)
	{
		// we need reference to the object we are adapting
		this.bird = bird;
	}

	public void squeak()
	{
		// translate the methods appropriately
		bird.makeSound();
	}
}

class AdapterPattern
{
	public static void main(String args[])
	{
		Sparrow sparrow = new Sparrow();
		ToyDuck toyDuck = new PlasticToyDuck();

		// Wrap a bird in a birdAdapter so that it behaves like toy duck
		ToyDuck birdAdapter = new BirdAdapter(sparrow);

		System.out.println("Sparrow...");
		sparrow.fly();
		sparrow.makeSound();

		System.out.println("ToyDuck...");
		toyDuck.squeak();

		// toy duck behaving like a bird
		System.out.println("BirdAdapter...");
		birdAdapter.squeak();
	}
}
