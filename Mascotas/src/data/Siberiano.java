package data;

public class Siberiano extends Perro {
	
	private boolean pastoreo;
	private boolean musculoso;
	private boolean perroDeTrineo;
	
	///////////////////////////////////////
	
	public boolean getPastoreo(){
		return this.pastoreo;
	}
	public boolean getMusculoso(){
		return this.musculoso;
	}
	public boolean getPerroDeTrineo(){
		return this.perroDeTrineo;
	}
	

	//////////////////////////////////////////
	
	public void setPastoreo(boolean pastoreo){
		this.pastoreo=pastoreo;
	}
	public void setMusculoso(boolean musculoso){
		this.musculoso=musculoso;
	}
	public void setPerroDeTrineo(boolean perroDeTrineo){
		this.perroDeTrineo=perroDeTrineo;
	}
	
	///////////////////////////////////////////
	

	public Siberiano(	String nombre, 
						int edad, 
						String tamano, 
						String tipo,
						String colorPelo,
						String colorOjos,
						String raza,
						boolean puro, 
						boolean entrenado,
						boolean pastoreo, 
						boolean musculoso,
						boolean perroDeTrineo){
		
		
		this.setColorOjos(colorOjos);
		this.setColorPelo(colorPelo);
		this.setEdad(edad);
		this.setEntrenado(entrenado);
		this.setPastoreo(pastoreo);
		this.setNombre(nombre);
		this.setPuro(puro);
		this.setTipo(tipo);
		this.setMusculoso(musculoso);
		this.setPerroDeTrineo(perroDeTrineo);
		this.setTamano(tamano);
		this.setRaza(raza);
	}
	
	@Override
	public String toString(){
		
	String pastoreo;
	if(this.getPastoreo()){
		pastoreo = "Si";
	}else{
		pastoreo = "No";
	}
	
	String musculoso;
	if(this.getMusculoso()){
		musculoso = "Si";
	}else{
		musculoso = "No";
	}
	
	String perroDeTrineo;
	if(this.getPerroDeTrineo()){
		perroDeTrineo = "Si";
	}else{
		perroDeTrineo = "No";
	}
	
	String puro;
	if(this.getPuro()){
		puro = "Si";
	}else{
		puro = "No";
	}
	
	String entrenado;
	if(this.getEntrenado()){
		entrenado = "Si";
	}else{
		entrenado = "No";
	}
		
		String a= "Siberiano: "+this.getNombre()+"\n"
				+ "Edad: "+this.getEdad()+"\n"
				+ "Tamano: "+this.getTamano()+"\n"
				+"Tipo: "+this.getTipo()+"\n"
				+"Color de Pelo: "+this.getColorPelo()+"\n"
				+"Color de Ojos: "+this.getColorOjos()+"\n"
				+"Raza: "+this.getRaza()+"\n"
				+"Puro: "+puro+"\n"
				+"Entrenado: "+entrenado+"\n"
				+"Pastoreo: "+pastoreo+"\n"
				+"Musculoso: "+musculoso+"\n"
				+"Perro de Trineo: "+perroDeTrineo+"\n\n";
				
		return a;
	}

}
