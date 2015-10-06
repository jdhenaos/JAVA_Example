package data;

public abstract class Gato extends Terrestre{
	
	private boolean docil;
	private boolean castrado;
	private  String pelaje;
	
	//////////////////////////////////////////
	
	public boolean getDocil(){
		return this.docil;
	}
	public boolean getCastrado(){
		return this.castrado;
	}
	public String getPelaje(){
		return this.pelaje;
	}
	

	//////////////////////////////////////////
	
	public void setDocil(boolean docil){
		this.docil=docil;
	}
	public void setCastrado(boolean castrado){
		this.castrado=castrado;
	}
	public void setPelaje(String pelaje){
		this.pelaje=pelaje;
	}
	
	////////////////////////////////////////////
	
	public Gato(){
		
	}

}
