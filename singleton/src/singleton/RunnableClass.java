package singleton;

public class RunnableClass implements Runnable {
	@Override
	public void run() {
		singleton single = singleton.getInstance();
		single.start();
	}
}
