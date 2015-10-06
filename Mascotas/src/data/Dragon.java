package data;

import data.Legendario;

public class Dragon extends Legendario{
	
	private String simbolismo;
	private String tipoPiel;
	private String mitologia;
	
	//////////////////////////////////////////////////
	
	public String getSimbolismo(){
		return this.simbolismo;
	}
	public String getTipoPiel(){
		return this.tipoPiel;
	}
	public String getMitologia(){
		return this.mitologia;
	}

	//////////////////////////////////////////
	
	public void setSimbolismo(String simbolismo){
		this.simbolismo=simbolismo;
	}
	public void setTipoPiel(String tipoPiel){
		this.tipoPiel=tipoPiel;
	}
	public void setMitologia(String mitologia){
		this.mitologia=mitologia;
	}
	
	////////////////////////////////////
	
	public Dragon(String nombre, int edad, String tamano, String origen, String habitat, String poder, String simbolismo, String tipoPiel, String mitologia){
		
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setMitologia(mitologia);
		this.setNombre(nombre);
		this.setOrigen(origen);
		this.setPoder(poder);
		this.setSimbolismo(simbolismo);
		this.setTamano(tamano);
		this.setTipoPiel(tipoPiel);
	}
	
	@Override
	public String toString(){
		
		String a= "Dragont: "+this.getNombre()+"\n"
				+ "Edad: "+this.getEdad()+"\n"
				+ "Tamano: "+this.getTamano()+"\n"
				+ "Origen: "+this.getOrigen()+"\n"
				+ "Habitat: "+this.getHabitad()+"\n"
				+ "Poder: "+this.getPoder()+"\n"
				+ "Simbolismo: "+this.getSimbolismo()+"\n"
				+ "Tipo de Piel: "+this.getTipoPiel()+"\n"
				+ "Mitologia: "+this.getMitologia()+"\n\n";
		return a;
	}

}
