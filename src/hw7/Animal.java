package hw7;

import java.io.Serializable;

public abstract class Animal implements Serializable{
	
	private static final long serialVersionUID = 1111L;
	
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void speak();

}
