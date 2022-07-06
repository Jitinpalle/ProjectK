/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.diamond;

/**
 *
 * @author test
 */
import java.util.Scanner;
public class Diamond
{
public static void main(String args[])
{
int n, i, j, space = 1;
System.out.print("Enter the number of rows: ");
Scanner s = new Scanner(System.in);
n = s.nextInt();
space = n - 1;
for (j = 1; j<= n; j++)
{
for (i = 1; i<= space; i++)
{
System.out.print(" ");
}
space--;
for (i = 1; i <= 2 * j - 1; i++)
{
System.out.print("*");
}
System.out.println("");
}
space = 1;
for (j = 1; j<= n - 1; j++)
{
for (i = 1; i<= space; i++)
{
System.out.print(" ");
}
space++;
for (i = 1; i<= 2 * (n - j) - 1; i++)
{
System.out.print("*");
}
System.out.println("Group members");
System.out.println("Jitinloyalist");
System.out.println("Mahesh");
System.out.println("ashaKiran");
System.out.println("Lekhaz A");
System.out.println("Pramodh");
System.out.println("Yashwanth");
System.out.println("Group K");
System.out.println("ASHA");
System.out.println("KIRAN");
System.out.println("Hello World");
System.out.println("canada");
System.out.println("Jitin");
System.out.println("Pramod july 6th update");
}
}
}
