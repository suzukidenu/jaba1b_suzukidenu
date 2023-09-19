package course44;

public class Animal extends Creatures {

	private String name;
	private String kari;

	void disp() {
		System.out.println(this.name);
		System.out.println(this.kari);

	}

	void dispWeight() {
		System.out.println("体重は" + super.getWeight() + "です");
	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;

	}

	public String getKari() {
		return kari;

	}

	public void setKari(String kari) {
		this.kari = kari;

	}

}
