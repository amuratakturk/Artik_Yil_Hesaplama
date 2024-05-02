import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 4 'e tam bölünecek
        //100'ün katlarından 400'ün katları olanlar sayılacak

        Scanner input = new Scanner(System.in);
        System.out.println("Yıl Giriniz : ");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " Artık Yıldır");

        } else {
            System.out.println(year + "Artık Yıl Değildir.");
        }
    }
}
