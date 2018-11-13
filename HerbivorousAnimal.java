package LR2_ver10;
/**
 * Класс "травоядное животное"
 */
public class HerbivorousAnimal extends Animal{
	String plantFood; //Пригодное в пищу растение
	public String getPlantFood() {
		return plantFood;
	}
	public void setPlantFood(String plantFood) {
		this.plantFood=plantFood;
	}
	public HerbivorousAnimal(){
		this.setSpecies("hhhhhhhhh");
		this.setSize(10);
		this.setPlantFood("трава");
	}
	public HerbivorousAnimal(String species, int size, String pf){
		this.setSpecies(species);
		this.setSize(size);
		this.setPlantFood(pf);
	}
	public void FindAndEat(Plant plant) {
		if (plant.getForm().equals(this.getPlantFood()))
			System.out.println(this.getSpecies()+" съел "+plant.getSpecies());
	}
	public String toString() {
		return ("Травоядное животное вида "+species+", размер: "+this.getSize()+", пригодное в пищу растение: "+plantFood);
	}
}
