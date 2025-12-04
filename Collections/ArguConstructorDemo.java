package Collections;

class Products {
    String proName;
    float proPrice;
    int proNo;
    Products(String name, float proPrice, int proNo) {
        proName = name;
        this.proPrice = proPrice;
        this.proNo = proNo;
    }
    void display() {
        System.out.println(proName + " " + proPrice + " " + proNo);
    }
}

public class ArguConstructorDemo {
    public static void main(String[] args)
    {
        Products p1 = new Products("Laptop", 500000.0f, 1);
        p1.display();
    }
}
