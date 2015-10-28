
public class Turno {
	
	int turno;
	
	public Turno (int turno){
		this.turno = turno;
	}
	
	public void setTurno(int turno){
		this.turno = turno;
	}
	
	public int getTurno(){
		if(turno == 0){
			return 1;
		}else if(turno == 2) {
			return 1;
		}else{
			return 2;
		}
	}
}
