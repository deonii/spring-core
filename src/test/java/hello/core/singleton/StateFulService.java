package hello.core.singleton;

public class StateFulService {
    //    private int price;
    public int order(String name, int price) {
        System.out.println("name = " + name + " / price = " + price);
//        this.price = price;
        return price;
    }
}
