package tugas2a;

import java.util.Scanner;

public class BilanganKompleks {
    
    static int b,a;
    
     public static void cari(String C, int A1, int A2, int B1, int B2) {
        if (A1==0 && A2 == 0) {
            a = ubah("0");
        }
        else {
            String real = C.substring(A1,A2);
            a = ubah(real);
        }
        String imajiner = C.substring(B1,B2);
        b = ubah(imajiner);
    }
    
      public static int ubah(String huruf) {
        int angka = Integer.parseInt(huruf);
        return angka;
    }
    
    public static void main(String[] args) {
        
        Scanner baca=new Scanner(System.in);
        String p1 = baca.nextLine();
        String p2 = baca.nextLine();
        
        char[] arrayp1 = p1.toCharArray();
        int banyakp1 = arrayp1.length; 
        
        char[] arrayp2 = p2.toCharArray();
        int banyakp2 = arrayp2.length;
        
        System.out.println(" ");
        
        if (banyakp1 == 4 && banyakp2 == 4) {
            cari(p1,0,1,1,3);
            int a1=a;
            int b1=b;
            
            cari(p2,0,1,1,3);
            int a2=a;
            int b2=b;
            
            print(b1,b2,a1,a2);
        }
        
        else if (banyakp1 == 2 && banyakp2 == 4) {
            
            cari(p1,0,0,0,1);
            int a1=0;
            int b1=b;
            
            cari(p2,0,1,1,3);
            int a2=a;
            int b2=b;
            
            print(b1,b2,a1,a2);
        }
    }  
    
    public static void print(int b1,int b2,int a1,int a2) {
        int hasilA = (a1*a2) - (b1*b2);
        
        int hasilB = (a1*b2) + (b1*a2);
        
        System.out.println(hasilA + "+" + hasilB + "i");
    }
    
}
