/**
 * Part a: Write a class called Geniegotchi with:
 * 1. Private data fields: name (of String type, initialized to “Bob”), endurance (of int
 * type, initialized to 4) and happiness (of int type, initialized to 3);
 * 2. Public methods:
 * • void setName(String newName) : renames Genie with newName, prints
 * newName confirmation to screen;
 * • void genieInfo() : prints to screen the Genie’s current name, current en-
 * durance level and current happiness level;
 * • int getEndurance() : returns current endurance;
 * • int getHappiness() : returns current happiness;
 * • void feed() : this method increases current endurance by 1 if endurance is
 * less than 10, otherwise it prints a “No, thanks...” message to the screen;
 * • void play() : if happiness is less than 10, then this method increases current
 * happiness by 1 and decreases current endurance by 2, otherwise it prints a
 * “No, thanks...” message to the screen;
 * • void askFortune() :
 * if happiness is greater than 6 and endurance is greater than 5 (that is, if your
 * Genie is happy and healthy enough to predict your fortune...), then:
 * – using Math.random(), pick a random number ran between 1 and 100
 * (inclusive);
 * – display to the screen the fortune from line number ran in the fortunes.txt
 * file;
 * 1if happiness is greater than 6 but endurance is at most 5, then:
 * – display message to screen regarding low endurance;
 * if endurance greater than 5 but happiness is at most 6, then:
 * – display message to screen regarding low happiness;
 * if both endurance and happiness are at most 5 and 6 respectively, then:
 * – display message telling user to feed and play with the Geniegotchi.
 * Regardless of branch, this method should reduce both endurance and hap-
 * piness by 1.
 * @author Patrick O'Brien
 * @version 1.0
 * */

import java.util.Scanner;
import java.io.*;

public class Geniegotchi
{
    private String name = "Bob";
    private int endurance = 4;
    private int happiness = 3;

    //This method sets the name of the Genie
    public void setName(String newName)
    {
        name = newName;
        System.out.println("From now Genie is called: " + name);
    }

    //This method sets the endurance of Genie
    public void setEndurance(int newEndurance)
    {
        endurance = newEndurance;
    }

    //This method sets the happiness of Genie.
    public void setHappiness (int newHappiness)
    {
        happiness = newHappiness;
    }

    //This method accesses the name of the Genie.
    public String getName()
    {
        return name;
    }

    //This method accesses the endurance level of Genie.
    public int getEndurance ()
    {
        return endurance;
    }

    //This method accesses the happiness level of Genie.
    public int getHappiness ()
    {
        return happiness;
    }

    //This method prints the Genie information to screen.
    public void genieInfo()
    {
        System.out.println( "Current name: "+this.getName());
        System.out.println( "Current happiness level: "+this.getHappiness());
        System.out.println( "Current endurance level: "+this.getEndurance());
    }

    //This method feeds the Genie, and increases the endurance by 1.
    public void feed()
    {
        if (this.getEndurance() < 10)
        {
            this.setEndurance(1 + getEndurance());
        }
        else
            System.out.println("No, thanks...");
    }

    //This method plays with the Genie, an increases the happiness by 1, at the cost of 2 endurance levels.
    public void play()
    {
        if (this.getHappiness() < 10)
        {
            this.setHappiness(1+this.getHappiness());
            this.setEndurance(this.getEndurance() - 2);
        }
        else
            System.out.println("No, thanks");
    }

    //this method calculates the score for the Genie (endurance and happiness) and reads the fortune
    public void askFortune()
    {
        if (this.getHappiness() > 6 && this.getEndurance() > 5)
        {
            int wakieBoiNumber = (int)(Math.random() / 100) + 1; //select a random fortune
            Scanner inputStream = null;

            try
            {
                inputStream = new Scanner (new FileInputStream("fortunes.txt")); //change this path depending on file location.
            }
            catch (FileNotFoundException e) //if the file cannot be found, display the error message.
            {
                System.out.println("Error 404: File not found");
                System.exit(0);
            }

            int count = 1;
            //recognize all the lines of the fortunes.txt, print if new fortune
            while (inputStream.hasNextLine())
            {
                String line = inputStream.nextLine();
                if ( count == wakieBoiNumber)
                {
                    System.out.println(line);
                    break;
                }
                count++;
            }
            inputStream.close();
        }

        //if endurance and happiness requirement is not met, print these messages
        else if(this.getHappiness() <= 6 && this.getEndurance() > 5)
        {
            System.out.println("Low in happiness. Can't speculate fortune.");
        }
        else if(this.getHappiness() > 6 && this.getEndurance() <= 5)
        {
            System.out.println("Low Endurance levels. Can't speculate fortune.");
        }

        else
            System.out.println("Feed and play with the Genie to predict the fortune.");
        //assign happiness and endurance
        this.setHappiness(this.getHappiness() - 1);
        this.setEndurance(this.getEndurance() - 1);

    }
}
