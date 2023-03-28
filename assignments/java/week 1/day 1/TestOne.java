public class TestOne {
  public static void main(String[] args) {

    System.out.println("My name is Coding Dojo");
    System.out.println("I am 100 years old");
    System.out.println("My hometown is Burbank, CA");

    String x = "My name is Coding Dojo";
    String y = "I am 100 years old";
    String z = "My hometown is Burbank, CA";

    System.out.println(x + "\n" + y + "\n" + z);
    // My hometown is Burbank, CA
    // My name is Coding Dojo
    // I am 100 years old

    // Length - Strings have a method to determine their length. ca compte de [1 en
    // montant meme les espaces]
    String ninja = "Coding Dojo is Awesome!";
    int length = ninja.length();
    System.out.println("String Length is : " + length);

    // Concatenate: A String method that allows two strings to be squashed together.
    // Since each string is immutable, this results in a brand-new string.
    String string1 = "My name is ";
    String string2 = "Michael";
    String string3 = string1.concat(string2);
    System.out.println(string3);
    // will output My name is Michael

    // Format: Another way of concatenating strings!
    String nienja = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
    System.out.println(nienja);
    // Will print out Hi Jack, you owe me $25.00 !
    // Where %s is expecting a string
    // And %.2f is expecting a float data type. The value 2 will just place two
    // values to right of the decimal point.

    // IndexOf: The indexOf method searches left-to-right inside the given string
    // for a "target" string. The indexOf() method returns
    // the index number where the target string is first found or -1 if the target
    // is not found. celui compte de [0 en montant meme les espaces]
    String nanja = "Welcome to Coding Dojo!";
    int a = nanja.indexOf("Coding"); // a is 11
    int b = nanja.indexOf("co"); // b is 3
    int c = nanja.indexOf("pizza"); // c is -1, "pizza" is not found
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

    // Trim: The trim() method removes any trailing or leading white spaces from the
    // string. enleve les espace extra au debut et a la fin
    String sentence = "   spaces everywhere!   ";
    System.out.println(sentence.trim());

    int day = 7; // cet variable defini a lavance va faire en sorte que se soit le jour sunday
                 // qui va print sur mon terminal. ca va switch juska dimanche.
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("There are only seven days in a week...");
    }

    // Uppercase and Lowercase: The String class provides methods to lowercase and
    // uppercase strings.
    String aa = "HELLO";
    String bb = "world";
    System.out.println(aa.toLowerCase()); // hello
    System.out.println(bb.toUpperCase()); // WORLD

    //// Normal string assignment le sihggne == permet de comparer deux variable et
    //// renvoie la reponse true or false
    String aaa = "same string";
    String bbb = "same string";
    String ccc = "Different String";
    System.out.println(aaa == bbb); // true
    System.out.println(aaa == ccc); // false
    System.out.println(aaa.equals(bbb)); // true. same exact characters.

    // Creating new strings as separate objects (another way to create a String)
    // Creating new strings as separate objects (another way to create a String)
    aaa = new String("same letters");
    bbb = new String("same letters");
    System.out.println(aaa == bbb); // false. Not the same object in memory.ceci ne marche plus
    System.out.println(aaa.equals(bbb)); // true. same exact characters.

    /// Primitive type of "int". primitive type contain the minimum requierent to
    /// store the variable as an integer.benefit il prend moin de memoire
    int number = 4;

    // Integer is an obgject type. Different from primitive type "int" because it
    // comes with more feature(lorsque tu met le point .) apres la variable, vscode
    // te donne beaucoup de propositions c'est ca les feature que tu peux utiliser.
    // il te laisse aussi store le int types. benefit give you more built in
    // functions for the variable. its take more memory
    Integer numbers = 5;
    // numbers.parseInt("muriel");
    // System.out.println("my name is : " + numbers);

    // pour aller a la ligne avec Java il ya deux type de format que tu peux utiliser(les deux si son cense donne mais ca me fait les fesses)
    //
    System.out.printf("how is it going %s, your jersey number is %s \n", string2, aaa);
    System.out.println(String.format("how is it going %s, your jersey number is %s", string2, aaa));

  }
}

/*
 * You will need add 1 line to this file to create an instance
 * of the CafeUtil class.
 * Hint: it will need to correspond with the variable name used below..
 */

/* ============ App Test Cases ============= */

// System.out.println("\n----- Streak Goal Test -----");
// System.out.printf("Purchases needed by week 10: %s \n\n",
// appTest.getStreakGoal());

// System.out.println("----- Order Total Test-----");
// double[] lineItems = {3.5, 1.5, 4.0, 4.5};
// System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));

// System.out.println("----- Display Menu Test-----");

// ArrayList<String> menu = new ArrayList<String>();
// menu.add("drip coffee");
// menu.add("cappuccino");
// menu.add("latte");
// menu.add("mocha");
// appTest.displayMenu(menu);

// System.out.println("\n----- Add Customer Test-----");
// ArrayList<String> customers = new ArrayList<String>();
// // --- Test 4 times ---
// for (int i = 0; i < 4; i++) {
// appTest.addCustomer(customers);
// System.out.println("\n");
// }
// String ninja = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
// System.out.println(ninja);
// Will print out Hi Jack, you owe me $25.00 !
// Where %s is expecting a string
// And %.2f is expecting a float data type. The value 2 will just place two
// values to right of the decimal point.
