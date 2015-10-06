package data;

public final class Siames extends Gato{

	private String enfermedad;
	private String caracter;
	private boolean fiel;
	
	//////////////////////////////////////////////////
	
	public String getEnfermedad(){
		return this.enfermedad;
	}
	public String getCaracter(){
		return this.caracter;
	}
	public boolean getFiel(){
		return this.fiel;
	}

	//////////////////////////////////////////
	
	public void setEnfermedad(String enfermedad){
		this.enfermedad=enfermedad;
	}
	public void setCaracter(String caracter){
		this.caracter=caracter;
	}
	public void setFiel(boolean fiel){
		this.fiel=fiel;
	}
	
	////////////////////////////////////////////
	
	public Siames(String nombre, int edad, String tamano, String tipo, String colorPelo, String colorOjos, boolean docil, boolean castrado, String pelaje, String enfermedad,String caracter,boolean fiel){
		
		this.setCaracter(caracter);
		this.setCastrado(castrado);
		this.setColorOjos(colorOjos);
		this.setColorPelo(colorPelo);
		this.setDocil(docil);
		this.setEdad(edad);
		this.setEnfermedad(enfermedad);
		this.setFiel(fiel);
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
		
		String fiel;
		if(this.getFiel()){
			fiel = "Si";
		}else{
			fiel= "No";
		}
		
		String a= "Siames: "+this.getNombre()+"\n"
				+ "Edad: "+this.getEdad()+"\n"
				+ "Tamano: "+this.getTamano()+"\n"
				+ "Docil: "+docil+"\n"
				+ "Castrado: "+castrado+"\n"
				+ "Pelaje: "+this.getPelaje()+"\n"
				+ "Enfermedad: "+this.getEnfermedad()+"\n"
				+ "Caracter: "+this.getCaracter()+"\n"
				+ "Fiel: "+fiel+"\n\n";
		return a;
				
	}
}
