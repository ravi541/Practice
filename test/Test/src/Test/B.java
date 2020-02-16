package Test;

public class B {
	public synchronized void d2(A a) throws InterruptedException
{
	Thread.sleep(5000);
	a.last();
}
public synchronized void last()
{
	System.out.println("A's last method          ");
}

}

	


