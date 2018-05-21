import java.util.Scanner;

/**
 * Part b: Write a class called GeniegotchiDemo containing two static methods:
 * 1. public static void printMenu() :
 * Prints a welcoming message and the menu.
 * 0 - Quit
 * 1 - Rename your Geniegotchi
 * 2 - Get current stats on Geniegotchi
 * 3 - Feed your Geniegotchi 4 - Play with your Geniegotchi 5 - Ask your fortune! 6 -
 * Print Menu
 * (keep options and functionality the same, but feel free to customize these strings)
 * 2. public static void main(String[] args) :
 * • instantiates a Geniegotchi object;
 * • prints the menu;
 * • repeatedly asks for user to enter menu option and performs appropriate
 * actions given user input until user selects 0;
 * Other than the game stopping when user selects 0 (which should print a nice good bye
 * message), the game should also stop if the Geniegotchi runs out of happiness or
 * endurance (the user is messaged that the Geniegotchi has run away either hungry or
 * unhappy).
 * @author Patrick O'Brien
 * @version 1.0
 * */
public class GeniegotchiDemo
{

    public static void main(String[] args)
    {
        //create variable and read the Geniegotchi.java
        Geniegotchi a = new Geniegotchi();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            //This is where the user inputs the information needed for the switch statement below.
            printMenu();
            int choice = sc.nextInt();

            //this switch statement checks to see which methods are active from Geniegotchi.java.
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the new name for Genie:");
                    String name = sc.next();
                    a.setName(name);
                    break;
                case 2:
                    a.feed();
                    break;
                case 3:
                    a.play();
                    break;
                case 4:
                    a.genieInfo();
                    break;
                case 5:
                    a.askFortune();
                    break;
                case 6:
                    System.exit(0);
                default:   System.out.println("Hey fam, wrong button. Let's try another button, that's a cool trick.");
            }

        }
    }

    //This prints the text for the menu when it is called in the class GeniegotchiDemo.
    public static void printMenu()
    {
        System.out.println("CARE FOR IT, CARE FOR THE GENIE!");
        System.out.println("1. Change the identity of the Genie.");
        System.out.println("2. Supply nutrients to the Genie.");
        System.out.println("3. Play with Genie. ( ͡° ͜ʖ ͡°)");
        System.out.println("4. Judge the Genie, this isn't very nice.");
        System.out.println("5. Force a fortune out of the Genie.");
        System.out.println("6. Terminate the Genie because you're upset.");
        System.out.println("Enter your choice: ");
    }
}
