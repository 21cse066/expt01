/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21cse066
 */
import java.util.Scanner;
public class minimum {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER a:");
        int a = obj.nextInt();
        System.out.println("ENTER b:");
        int b = obj.nextInt();
        int min = (a>b)?a:b;
        System.out.println("MINIMUM IS : "+a);
        
    }
    
}
