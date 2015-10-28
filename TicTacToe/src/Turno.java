
public class Turno {
	
	int turno = 0;
	
	public Turno (){
		this.turno = turno;
	}
	
	public void setTurno(){
		this.turno = turno;
	}
	
	public int getTurno(){
		switch(turno){
		case 0: turno = 1; break;
		case 1: turno = 2; break;
		case 2: turno = 1; break;
		}
		return turno;
	}
}
