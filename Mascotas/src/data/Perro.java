package data;

public abstract class Perro extends Terrestre{
	
	private String raza;
	private boolean puro;
	private boolean entrenado;
	
	//////////////////////////////////////
	
	public String getRaza(){
		return this.raza;
	}
	public boolean getPuro(){
		return this.puro;
	}
	public boolean getEntrenado(){
		return this.entrenado;
	}
	

	//////////////////////////////////////////
	
	public void setRaza(String raza){
		this.raza=raza;
	}
	public void setPuro(boolean puro){
		this.puro=puro;
	}
	public void setEntrenado(boolean entrenado){
		this.entrenado=entrenado;
	}
	
	//////////////////////////////
	
	public Perro(){
		
	}

}
