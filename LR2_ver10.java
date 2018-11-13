package LR2_ver10;

import java.util.*;
//import java.io.*;

public class LR2_ver10 {
	static Forest forest;
	/**
     * Model
     */
	static void Model(){
		forest=new Forest();
	}
	/**
     * View
     * @param f Forest structure
     */
	static void View(Forest f){
		if(f.plants.size()>0) {
			System.out.println("\nРастения:");
			for(Plant p : f.plants) {
				System.out.println(p.toString());
			}
		}
		if(f.ha.size()>0) {
			System.out.println("\nТравоядные животные:");
			for(HerbivorousAnimal h : f.ha) {
				System.out.println(h.toString());
			}
			f.ha.get(0).FindAndEat(f.plants.get(0));
		}
		if(f.ca.size()>0) {
			System.out.println("\nХищники:");
			for(CarnivorousAnimal c : f.ca) {
				System.out.println(c.toString());
			}
			f.ca.get(0).FindAndEat(f.ha.get(0));
		}
	}
	/**
     * Controller
     */
	static void Controller(){
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		while(cont.equals("y")) {
			System.out.println("\nДобавить в лес:");
			System.out.println("1 - растение");
			System.out.println("2 - травоядное животное");
			System.out.println("3 - животное-хищник");
		
			String select = scan.nextLine();
			switch(select) {
				case "1":
					forest.AddPlant();
					break;
				case "2":
					forest.AddHerbivorous();
					break;
				case "3":
					forest.AddCarnivorous();
					break;
				default:
					System.out.println("Неверный ввод!");
					break;
			}
			System.out.print("Продолжить(y/n)?");
			cont=scan.nextLine();
		}
		scan.close();
		View(forest);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model();
		Controller();
	}
}
