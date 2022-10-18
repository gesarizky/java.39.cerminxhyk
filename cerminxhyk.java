
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class cerminxhyk {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ********************************* ");

        System.out.println(" *Masukkan Nilai X ");
        System.out.println(" ********************************* ");

        double x = sc.nextInt();

        System.out.println(" ******************************* ");
        System.out.println(" *Masukkan Nilai Y ");
        System.out.println(" ******************************* ");

        double y = sc.nextInt();

        System.out.println(" ********************************* ");
        System.out.println(" *Masukkan Nilai h / k  ");
        System.out.println(" ********************************* ");

        double hk = sc.nextInt();

        double x1 = 2 * hk - x;
        double y1 = 2 * hk - y;

        System.out.println(" ************************************************* ");
        System.out.println(" *Maka Hasil Pencerminan A'(X'Y')***************** ");
        System.out.println(" *Maka A("+x+","+y+") Pada Sumbu X = h = "+hk+"*** ");
        System.out.println(" *Nilai X' = " + x1);
        System.out.println(" *Nilai Y' = " + y);
        System.out.println(" *Maka A("+x+","+y+") Pada Sumbu Y = h = "+hk+"*** ");
        System.out.println(" *Nilai X' = " + x);
        System.out.println(" *Nilai Y' = " + y1);
        System.out.println(" ************************************************* ");
    }
    
}
