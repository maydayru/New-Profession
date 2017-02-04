package Hashmaker;

import Database.Auth;

import java.util.Scanner;

/**
 * Created by Mayday on 29.01.2017.
 */
public class Hash {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Input pass: ");
        String pass=in.nextLine();
        String passHash= Auth.getHash(pass);
        System.out.println("Hash for pass "+pass+ " is: "+passHash);
    }
}
