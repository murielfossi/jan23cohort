import java.util.ArrayList;

public class TestCafeJava {

  public static void main(String[] args) {
    CafeJava CafeJavaPlace = new CafeJava();
    CafeJavaPlace.displayMenu();
  
        
    /* 
      You will need add 1 line to this file to create an instance 
      of the CafeUtil class. 
      Hint: it will need to correspond with the variable name used below..
    */
    	
        /* ============ App Test Cases ============= */
    
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", CafeJava.getStreakGoal(5));
    
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n", CafeJava.getOrderTotal(lineItems));
        
        System.out.println("----- Display Menu Test-----");
        
      ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("drip coffee");
        menuItems.add("cappuccino");
        menuItems.add("late");
        menuItems.add("mocha");

        for(String menuItem : menuItems)
        
          {  System.out.printf("%s %s\n", menuItems.indexOf(menuItem), menuItem);;
    
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
           CafeJava.addCustomer(customers);
            System.out.println("\n");
        }
    }

  }
}






