package DaireDilimi;
import java.util.Scanner;
public class DaireDilimininAlani {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r, ma ;
        double pi =3.14, dalan ,dda , cevre ;

        System.out.print("Dairenin yarı çapını giriniz : ");
        r = sc.nextInt();

        System.out.print("Alanaı hesaplanacak dilimin merkez açısını giriniz : ");
        ma = sc.nextInt();

        dalan = pi * r * r;
        cevre = 2 * pi * r ;
        dda = (pi * (r * r) * ma) / 360 ;

        System.out.println("Dairenin alanı : " + dalan);
        System.out.println("Çevre : " + cevre);
        System.out.println("Daire diliminin alanı : " + dda);
    }
}
