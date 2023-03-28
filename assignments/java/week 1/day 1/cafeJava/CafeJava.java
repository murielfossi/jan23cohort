
import java.util.ArrayList;

public class CafeJava {
    public static int getStreakGoal(int numWeeks)
    {
        int sum = 0;
        for (int i = 1; i < numWeeks; i++) 
        
            {sum = sum + i;}

        
         return sum;
    }


     // get order total
    public static double getOrderTotal(double[] prices)
    {
        double sum = 0;
        for(double price : prices){
            sum += price;
        }
        return sum;
    }

    public static void displayMenu(){
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("drip coffee");
        menuItems.add("cappuccino");
        menuItems.add("late");
        menuItems.add("mocha");

        for(String menuItem : menuItems)
        
          {  System.out.printf("%s %s\n", menuItems.indexOf(menuItem), menuItem);}


    }

    //here we add a customer
    public static void addCustomer(){
        ArrayList<String> addcustomers = new ArrayList<>();
        System.out.print("Please enter your name: ");
        String customer = System.console().readLine();
    }

        
//Format Specifier	Conversion Applied
// %%	Inserts a % sign
// %x %X	Integer hexadecimal
// %t %T	Time and Date
// %s %S	String
// %n	Inserts a newline character
// %o	Octal integer
// %f	Decimal floating-point
// %e %E	Scientific notation
// %g	Causes Formatter to use either %f or %e, whichever is shorter
// %h %H	Hash code of the argument
// %d	Decimal integer
// %c	Character
// %b %B	Boolean
// %a %A	Floating-point hexadecimal





}
