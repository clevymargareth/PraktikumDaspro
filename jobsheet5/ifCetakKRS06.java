package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--Print KRS SIAKAD--");
        System.out.println("How the tuition fees been paid in full? (true/false): ");
        boolean uktlunas = sc.nextBoolean();
        if (uktlunas) {
            System.out.println("UKT payment has been verified");
            System.out.println("KRS now can be printed and you ask the academic advisor to sign it.");

        }else {
            System.out.println("Registration rejected. Please pay UKT first");
        }
    
        }
    }


