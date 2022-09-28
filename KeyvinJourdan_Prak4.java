/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyvinjourdan_prak4;

import java.util.Scanner;

public class KeyvinJourdan_Prak4 {

    public static void main(String[] args) {
//        int[] number = {1, 3, 5, 7, 9}; //membuat array
//        
//        //mengeluarkan nilai array menggunakan looping
//        for (int i = 0; i < number.length; i++) { 
//            System.out.println(number[i]);
//        }
//        
//        //mengeluarkan nilai array menggunakan for each
//        for(int num : number){ 
//            System.out.println(num);
//    }
//        Scanner input = new Scanner(System.in);
//        int[] nilai = new int[3];
//        //menginput nilai array menggunakan scanner
//        System.out.print("Nilai matematika  : ");
//            nilai[0] = input.nextInt();
//        System.out.print("Nilai Logika      : ");
//            nilai[1] = input.nextInt();
//        System.out.print("Nilai Bahasa      : ");
//            nilai[2] = input.nextInt();
//        
//       //nilai[1] = 76; // memanipulasi nilai array indeks ke 1 sebelum looping
//        for(int print : nilai){
//            System.out.print(print + " ");
//        }
//         nilai[1] = 76; //memanipulasi nilai array indeks ke 1 sesudah looping
//         
//        for(int print : nilai){
//            System.out.print(print + " ");
//        }
        //Array multidimensi
    int[][] score = {
        {90,75,80}, 
        {80,90,80}, 
        {70,75,95}};
//        System.out.println(score[0][2]);
    
    //Membuat hasil lebih rapi
        for (int []i : score){
            System.out.print("[");
            for(int j : i){
            System.out.print(j + ",");
                
            } System.out.println("]");
           
        }
//        score[0][1] = 70;
//        System.out.println("Nilai  setelah diganti : ");
        
//        for (int []i : score){
//            for(int j : i){
//                System.out.println(j);
//            }
//        }
    }
    
}
