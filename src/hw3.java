import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        if (a>=3 && a<=5) {System.out.println("spring");}
        if (a>=6 && a<=8) {System.out.println("summer");}
        if (a>=9 && a<=11) {System.out.println("autumn");}
        if (a==12 || a==1 || a ==2) {System.out.println("winter");}
    }}

