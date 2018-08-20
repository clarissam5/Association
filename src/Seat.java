/*
 * material, filter, brand, suitableSeason, isInfantSafe, isHeated, adjustHeight(int level), pullForward(), pushBack()
 */
public class Seat {
	private String material;
	private String filter;
	private String brand;
	private String suitableSeason;
	private boolean isInfantSafe;
	private boolean isHeated;
	
	public Seat(String material, String filter, String brand, String suitableSeason, boolean isInfantSafe,
			boolean isHeated) {
		super();
		this.material = material;
		this.filter = filter;
		this.brand = brand;
		this.suitableSeason = suitableSeason;
		this.isInfantSafe = isInfantSafe;
		this.isHeated = isHeated;
	}
	
	@Override
	public String toString() {
		return "Seat [material=" + material + ", filter=" + filter + ", brand=" + brand + ", suitableSeason="
				+ suitableSeason + ", isInfantSafe=" + isInfantSafe + ", isHeated=" + isHeated + "]";
	}

	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getFilter() {
		return filter;
	}
	public void setFilter(String filter) {
		this.filter = filter;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSuitableSeason() {
		return suitableSeason;
	}
	public void setSuitableSeason(String suitableSeason) {
		this.suitableSeason = suitableSeason;
	}
	public boolean isInfantSafe() {
		return isInfantSafe;
	}
	public void setInfantSafe(boolean isInfantSafe) {
		this.isInfantSafe = isInfantSafe;
	}
	public boolean isHeated() {
		return isHeated;
	}
	public void setHeated(boolean isHeated) {
		this.isHeated = isHeated;
	} 

	public void adjustHeight(int level) {
		
	}
	
	public void pullForward() {
		System.out.println("Pulls seat forward.");
	}
	
	public void pushBack() {
		System.out.println("Pulls seat backward.");
	}
	
}
