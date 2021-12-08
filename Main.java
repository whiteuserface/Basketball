package PackageBasketball;

public class Main {
	public static final int ONE = 1;
	public static final int TWO = 2;
	public static final int THREE = 3;
	
	public static void main(String[] args) {
		PointCounter pc = new PointCounter();
		
		pc.throwGoalAndLevel(TWO, THREE);
		pc.throwGoalAndLevel(ONE, TWO);
		pc.throwGoalAndLevel(TWO, ONE);
		pc.throwGoalAndLevel(TWO, TWO);
		pc.throwGoalAndLevel(THREE, THREE);
		pc.throwGoalAndLevel(TWO, TWO);
		pc.throwGoalAndLevel(ONE, ONE);
		
		System.out.println(pc.getG());
		System.out.println(pc.getL1());
		System.out.println(pc.getL2());
		System.out.println(pc.getL3());
		System.out.println(pc.getT());
	}
}
