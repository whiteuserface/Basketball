package PackageBasketball;

public class PointCounter {
	private PrivateData pd = new PrivateData();
	
	public void throwGoalAndLevel(int goal, int level) {
		System.out.println(goal+"번의 골을 넣었습니다.");
		System.out.println(level+"점 슛!");
		if(level==1) {
		pd.plusLevel1(goal);
		} else if (level==2) {
		pd.plusLevel2(goal);
		} else {
		pd.plusLeve3(goal);;
		}
		pd.plusTotal(goal*level);
		System.out.println("총 점수는:"+pd.getTotal());
	}
	
	public int getT() {	
		System.out.println("지금까지 총 점수:");
		return pd.getTotal();
	}
	public int getG() {
		System.out.println("지금까지 슈팅은 총:");
		return pd.getGoal();
	}
	public int getL1() {
		System.out.println("지금까지 1점 슛 갯수:");
		return pd.getLevel1();
	}
	public int getL2() {
		System.out.println("지금까지 2점 슛 갯수:");
		return pd.getLevel2();
	}
	public int getL3() {	
		System.out.println("지금까지 3점 슛 갯수:");
		return pd.getLevel3();
	}
}
