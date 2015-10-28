
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
	
	public int getTurno(){
		if(jugador == 0){
			jugador = 1;
			return jugador;
		} else if(jugador == 1){
			jugador = 2;
			return jugador;
		}else{
			jugador = 1;
			return jugador;
		}
	}

}
