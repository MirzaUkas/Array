package Latihan;

/**
 *
 * @author MirzaUY
 */
public class Latihan4 {
    int nis[][]={{210651},{210652},{210653}};
    String nama[][]={{"Rifki Wildan"},{"Alfin Rizky"},{"Lucky Ardisa"}};
    
    public void tampil(String n){
        System.out.println("Indentitas Siswa Angkatan 25");
    }
    public void NamaNis(int n){
        for(int i=0;i<3;i++){
            for(int j=0;j<1;j++){
                System.out.println(nama[i][j] +" : "+ nis[i][j]);
            }
        }
    } 
    public static void main(String[]args){
    Latihan4 siswa = new Latihan4();
    siswa.tampil(null);
    siswa.NamaNis(0);
    }
}
