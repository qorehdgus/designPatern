package singleton;

/*
 * 생성자를 private(선언 클래스에서만 사용가능한 접근제어자)로 선언한 경우 해당 클래스 자체를 외부에서 호출할 수 없다.
 * 따라서 해당 클래스내에서 자기자신을 호출한다.
 * 이런 구조를 가짐으로서 singleton은 메모리에 하나만 할당된다.
 * 다만 테스트 하기는 힘든 구조.
 * 해당 샘플은 usUse라는 전역 변수를 선언함으로서 singleton 객체를 사용못하게 막는 기능도 구현 가능하게 만들었다.
 * 추가로 singleton 패턴은 전역에 선언되며 하나 밖에 존재하지 않기 때문에 어디서든 변수값을 공유한다.
 * */
public class singleton {
	private String test;

	private static singleton single = new singleton();
	
	private singleton() {}

	public String getTest() {
		return this.test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	
	public static singleton getInstance() {
		return single;
	}
	private static boolean isUse = false;
	
	public static void start() {
		isUse = true;
		System.out.println("start");
	}
	
	public static void end() {
		isUse = false;
		System.out.println("end");
	}
	
	public static boolean isEnableUse() {
		return !isUse;
	}
}
