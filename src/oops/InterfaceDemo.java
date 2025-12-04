package oops;
class Printer implements printable{
	public void print() 
	{
		System.out.println(printerName +" is printing");
	}
}
public class InterfaceDemo {
	public static void main(String[] args)
	{
		Printer p1 = new Printer();
		p1.print();
	}

}
