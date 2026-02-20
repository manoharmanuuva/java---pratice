interface Laptop {
    void price(int rate);
}

// Normal class implementation
class Asus implements Laptop {
    @Override
    public void price(int rate) {
        System.out.println("price of Asus is " + rate);
    }
}

// Normal class implementation
class Dull implements Laptop {
    @Override
    public void price(int m) {
        System.out.println("price of Dull is " + m);
    }
}

public class lamda3 {
    public static void main(String[] args) {

        // Using normal class
        Asus a1 = new Asus();
        a1.price(36000);

        // Using lambda expression
        Laptop p1 = (int m) -> {
            System.out.println("price of Dull is " + m);
        };

        p1.price(45000);
    }
}