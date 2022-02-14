import java.util.ArrayList;
import java.util.Arrays;
public class TestCafe {
    public static void main(String[] args) {
        CafeUtil cafeFunction = new CafeUtil();

    
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", cafeFunction.getStreakGoal());

        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n", cafeFunction.getOrderTotal(lineItems));
        
        ArrayList<String> menu = new ArrayList<>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");

        cafeFunction.displayMenu(menu);
        
        ArrayList<String> customers = new ArrayList<String>();

        for (int i = 0; i < 3; i++) {
            cafeFunction.addCustomer(customers);
            System.out.println("\n");
        }
    }
}
