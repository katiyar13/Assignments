
public class Singleton {
	Singleton s=new Singleton();
	private void know() {
		System.out.println("Inside Singleton class");
	}
	public Singleton getInstance() {
		return s;
	}
}