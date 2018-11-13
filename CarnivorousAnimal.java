package LR2_ver10;
/**
 * Класс "животное-хищник"
 */
public class CarnivorousAnimal extends Animal{
	public CarnivorousAnimal(){
		this.setSpecies("hhhhhhhhh");
		this.setSize(10);
	}
	public CarnivorousAnimal(String species, int size){
		this.setSpecies(species);
		this.setSize(size);
	}
	public void FindAndEat(Animal animal) {
		if (animal.getSize()<this.getSize())
			System.out.println(this.getSpecies()+" съел "+animal.getSpecies());
	}
	public String toString() {
		return ("Хищник вида "+species+", размер: "+this.getSize());
	}
}
