package data;

import data.Animal;

public abstract class Volador extends Animal {
	
	private double tamanoAlas;
	private String tamanoPico;
	private String alimentacion;

	/////////////////////////////////////////
	
	public double getTamanoAlas(){
		return this.tamanoAlas;
	}
	public String getTamanoPico(){
		return this.tamanoPico;
	}
	public String getAlimentacion(){
		return this.alimentacion;
	}
	
	//////////////////////////////////////////
	
	public void setTamanoAlas(double tamanoAlas){
		this.tamanoAlas=tamanoAlas;
	}
	public void setTamanoPico(String tamanoPico){
		this.tamanoPico=tamanoPico;
	}
	public void setAlimentacion(String alimentacion){
		this.alimentacion=alimentacion;
	}
	
	//////////////////////////////////////////////
	
	public Volador(){
		
	}

}
