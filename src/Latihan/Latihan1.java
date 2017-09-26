package Latihan;
/**
 *
 * @author MirzaUY
 */
public class Latihan1 {
    //Array SINGLE DIMENSI
    public static void main(String [] args){
     int nilai [] = new int [3];
     nilai [0] = 70;
     nilai [1] = 80;
     nilai [2] = 65;
     double rata = 0.0;
     for (int i=0;i<nilai.length;i++){
     rata+=nilai[i];
     rata/=nilai.length;
     System.out.println("Nilai Rata-Rata = "+ rata);
     }
    }
}
