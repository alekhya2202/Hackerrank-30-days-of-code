/*Objective
In this challenge, we learn about conditional statements. Check out the Tutorial tab for learning materials and an instructional video.

Task
Given an integer, N, perform the following conditional actions:

If N is odd, print Weird
If N is even and in the inclusive range of 2 to 5, print Not Weird
If N is even and in the inclusive range of 6 to 20, print Weird
If N is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, N.

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird
Explanation

Sample Case 0: 
 is odd and odd numbers are weird, so we print Weird.

Sample Case 1: 
 and  is even, so it is not weird. Thus, we print Not Weird.*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if(N % 2 != 0){
            System.out.println("Weird");}
        else{
            if(N >= 2 && N <= 5){
                System.out.println("Not Weird");
            }
            else if(N >= 6 && N <= 20){
                System.out.println("Weird");
            }
            else{
                System.out.println("Not Weird");
            }
        }

        bufferedReader.close();
    }
}
