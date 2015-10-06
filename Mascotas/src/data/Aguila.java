package data;

public class Aguila extends Volador {
	
	private int alturaVuelo;
	private double velocidad;
	private boolean agresividad;

	/////////////////////////////////////////
	
	public int getAlturaVuelo(){
		return this.alturaVuelo;
	}
	public double getVelocidad(){
		return this.velocidad;
	}
	public boolean getAgresividad(){
		return this.agresividad;
	}
	
	//////////////////////////////////////////
	
	public void setAlturaVuelo(int alturaVuelo){
		this.alturaVuelo=alturaVuelo;
	}
	public void setVelocidad(double velocidad){
		this.velocidad=velocidad;
	}
	public void setAgresividad(boolean agresividad){
		this.agresividad=agresividad;
	}
	
	//////////////////////////////////////////////
	
	public Aguila(	String nombre,
					int edad,
					String tamano,
					double tamanoAlas,
					String tamanoPico,
					String alimentacion,
					int alturaVuelo,
					double velocidad,
					boolean agresividad){
		
		this.setAgresividad(agresividad);
		this.setAlturaVuelo(alturaVuelo);
		this.setVelocidad(velocidad);
		this.setAlimentacion(alimentacion);
		this.setEdad(edad);
		this.setNombre(nombre);
		this.setTamano(tamanoPico);
		this.setTamanoAlas(tamanoAlas);
		this.setTamanoPico(tamanoPico);
		
	}
	
	
	@Override	
	public String toString(){
		
		String agresivo;
		if(this.getAgresividad()){
			agresivo= "Si";
		}
		else{
			agresivo="No";
		}
		
		String a= "Aguila: "+this.getNombre()+"\n"
				+ "Edad: "+this.getEdad()+"\n"
				+ "Tamano: "+this.getTamano()+"\n"
				+ "Tamano de Alas: "+this.getTamanoAlas()+"\n"
				+ "Tamano de Pico: "+this.getTamanoPico()+"\n"
				+ "Alimentacion: "+this.getAlimentacion()+"\n"
				+ "Altura de Vuelo: "+this.getAlturaVuelo()+"\n"
				+ "Velocidad: "+this.getVelocidad()+"\n"
				+ "Agresivo: "+agresivo+"\n\n";
		return a;
	}

}
