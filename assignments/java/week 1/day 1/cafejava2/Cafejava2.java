package cafejava2;

public class Cafejava2 {
   
    public static void main(String[] args) {
       ;
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = " Hello, Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready, ";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double MargaritaMochaPrice=12.5;
        double  RistrettoPrice= 5.5;
        double Frappuccino =5.75;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Muriel";
       String customer3= "Hortense";
       String customer4= "Samanta";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2= true;
        boolean isReadyOrder3= true;
        boolean isReadyOrder4=false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    


    	// ** Your customer interaction print statements will go here ** //
        if (isReadyOrder1=false) {System.out.println(customer1 + pendingMessage);}
            else{System.out.println(customer1 + pendingMessage);}


        //For customer 2


            System.out.println("//***********For customer 2***************//");
            System.out.println("//***********For customer 2***************//");
            System.out.println("//***********For customer 2***************//");

            System.out.println(generalGreeting + customer2);


    

             if (isReadyOrder2=true) {System.out.println(customer2 + readyMessage + displayTotalMessage + Frappuccino);}
            else{System.out.println(customer2 + pendingMessage);}

        // For customer 3

      
            System.out.println("//***********For customer 3***************//");
            System.out.println("//***********For customer 3***************//");
            System.out.println("//***********For customer 3***************//");

            System.out.println(generalGreeting + customer3);
            
            double Totalprice=Frappuccino  + MargaritaMochaPrice;

            if (isReadyOrder3 =true) {
                System.out.println(customer3 + readyMessage + displayTotalMessage + Totalprice);
            } else {
                System.out.println(customer3 + pendingMessage);
            }

              

           
            
        




    
}
}
    

    

