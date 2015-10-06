package data;

import data.Animal;

public abstract class Legendario extends Animal {
	
	private String origen;
	private String habitat;
	private String poder;
	
	/////////////////////////////////////////
	
	public String getOrigen(){
		return this.origen;
	}
	public String getHabitad(){
		return this.habitat;
	}
	public String getPoder(){
		return this.poder;
	}
	
	//////////////////////////////////////////
	
	public void setOrigen(String origen){
		this.origen=origen;
	}
	public void setHabitat(String habitat){
		this.habitat=habitat;
	}
	public void setPoder(String poder){
		this.poder=poder;
	}
	
	/////////////////////////////////////////
	
	public Legendario(){
		
	}

}
