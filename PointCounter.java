package PackageBasketball;

public class PointCounter {
	private PrivateData pd = new PrivateData();
	
	public void throwGoalAndLevel(int goal, int level) {
		System.out.println(goal+"���� ���� �־����ϴ�.");
		System.out.println(level+"�� ��!");
		if(level==1) {
		pd.plusLevel1(goal);
		} else if (level==2) {
		pd.plusLevel2(goal);
		} else {
		pd.plusLeve3(goal);;
		}
		pd.plusTotal(goal*level);
		System.out.println("�� ������:"+pd.getTotal());
	}
	
	public int getT() {	
		System.out.println("���ݱ��� �� ����:");
		return pd.getTotal();
	}
	public int getG() {
		System.out.println("���ݱ��� ������ ��:");
		return pd.getGoal();
	}
	public int getL1() {
		System.out.println("���ݱ��� 1�� �� ����:");
		return pd.getLevel1();
	}
	public int getL2() {
		System.out.println("���ݱ��� 2�� �� ����:");
		return pd.getLevel2();
	}
	public int getL3() {	
		System.out.println("���ݱ��� 3�� �� ����:");
		return pd.getLevel3();
	}
}
