/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO6;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja pembeli = new KeranjangBelanja(3);
        
        pembeli.keranjangBelanja(new Buku("Majalah Bobo", 240000));
        pembeli.keranjangBelanja(new Elektronik("TV", 2000000));
        pembeli.keranjangBelanja(new Pakaian("Celana Jeans", 900000));
        
        pembeli.detailbarang();
        
        double totalHarga = pembeli.hitungHarga();
        System.out.println("Total harga sebelum diskon : " + totalHarga);
        double totalHargaDiskon = pembeli.hitungHargaDiskon();
        System.out.println("Total harga setelah diskon : " + totalHargaDiskon);
    }
}
