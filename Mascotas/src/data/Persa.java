package data;

public final class Persa extends Gato{
	
	private String cabeza;
	private String hocico;
	private boolean macizo;
	
	//////////////////////////////////////////////////
	
	public String getCabeza(){
		return this.cabeza;
	}
	public String getHocico(){
		return this.hocico;
	}
	public boolean getMacizo(){
		return this.macizo;
	}

	//////////////////////////////////////////
	
	public void setCabeza(String cabeza){
		this.cabeza=cabeza;
	}
	public void setHocico(String hocico){
		this.hocico=hocico;
	}
	public void setMacizo(boolean macizo){
		this.macizo=macizo;
	}
	
	////////////////////////////////////////
	
	public Persa(String nombre, int edad, String tamano, String tipo, String colorPelo, String colorOjos, boolean docil, boolean castrado, String pelaje, String cabeza,String hocico,boolean macizo){
		
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setTamano(tamano);
		this.setCabeza(cabeza);
		this.setCastrado(castrado);
		this.setColorOjos(colorOjos);
		this.setColorPelo(colorPelo);
		this.setDocil(docil);
		this.setHocico(hocico);
		this.setMacizo(macizo);
		this.setPelaje(pelaje);
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
		
		String macizo;
		if(this.getMacizo()){
			macizo = "Si";
		}else{
			macizo = "No";
		}
		
		String a= "Persa: "+this.getNombre()+"\n"
				+ "Edad: "+this.getEdad()+"\n"
				+ "Tamano: "+this.getTamano()+"\n"
				+ "Docil: "+docil+"\n"
				+ "Castrado: "+castrado+"\n"
				+ "Pelaje: "+this.getPelaje()+"\n"
				+ "Cabeza: "+this.getCabeza()+"\n"
				+ "Hocico: "+this.getHocico()+"\n"
				+ "Macizo: "+macizo+"\n\n";
		return a;
	}

}
