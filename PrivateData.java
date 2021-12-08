package PackageBasketball;

public class PrivateData {
	
	private int goal=0;
	
	private int level1=0;
	private int level2=0;
	private int level3=0;
	
	private int total;
	
	public int getGoal() {
		return this.goal; 
	}
	public int getLevel3() { 
		return this.level3; 
	}
	public int getLevel2() {
		return this.level2; 
	}
	public int getLevel1() {
		return this.level1; 
	}
	public int getTotal() {
		return this.total;
	}
	public void plusLeve3(int level3) {
		this.level3 += level3;
		this.goal += level3;
	}
	public void plusLevel2(int level2) {
		this.level2 += level2;
		this.goal += level2;
	}
	public void plusLevel1(int level1) {
		this.level1 += level1;
		this.goal += level1;
	}
	public void plusTotal(int total) {
		this.total += total;
	}
	
}
