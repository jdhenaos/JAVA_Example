package data;

public class Loro extends Volador{

	private String colorPlumas;
	private int vocabulario;
	private String tipoNido;

	/////////////////////////////////////////
	
	public String getColorPlumas(){
		return this.colorPlumas;
	}
	public int getVocabulario(){
		return this.vocabulario;
	}
	public String getTipoNido(){
		return this.tipoNido;
	}
	
	//////////////////////////////////////////
	
	public void setColorPlumas(String colorPlumas){
		this.colorPlumas=colorPlumas;
	}
	public void setVocabulario(int vocabulario){
		this.vocabulario=vocabulario;
	}
	public void setTipoNido(String tipoNido){
		this.tipoNido=tipoNido;
	}
	
	//////////////////////////////////////////////
	
	public Loro(String nombre, int edad, String tamano, double tamanoAlas, String tamanoPico, String alimentacion, String colorPlumas, int vocabulario, String tipoNido){
		
		this.setAlimentacion(alimentacion);
		this.setColorPlumas(colorPlumas);
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setTamano(tamanoPico);
		this.setTamanoAlas(tamanoAlas);
		this.setTamanoPico(tamanoPico);
		this.setTipoNido(tipoNido);
		this.setVocabulario(vocabulario);
		
		
	}

	@Override	
	public String toString(){
		
		
		String a= "Loro: "+this.getNombre()+"\n"
				+ "Edad: "+this.getEdad()+"\n"
				+ "Tamano: "+this.getTamano()+"\n"
				+ "Tamano de Alas: "+this.getTamanoAlas()+"\n"
				+ "Tamano de Pico: "+this.getTamanoPico()+"\n"
				+ "Alimentacion: "+this.getAlimentacion()+"\n"
				+ "Colos de Plumas: "+this.getColorPlumas()+"\n"
				+ "Numero de palabras que conoce: "+this.getVocabulario()+"\n"
				+ "Tipo de Nido: "+this.getTipoNido()+"\n\n";
				
		return a;
	}
}
