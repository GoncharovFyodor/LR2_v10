package LR2_ver10;
/**
 * Класс "растение"
 */
public class Plant{
	private String form;//"дерево" или "трава"
	private String species;
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String sp) {
		species=sp;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String f) {
		form=f;
	}
	public Plant() {
		this.setSpecies("tttttttt");
		this.setForm("дерево");
	}
	public Plant(String form, String species) {
		this.setSpecies(species);
		this.setForm(form);
	}
	public String toString() {
		return (form+" вида "+species);
	}
}
