import java.util.Scanner;

public class Soal_5 {
    public static void main(String[] args) {
        Binarytree mytree = new Binarytree();
        Scanner s = new Scanner(System.in);

        // int x = 0;
        // System.out.println("Masukkan binary tree!");
        // while(x != 999){
        //     x = s.nextInt();
        //     if(x != 999 && x %2 == 0){
        //         mytree.append(x);
        //     }
        // }

        // mytree.cetakPreOrder();

        mytree.append(99);
        mytree.append(12);
        mytree.append(15);
        mytree.append(18);
        mytree.append(2);
        
       
        mytree.cetakPreOrder();
      
            
        // }
        


    }
}
