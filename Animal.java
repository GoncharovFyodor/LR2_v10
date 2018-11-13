package LR2_ver10;
/**
 * Класс "животное"
 */
public class Animal{
	private int size; //размер
	protected String species;
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String sp) {
		species=sp;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}