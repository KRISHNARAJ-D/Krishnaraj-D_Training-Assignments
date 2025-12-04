package Collections;

class Product{
	String proName;
	float proPrice;
	int proNo;
	Product()
	{
		proName = "Laptop";
		proPrice = 500000.0f;
		proNo = 001;
	}
	void display()
	{
		System.out.println(proName+" "+proPrice+" "+proNo);
	}
}
public class ConstructorDemo {
	public static void main(String[] args)
	{
		Product p1 = new Product();
		p1.display();
	}

}
