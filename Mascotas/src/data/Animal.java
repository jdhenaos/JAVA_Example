package data;

public abstract class Animal {
	
	private String nombre;
	private int edad;
	private String tamano;

	
	/////////////////////////////////////////
	
	public String getNombre(){
		return this.nombre;
	}
	public int getEdad(){
		return this.edad;
	}
	public String getTamano(){
		return this.tamano;
	}

	
	////////////////////////////////////////
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setEdad(int edad){
		this.edad=edad;
	}
	public void setTamano(String tamano){
		this.tamano=tamano;
	}
	
	///////////////////////////////////////
	
	public Animal(){
		
	}


}
