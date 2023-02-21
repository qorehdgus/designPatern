package singleton;

public class RunnableClass2 implements Runnable {
	@Override
	public void run() {
		singleton single = singleton.getInstance();
		single.start();
	}
}
