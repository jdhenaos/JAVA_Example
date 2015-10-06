package data;

import data.Animal;

public abstract class Terrestre extends Animal{
	
	private String tipo;
	private String colorPelo;
	private String colorOjos;

	/////////////////////////////////////////
	
	public String getTipo(){
		return this.tipo;
	}
	public String getColorPelo(){
		return this.colorPelo;
	}
	public String getColorOjos(){
		return this.colorOjos;
	}
	

	//////////////////////////////////////////
	
	public void setTipo(String tipo){
		this.tipo=tipo;
	}
	public void setColorPelo(String colorPelo){
		this.colorPelo=colorPelo;
	}
	public void setColorOjos(String colorOjos){
		this.colorOjos=colorOjos;
	}
	
	////////////////////////////////////////////
	
	public Terrestre(){
		
	}

}
