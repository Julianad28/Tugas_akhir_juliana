/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juliana.nilai_rapor;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
class rapor {
  int nomor_siswa,kelas;
  String hasil_pengumuman;
double nilai_mtk,nilai_bahasaindonesia,nilai_bahasainggris,nilai_ipa,nilai_ips,nilai_agama,nilai_olahraga,jumlah,ratarata;
Scanner input= new Scanner(System.in);

public rapor (){
   nomor_siswa =0;
   kelas=0;
   nilai_mtk=0;
   nilai_bahasaindonesia=0;
   nilai_bahasainggris=0;
   nilai_ipa=0;
   nilai_ips=0;
   nilai_agama=0;
   nilai_olahraga=0;
   jumlah=0;
    hasil_pengumuman="";
    ratarata=0;
    
}
public void input(){
   System.out.println("Selamat datang di program nilai rapor");
   System.out.println("=========================================");
   System.out.println("Inputkan Data Anda");
   System.out.print("Masukkan Nomor Siswa : ");
   if(!input.hasNextInt())
     {
         System.out.print("Harus angka! Tidak bisa diproses");
     }
     else
     { nomor_siswa=input.nextInt();
             
             }
    
   System.out.print("Masukkan Kelas : ");
    if(!input.hasNextInt())
     {
         System.out.print("Harus angka! Tidak bisa diproses");
     }
     else
     { kelas=input.nextInt();
             
             }
    
   System.out.print("Masukkan Nilai Matematika : ");
   if(!input.hasNextDouble())
     {
         System.out.print("Harus angka! Tidak bisa diproses");
     }
     else
     {  nilai_mtk=input.nextDouble();
             
             }
   System.out.print("Masukkan Nilai Bahasa Indonesia : ");
    if(!input.hasNextDouble())
     {
         System.out.print("Harus angka! Tidak bisa diproses");
     }
     else
     {    nilai_bahasaindonesia=input.nextDouble();
             
             }
   System.out.print("Masukkan Nilai Bahasa Inggris : ");
 if(!input.hasNextDouble())
     {
         System.out.print("Harus angka! Tidak bisa diproses");
     }
     else
     {   nilai_bahasainggris=input.nextDouble();
             
             }
   System.out.print("Masukkan Nilai IPA : ");
    if(!input.hasNextDouble())
     {
         System.out.print("Harus angka! Tidak bisa diproses");
     }
     else
     {    nilai_ipa=input.nextDouble();
     }
             
   System.out.print("Masukkan Nilai IPS : ");
    if(!input.hasNextDouble())
     {
         System.out.print("Harus angka! Tidak bisa diproses");
     }
     else
     {    nilai_ips=input.nextDouble();
     }
   System.out.print("Masukkan Nilai Agama : ");
    if(!input.hasNextDouble())
     {
         System.out.print("Harus angka! Tidak bisa diproses");
     }
     else
     {       nilai_agama=input.nextDouble();
     }
   System.out.print("Masukkan Nilai Olahraga : ");
     if(!input.hasNextDouble())
     {
         System.out.print("Harus angka! Tidak bisa diproses");
     }
     else
     {       nilai_olahraga=input.nextDouble();
     }
   
}

 public double jumlahnilai(){
     jumlah=nilai_mtk+nilai_bahasaindonesia+nilai_bahasainggris+nilai_ipa+nilai_ips+nilai_agama+nilai_olahraga;
     return(jumlah);
 }
 public void if_else (){
     if (ratarata()>7){
    hasil_pengumuman="Naik Kelas";
}
else if (ratarata()<=7){
    hasil_pengumuman="Tidak Naik Kelas";
}
 }
 public double ratarata(){
     ratarata=jumlah/7;
     return ratarata;
 }
 public void output (){
   System.out.println("Nomor Siswa : "+nomor_siswa);
   System.out.println("Kelas : "+kelas);
   jumlahnilai();
   System.out.println("Jumlah Nilai "+jumlah);
   ratarata();
   System.out.println("Rata - Rata : "+ratarata);
   if_else();
   System.out.print("Hasil pengumuman : "+hasil_pengumuman);
 }
}
public class JulianaNilai_rapor {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        rapor nilai = new rapor();
        nilai.input();
        nilai.output();
    }
    
}

