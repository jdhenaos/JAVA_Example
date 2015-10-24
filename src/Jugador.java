
public class Jugador {
	
	char jugador;
	boolean humano;
	
	public Jugador (char jugador, boolean humano){
		this.jugador = jugador;
		this.humano = humano;
	}
	
	public char getJugador(){
		return jugador;
	}
	
	public void setJugador(char jugador){
		this.jugador = jugador;
	}
	
	public boolean esHumano(){
		return humano;
	}
	
	@Override
	public String toString(){
		String imprimirJugador = "Jugador "+String.valueOf(this.getJugador());
		return imprimirJugador;
	}

}
