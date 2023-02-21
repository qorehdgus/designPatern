package singleton;

public class main {
	public static void main(String[] args) {
		singleton single2 = singleton.getInstance();
		if(single2.isEnableUse()) {
			single2.start();
			single2.end();
			single2.setTest("테스트");
			System.out.println(single2.getTest());
		}

		singleton single = singleton.getInstance();
		if(single2.isEnableUse()) {
			single.start();
			System.out.println(single.getTest());
		}
	}
}
