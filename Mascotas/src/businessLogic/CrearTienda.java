package businessLogic;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import data.Terrestre;
import data.Volador;
import data.Legendario;

import data.Aguila;
import data.Animal;
import data.Dragon;
import data.Labrador;
import data.Loro;
import data.Persa;
import data.Quimera;
import data.Samoyedo;
import data.Siames;
import data.Siberiano;
import data.Esfinge;

import data.Perro;
import data.Gato;
import UI.UI;

public class CrearTienda {
	
	private static void Inicio(List<Class> animales){
		UI ui = new UI();
		
			ui.Inicio(animales);
		
	}


	
	private static UI ui = new UI();
	
	private static Scanner inp = new Scanner(System.in);
	
	
	public static void main(String[] args) throws ParseException {
		
		
		List<Class> animales= new ArrayList<Class>();
		animales.add(Terrestre.class);		
		animales.add(Volador.class);
		animales.add(Legendario.class);
		
		List<Class> terrestres = new ArrayList<Class>();
		terrestres.add(Gato.class);
		terrestres.add(Perro.class);
		
		List<Class> legendarios = new ArrayList<Class>();
		legendarios.add(Dragon.class);
		legendarios.add(Quimera.class);
		
		List<Class> voladores = new ArrayList<Class>();
		voladores.add(Aguila.class);
		voladores.add(Loro.class);

		
		List<Class> gatos = new ArrayList<Class>();
		gatos.add(Siames.class);
		gatos.add(Persa.class);
		gatos.add(Esfinge.class);
		
		List<Class> perros = new ArrayList<Class>();
		perros.add(Samoyedo.class);
		perros.add(Siberiano.class);
		perros.add(Labrador.class);
		
	
		
		
		
		
		Dragon Dragon1 = new Dragon("MrTomus",130, "Grandecito","Grecia","Volcanes","Escupe Fuego","Paz","Escamas","Griega");
				
		HashMap<String,Animal> dragones = new HashMap<String,Animal>();
		dragones.put(Dragon1.getNombre() ,Dragon1);
		
		
		Quimera Quimera1 = new Quimera("Trifacica",200,"Medio","Antartida","Iglus","Hipnosis",3,"Caballo","Ciervo");
		
		HashMap<String,Animal> quimeras = new HashMap<String,Animal>();
		quimeras.put(Quimera1.getNombre() ,Quimera1);
				
		
		Aguila Aguila1 = new Aguila("Jose",5,"Pequeno",2,"Pequeno","Peces",128, 89,true);
		
		HashMap<String,Animal> aguilas = new HashMap<String,Animal>();
		aguilas.put(Aguila1.getNombre() ,Aguila1);
		
				
		Loro Loro1 = new Loro("Rigoverto",7,"Diminuto",1.5,"Diminuto","Semillas","Verde", 27,"Ramas");
		
		HashMap<String,Animal> loros = new HashMap<String,Animal>();
		loros.put(Loro1.getNombre() ,Loro1);
		
		Samoyedo Samoyedo1 = new Samoyedo("Luna",3,"Medio","Competencia","Blanco","Cafe","Samoyedo",true,true,true,true,"Noble");
		
		HashMap<String,Animal> samoyedos = new HashMap<String,Animal>();
		samoyedos.put(Samoyedo1.getNombre() ,Samoyedo1);
		
				
		Siberiano Siberiano1 = new Siberiano("Maximus",4,"Corpulento","Transporte","Gris","Verde","Siberiano",true,false,false,true,true);
		
		HashMap<String,Animal> siberianos = new HashMap<String,Animal>();
		siberianos.put(Siberiano1.getNombre() ,Siberiano1);
		
		
		Labrador Labrador1 = new Labrador("Kyra",2,"Grande","Compania","Dorado","Cafe","Labrador",false,false,true,false,"Alta");
		
		HashMap<String,Animal> labradores = new HashMap<String,Animal>();
		labradores.put(Labrador1.getNombre() ,Labrador1);
		
		Persa Persa1 = new Persa("Juan",5,"Pequeno","Domestico","Amarillo","Verdes",true,false,"Suave","Redonda","Corto",true);
		
		HashMap<String,Animal> persas = new HashMap<String,Animal>();
		persas.put(Persa1.getNombre() ,Persa1);
		
		
		Siames Siames1 = new Siames("Jacinto",8,"Medio","Salvaje","Negro","Cafes",false,false,"Frondoso","Agresivo","Estrabismo",true);
		
		HashMap<String,Animal> siameses = new HashMap<String,Animal>();
		siameses.put(Siames1.getNombre() ,Siames1);
		
		Esfinge Esfinge1 = new Esfinge("Wolfgang",3,"Pequeno","Domestico","Blanco","Negros",true,true,"Ninguno","Rosa","Calvo",false);
		
		HashMap<String,Animal> esfinges = new HashMap<String,Animal>();
		esfinges.put(Esfinge1.getNombre() ,Esfinge1);
		
		
		
		
		
		
		
		Inicio(animales);
		
		int a = inp.nextInt();
		int b;int c;
				
		if(a==1){
			ui.listarClases(terrestres);
			b=inp.nextInt();
			
			if(b==1){
				ui.listarClases(gatos);
				
				
				
			}
			else{
				ui.listarClases(perros);
				
				c=inp.nextInt();
				if(c==1){
					ui.ListarHashMap(samoyedos);
				}
				else if(c==2){
					ui.ListarHashMap(siberianos);
				}else{
					
					ui.ListarHashMap(labradores);
					
				}
				
			}
			
			
		}else if(a==2){
			
			ui.listarClases(voladores);
			b=inp.nextInt();
			
			if(b==1){
				
				ui.ListarHashMap(aguilas);
				
			}else if(b == 2){
				
				ui.ListarHashMap(loros);
				
			}else{
				
				System.out.println("Esta opcion no es validad, Vuelva a intentar por favor");
				
			}
			
		}else if(a == 3){
			
			ui.listarClases(legendarios);
			b=inp.nextInt();
			
			if(b == 1){
				
				ui.ListarHashMap(dragones);
				
			}else if(b == 2){
				
				ui.ListarHashMap(quimeras);
				
			}else{
				
				System.out.println("Esta opcion no es validad, Vuelva a intentar por favor");
				
			}
			
		}
	}	
}
