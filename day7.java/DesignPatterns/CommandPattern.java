package DesignPatterns;
//Behavioural design pattern-It is concerned with the interaction and responsibility of objects.
//In these design patterns, the interaction between the objects should be in such a way that they can easily talk to each other and still should be loosely coupled.
// Command design pattern is used to implement loose coupling in a request-response model.

// An interface for command
interface Command
{
	public void execute();
}

// Light class and its corresponding command classes
class Light
{
	public void on()
	{
		System.out.println("Light is on");
	}
	public void off()
	{
		System.out.println("Light is off");
	}
}
class LightOnCommand implements Command
{
	Light light;

	// The constructor is passed to light it on.
	public LightOnCommand(Light light)
	{
	this.light = light;
	}
	public void execute()
	{
	light.on();
	}
}
class LightOffCommand implements Command
{
	Light light;
	public LightOffCommand(Light light)
	{
		this.light = light;
	}
	public void execute()
	{
		light.off();
	}
}

// Functions and its command classes
class Functions
{
	public void on()
	{
		System.out.println("functions is on");
	}
	public void off()
	{
		System.out.println("functions is off");
	}
	public void setCD()
	{
		System.out.println("functions is set " +
						"for CD input");
	}
	public void setDVD()
	{
		System.out.println("functions is set"+
						" for DVD input");
	}
	public void setRadio()
	{
		System.out.println("functions is set" +
						" for Radio");
	}
	public void setVolume(int volume)
	{
	// code to set the volume
	System.out.println("functions volume set"
						+ " to " + volume);
	}
}
class FunctionsOffCommand implements Command
{
	Functions functions;
	public FunctionsOffCommand(Functions functions)
	{
		this.functions = functions;
	}
	public void execute()
	{
		functions.off();
	}
}
class FunctionsOnWithCDCommand implements Command
{
	Functions functions;
	public FunctionsOnWithCDCommand(Functions functions)
	{
		this.functions = functions;
	}
	public void execute()
	{
		functions.on();
		functions.setCD();
		functions.setVolume(11);
	}
}

// A Simple remote control class with one button
class SimpleRemoteControl
{
	Command slot; // only one button

	public SimpleRemoteControl()
	{
	}

	public void setCommand(Command command)
	{
		// set the command the remote will execute
		slot = command;
	}

	public void buttonWasPressed()
	{
		slot.execute();
	}
}

class CommandPattern
{
	public static void main(String[] args)
	{
		SimpleRemoteControl remote =new SimpleRemoteControl();
		Light light = new Light();
		Functions functions = new Functions();

		// we can change command dynamically
		remote.setCommand(new
					LightOnCommand(light));
		remote.buttonWasPressed();
		remote.setCommand(new
		FunctionsOnWithCDCommand(functions));
		remote.buttonWasPressed();
		remote.setCommand(new
		FunctionsOffCommand(functions));
		remote.buttonWasPressed();
	}
}
