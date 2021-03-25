import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        // dost sayı bulma
        int xtop = 0, ytop = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi 1 giriniz: ");
        int x = input.nextInt();
        System.out.print("Sayi 2 giriniz: ");
        int y = input.nextInt();
        int xsayac = x;
        int ysayac = y;
        xsayac--;
        while (xsayac != 0) {
            if (x % xsayac == 0) {
                xtop += xsayac;
            }
            xsayac--;
        }
        ysayac--;
        while (ysayac != 0) {
            if (y % ysayac == 0) {
                ytop += ysayac;
            }
            ysayac--;
        }
        if (xtop == y && ytop == x) {
            System.out.println("Dost sayilar");
        } else {
            System.out.println("Dost sayi degiller");
        }

    }
}
