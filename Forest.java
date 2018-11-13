package LR2_ver10;

import java.util.*;

/**
 * Класс "лес"
 */
public class Forest{

	public ArrayList<Plant> plants;
	public ArrayList<HerbivorousAnimal> ha;
	public ArrayList<CarnivorousAnimal> ca;
	public Forest() {
		plants=new ArrayList<Plant>();
		ha=new ArrayList<HerbivorousAnimal>();
		ca=new ArrayList<CarnivorousAnimal>();
	}
	
	/**
	 * Добавление растения
	 */
	public void AddPlant() {
		String form;
		String species;
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите форму растения(дерево/трава):");
		form=sc.nextLine();
		System.out.print("Введите вид растения:");
		species=sc.nextLine();
		plants.add(new Plant(form,species));
		//sc.close();
	}
	
	/**
	 * Добавление травоядного животного
	 */
	public void AddHerbivorous() {
		String plantFood;
		String species;
		int size;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите вид:");
		species=sc.nextLine();
		System.out.print("Введите размер:");
		size=Integer.parseInt(sc.nextLine());
		System.out.print("Введите форму пригодного в пищу растения(дерево/трава):");
		plantFood=sc.nextLine();
		
		ha.add(new HerbivorousAnimal(species,size,plantFood));
		//sc.close();
	}
	
	/**
	 * Добавление животного-хищника
	 */
	public void AddCarnivorous() {
		String species;
		int size;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите вид:");
		species=sc.nextLine();
		System.out.print("Введите размер:");
		size=Integer.parseInt(sc.nextLine());
		
		ca.add(new CarnivorousAnimal(species,size));
		//sc.close();
	}
}
