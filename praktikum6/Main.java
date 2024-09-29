/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan();
        kucing.bersuara();              //Output: Hewan bersuara
        kucing.makan("ikan");           //Memanggil metode makan() dari kelas Hewan
        kucing.makan("tulang", 2);      //Memanggil metode makan() yang overloaded
        System.out.println();
        
        Hewan hewan = new Kucing();
        hewan.bersuara();               //Output: Miaaaowwww
        
        Kucing cat = new Kucing();
        cat.makan("ikan");              //memanggil metode makan() dari kelas Hewan
        cat.makan("tulang", 2);         //Memanggil metode makan() yang overloaded
        System.out.println();
        
        Anjing anjing = new Anjing();
        anjing.bersuara();              //Output: Wooofff Wooofff
        anjing.makan("daging", 3);      //Memanggil metode makan() yang overloaded
    }
}
