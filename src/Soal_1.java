import java.util.Scanner;

public class Soal_1 {
    public static void main(String[] args) {
        Linkedlist listku = new Linkedlist();
        Scanner s = new Scanner(System.in);
        int x = 0;
//SOAL NOMOR 1
        // System.out.println("Masukkan angka! ");
        // while(x != 999){
        //     x = s.nextInt();
        //     if(x != 999){
        //         listku.append(x);
        //     }
        // }
        

        // listku.cetakList();

//SOAL NOMOR 2
        System.out.println("Masukkan angka! ");
        while(x != 999){
            x = s.nextInt();
            if(x!= 999){
                listku.insertFirst(x);
            }
        }        
        listku.cetakList();
        // System.out.print("Masukkan yang dicari! ");
        // int cari = s.nextInt();

        // System.out.println(listku.cari(cari));

        System.out.println(listku.jumlah());
    }
}
