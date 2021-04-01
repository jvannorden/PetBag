// Jamila Van Norden IT-145-X4235, The TODO's are for me. I am pulling the file from
// the final projects program code. I hope that's ok.
package com.company;
import java.util.Scanner;
import java.util.Date;

public class Pet {
    public Scanner input = new Scanner(System.in);
    // instance variables, this.petAge = petAge
    public String petType;
    public String petName;
    public int petAge;
    public int dogSpaces = 30;
    public int catSpaces = 12;
    public int daysStay;
    public double amountDue;

    // Constructor with all parameters
    public Pet(String petType, String petName, int petAge, int dogSpaces, int catSpaces, int daysStay,
               double amountDue) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.dogSpaces = dogSpaces;
        this.catSpaces = catSpaces;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
    }

    // Constructor if called with no parameter's will fill with the following default data. 0's and -1's
    // will prompt user for additional information when called.
    public Pet() {
        this.petType = "DEFAULT";
        this.petName = "DEFAULT";
        this.petAge = 0;
        this.dogSpaces = -1;
        this.catSpaces = -1;
        this.daysStay = -1;
        this.amountDue = -1.0;

    }

    // assessor method for petType, returns pet type.
    public String getPetType() {
        return petType;
    }

    // mutator method for petType, with parameter new value of petType.
    public void setPetType() {
        System.out.println("Enter pet Type (dog or cat): ");
        String petType =  input.nextLine().toLowerCase();
        // If the petType entered is dog (ignoring the case), set the petType as dog.
        // Validates user input and OUTPUTS selection to screen.
        if (petType.equalsIgnoreCase("dog")) {
            this.petType = "dog";
            System.out.println("You have selected " + this.petType + " as the pet type.");

        // If the petType entered is cat (ignoring the case), set the petType as cat.
        // Validates user input and OUTPUTS selection to screen.
        } else if (petType.equalsIgnoreCase("cat")) {
            this.petType = "cat";
            System.out.println("You have selected " + this.petType + " as the pet type.");
        // If the user enters anything outside of dog and cat, OUTPUT error message.
        //TODO fix this random print out, before an initial pet type is entered.
        } else {
            System.out.println("ERROR: Choose a valid pet Type.\nEnter \"cat\" or \"dog\".");
            setPetType();
        }
    }

    // assessor method for petName, returns pet name.
    public  String getPetName() {
        return petName;
    }

    // mutator method for petName, with parameter new value of petName.
    // validating regular expressions(regEx) escaping all digits in the string petName.
    // I am still working on figuring out how to check if the string has digits.
    // so for now the program is forcing the change.
    public void setPetName() {
        System.out.println("Enter the Pets name: ");
        this.petName = input.nextLine().replaceAll("\\d", "");
        System.out.println("Pet name set as: " + getPetName());
    }

    // assessor method for petAge, returns pet age.
    public int getPetAge() {
        return petAge;
    }

    // mutator method for petAge, with parameter new value of petAge.
    // validating the user input by escaping all chars.
    public void setPetAge() {
        System.out.println("Enter pet age: ");
        int petAge = input.nextInt();
        if((petAge < 0) || (petAge > 99)){
            System.out.println("ERROR: Enter a valid age 0-99:");
            setPetAge();
        }else {
            this.petAge = petAge;
            System.out.println("Pet Age set as " + getPetAge());
        }

    }

    // Assessor method for dogSpaces, returns dogSpaces.
    public int getDogSpaces() {
        return dogSpaces;
    }

    // Mutator method for dogSpaces, with parameter new value of dogSpaces.
    // Will attempt to use a hash map or tree map, maybe. I am not sure the best way
    // to approach this at this point in the course. I also maybe other thinking this
    // section for the purpose of this course. Is this supposed to be a list? Or is it supposed
    // to function like a professional application.
    public void setDogSpaces(int dogSpaces) {
        this.dogSpaces = dogSpaces;
    }

    // assessor method for catSpaces, returns catSpaces.
    public int getCatSpaces() {
        return catSpaces;
    }

    // mutator method for catSpaces, with parameter new value of catSpaces.
    // See lines 110-113, same idea.
    public void setCatSpaces(int catSpaces) {
        this.catSpaces = catSpaces;
    }

    // assessor method for DaysStay, returns DaysStay.
    public int getDaysStay() {
        return daysStay;
    }

    // mutator method for daysStay, with parameter new value of daysStay.
    // TODO catch exception, output and call self recursively for appropriate
    // TODO user input.
    // I am also not sure how much validation of user input is necessary.
    // I am still researching the best way to implement.
    public void  setDaysStay() {
        System.out.println("Enter the amount of days staying: ");
        this.daysStay = input.nextInt();
    }

    // assessor method for amountDue, returns amountDue.
    // not necessary for the pet check in method.
    public double getAmountDue() {
        return amountDue;
    }

    // mutator method for amountDue, with parameter new value of amountDue.
    // not necessary for the pet check in method.
    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
}
