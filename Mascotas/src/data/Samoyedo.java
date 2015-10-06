package data;

public class Samoyedo extends Perro {
	
	private boolean granPelaje;
	private boolean tierno;
	private  String temperamento;
	
	///////////////////////////////////////
	
	public boolean getGranPelaje(){
		return this.granPelaje;
	}
	public boolean getTierno(){
		return this.tierno;
	}
	public String getTemperamento(){
		return this.temperamento;
	}
	

	//////////////////////////////////////////
	
	public void setGranPelaje(boolean granPelaje){
		this.granPelaje=granPelaje;
	}
	public void setTierno(boolean tierno){
		this.tierno=tierno;
	}
	public void setTemperamento(String temperamento){
		this.temperamento=temperamento;
	}
	
	//////////////////////////////////////////
	
	public Samoyedo(String nombre,
					int edad,
					String tamano,
					String tipo,
					String colorPelo,
					String colorOjos,
					String raza,
					boolean puro,
					boolean entrenado,
					boolean granPelaje,
					boolean tierno,
					String temperamento){
		
		this.setColorOjos(colorOjos);
		this.setColorPelo(colorPelo);
		this.setEdad(edad);
		this.setEntrenado(entrenado);
		this.setGranPelaje(granPelaje);
		this.setNombre(nombre);
		this.setPuro(puro);
		this.setTipo(tipo);
		this.setTierno(tierno);
		this.setTemperamento(temperamento);
		this.setTamano(tamano);
		this.setRaza(raza);
	}
	
	@Override
	public String toString(){
		
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
		
		String granPelaje;
		if(this.getGranPelaje()){
			granPelaje = "Si";
		}else{
			granPelaje = "No";
		}
		
		String tierno;
		if(this.getTierno()){
			tierno = "Si";
		}else{
			tierno = "No";
		}
		
		String a= "Samoyedo: "+this.getNombre()+"\n"
				+ "Edad: "+this.getEdad()+"\n"
				+ "Tamano: "+this.getTamano()+"\n"
				+ "Tipo: "+this.getTipo()+"\n"
				+ "Color de Pelo: "+this.getColorPelo()+"\n"
				+ "Color de Ojos: "+this.getColorOjos()+"\n"
				+ "Raza: "+this.getRaza()+"\n"
				+ "Puro: "+puro+"\n"
				+ "Entrenado: "+entrenado+"\n"
				+ "Gran Pelaje: "+granPelaje+"\n"
				+ "Tierno: "+tierno+"\n"
				+ "Temperamento: "+this.getTemperamento()+"\n\n";
				
		return a;
	}

}
