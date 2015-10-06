package data;

public class Quimera extends Legendario{
	
	private int cabezas;
	private String cuerpo;
	private String patas;
	
	/////////////////////////////////////////
	
	public int getCabezas(){
		return this.cabezas;
	}
	public String getCuerpo(){
		return this.cuerpo;
	}
	public String getPatas(){
		return this.patas;
	}
	
	//////////////////////////////////////////
	
	public void setCabezas(int cabezas){
		this.cabezas=cabezas;
	}
	public void setCuerpo(String cuerpo){
		this.cuerpo=cuerpo;
	}
	public void setPatas(String patas){
		this.patas=patas;
	}
	
	/////////////////////////////////////
	
	public Quimera(String nombre, int edad, String tamano, String origen, String habitat, String poder, int cabezas, String cuerpo, String patas){
		
		this.setCabezas(cabezas);
		this.setCuerpo(cuerpo);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setNombre(nombre);
		this.setOrigen(origen);
		this.setPatas(patas);
		this.setPoder(poder);
		this.setTamano(tamano);
		
	}
	
	@Override
	public String toString(){
		
		String a= "Quimera: "+this.getNombre()+"\n"
				+ "Edad: "+this.getEdad()+"\n"
				+ "Tamano: "+this.getTamano()+"\n"
				+ "Origen: "+this.getOrigen()+"\n"
				+ "Habitat: "+this.getHabitad()+"\n"
				+ "Poder: "+this.getPoder()+"\n"
				+ "Cabezas: "+this.getCabezas()+"\n"
				+ "Cuerpo: "+this.getCuerpo()+"\n"
				+ "Patas: "+this.getPatas()+"\n\n";
		return a;
	}
	
}
