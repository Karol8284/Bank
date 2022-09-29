package Shop;


import Shop.Account.Customer;
import impelemtacjek.ImplManager;

public class Main{
    public static void main(String[] args) {

        ImplManager manager = ImplManager.get();

        for (int i =0;i<10;i++){
            System.out.println(i);
        }
//        Customer.get()
    }
}
