package pks4.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class BEEC1035 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        if ((b > c) && (d > a) && (c+d > a+b) && (c >= 0 && d >= 0) && (a%2 == 0)){
            System.out.printf("Valores aceitos\n");
        }
        else{
            System.out.printf("Valores nao aceitos\n");
        }
    }
}