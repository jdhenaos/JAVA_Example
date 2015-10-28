
public class Jugador {
	
	int jugador;
	
	public Jugador (int jugador){
		this.jugador = jugador;
	}
	
	public void setJugador(int jugador){
		this.jugador = jugador;
	}
	
	public int getJugador(){
		return jugador;
	}
	
	
	@Override
	public String toString(){
		String imprimirJugador = "Jugador "+String.valueOf(this.getJugador());
		return imprimirJugador;
	}
	

}
