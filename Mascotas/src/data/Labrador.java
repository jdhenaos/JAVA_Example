package data;

public class Labrador extends Perro {
	
	private boolean perroDeAyuda;
	private boolean obesidad;
	private String inteligencia;
	
	///////////////////////////////////////
	
	public boolean getPerroDeAyuda(){
		return this.perroDeAyuda;
	}
	public boolean getObesidad(){
		return this.obesidad;
	}
	public String getInteligencia(){
		return this.inteligencia;
	}
	

	//////////////////////////////////////////
	
	public void setPerroDeAyuda(boolean perroDeAyuda){
		this.perroDeAyuda=perroDeAyuda;
	}
	public void setObesidad(boolean obesidad){
		this.obesidad=obesidad;
	}
	public void setInteligencia(String inteligencia){
		this.inteligencia=inteligencia;
	}
	
	/////////////////////////////////////////////
	
	public Labrador(String nombre,
					int edad, 
					String tamano,
					String tipo,
					String colorPelo,
					String colorOjos,
					String raza,
					boolean puro,
					boolean entrenado,
					boolean perroDeAyuda, 
					boolean obesidad,
					String inteligencia){
		
		this.setColorOjos(colorOjos);
		this.setColorPelo(colorPelo);
		this.setEdad(edad);
		this.setEntrenado(entrenado);
		this.setInteligencia(inteligencia);
		this.setNombre(nombre);
		this.setNombre(nombre);
		this.setObesidad(obesidad);
		this.setPerroDeAyuda(perroDeAyuda);
		this.setPuro(puro);
		this.setTipo(tipo);
		this.setTamano(tamano);
		this.setRaza(raza);
		this.setPuro(puro);
			
	}
	
	
	@Override	
	public String toString(){
		
		String puro;
		if(this.getPuro()){
			puro= "Si";
		}
		else{
			puro="No";
		}
		
		String entrenado;
		if(this.getEntrenado()){
			entrenado= "Si";
		}
		else{
			entrenado="No";
		}
		
		String perroDeAyuda;
		if(this.getPerroDeAyuda()){
			perroDeAyuda= "Si";
		}
		else{
			perroDeAyuda="No";
		}
		
		String obesidad;
		if(this.getObesidad()){
			obesidad= "Si";
		}
		else{
			obesidad="No";
		}
		
		String a= "Labrador: "+this.getNombre()+"\n"
				+ "Edad: "+this.getEdad()+"\n"
				+ "Tamano: "+this.getTamano()+"\n"
				+"Tipo: "+this.getTipo()+"\n"
				+"Color de Pelo: "+this.getColorPelo()+"\n"
				+"Color de Ojos: "+this.getColorOjos()+"\n"
				+"Raza: "+this.getRaza()+"\n"
				+"Puro: "+puro+"\n"
				+"Entrenado: "+entrenado+"\n"
				+"Perro de ayuda: "+perroDeAyuda+"\n"
				+"Obesidad: "+obesidad+"\n"
				+"Inteligencia: "+this.getInteligencia()+"\n\n";
		return a;
	}
	
	

}
