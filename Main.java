/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat_bab8;

/**
 *
 * @author nuel
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner nu=new Scanner(System.in);
        double angka;
        System.out.print("Input Angka :  ");
         angka=nu.nextDouble();
        data_type data=new data_type();
        if(angka%0.5==0 && angka%1==0){
            data.methodD1();
        }
        else {
            data.methodL1();
        }
    }
}
