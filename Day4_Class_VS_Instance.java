/*Objective
In this challenge, we're going to learn about the difference between a class and an instance; because this is an Object Oriented concept, it's only enabled in certain languages. Check out the Tutorial tab for learning materials and an instructional video!

Task
Write a Person class with an instance variable,age, and a constructor that takes an integer,initial age, as a parameter. The constructor must assign  to  after confirming the argument passed as  is not negative; if a negative argument is passed as , the constructor should set  to  and print Age is not valid, setting age to 0.. In addition, you must write the following instance methods:

yearPasses() should increase the  instance variable by .
amIOld() should perform the following conditional actions:
If , print You are young..
If  and , print You are a teenager..
Otherwise, print You are old..
To help you learn by example and complete this challenge, much of the code is provided for you, but you'll be writing everything in the future. The code that creates each instance of your Person class is in the main method. Don't worry if you don't understand it all quite yet!

Note: Do not remove or alter the stub code in the editor.*/
import java.io.*;
import java.util.*;


public class Person { private int age; public Person(int initialAge) {
     // Add some more code to run some checks on initialAge 
     if(initialAge<0){
        age=0; System.out.println("Age is not valid, setting age to 0."); } 
     else{
        age=initialAge; } 
    } 
    public void amIOld(){
         // Write code determining if this person's age is old and print the correct                    statement: 
        if(age<13) { 
            System.out.println("You are young."); } 
        else if(age>=13 && age<18) { 
            System.out.println("You are a teenager."); } 
        else { System.out.println("You are old."); } 
    } 
    public void yearPasses() { // Increment this person's age. 
        age++; }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
