package UI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import data.Animal;

import data.Terrestre;
import data.Volador;
import data.Legendario;



public class UI {

	
	
	
	public void listarClases(List<Class> animales){
		
		int index=0;
		for(Class s:animales)
			System.out.print("["+ ++index +"] "+s.getSimpleName()+"\n");
	}


	public void ListarHashMap(HashMap<String,Animal> map){
		
		for(Animal animal: map.values()){
				System.out.println(animal.toString());
		}
	}
		
	public void Inicio(List<Class> animales){
		System.out.println("Bienvenidos a la tienda de mascotas, escoga un tipo de animal:\n");
		
		
		listarClases(animales);
		
		
	}
	
	
	
	
	
	
}
