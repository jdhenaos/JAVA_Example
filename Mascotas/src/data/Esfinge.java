package data;

public final class Esfinge extends Gato{
	
	private String colorPiel;
	private String apodo;
	private boolean dependiente;
	
	//////////////////////////////////////////////////
	
	public String getColorPiel(){
		return this.colorPiel;
	}
	public String getApodo(){
		return this.apodo;
	}
	public boolean getDependiente(){
		return this.dependiente;
	}

	//////////////////////////////////////////
	
	public void setColorPiel(String colorPiel){
		this.colorPiel=colorPiel;
	}
	public void setApodo(String apodo){
		this.apodo=apodo;
	}
	public void setDependiente(boolean dependiente){
		this.dependiente=dependiente;
	}
	
	//////////////////////////////////////////
	
	public Esfinge(String nombre, int edad, String tamano, String tipo, String colorPelo, String colorOjos, boolean docil, boolean castrado, String pelaje, String colorPiel, String apodo,boolean dependiente ){
		
	 this.setApodo(apodo);
	 this.setCastrado(castrado);
	 this.setColorOjos(colorOjos);
	 this.setColorPelo(colorPelo);
	 this.setColorPiel(colorPiel);
	 this.setDependiente(dependiente);
	 this.setDocil(docil);
	 this.setEdad(edad);
	 this.setNombre(nombre);
	 this.setPelaje(pelaje);
	 this.setTamano(tamano);
	 this.setTipo(tipo);
		
	}
	
	@Override
	public String toString(){
		
		String docil;
		if(this.getDocil()){
			docil = "Si";
		}else{
			docil = "No";
		}
		
		String castrado;
		if(this.getCastrado()){
			castrado = "Si";
		}else{
			castrado = "No";
		}
		
		String dependiente;
		if(this.getDependiente()){
			dependiente = "Si";
		}else{
			dependiente = "No";
		}
		
		String a= "Esfinge: "+this.getNombre()+"\n"
				+ "Edad: "+this.getEdad()+"\n"
				+ "Tamano: "+this.getTamano()+"\n"
				+ "Docil: "+docil+"\n"
				+ "Castrado: "+castrado+"\n"
				+ "Pelaje: "+this.getPelaje()+"\n"
				+ "Color de Piel: "+this.getColorPiel()+"\n"
				+ "Apodo: "+this.getApodo()+"\n"
				+ "Dependiente: "+dependiente+"\n\n";
		return a;
	}

}
