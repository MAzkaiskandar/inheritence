/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author dell
 */
public class Main {
    public static void main(String[] args) {
        
        //membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();
        
        //membuat objek persegi dan mengisi nilai properti 
        Persegi persegi = new Persegi();
        persegi.sisi = 2;
        
        //membuat objek lingkaran
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        
        //membuat objek persegi panjang dan mengisi nilai properti
        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.lebar = 8;
        persegipanjang.panjang = 4;
        
        //membuat objek Segitiga dan mengisi nilai properti
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 12;
        segitiga.tinggi = 8;
        
        //memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegipanjang.luas();
        persegipanjang.keliling();
        
        segitiga.luas();
        segitiga.keliling();
        
        
            
           
        
        }
    }

