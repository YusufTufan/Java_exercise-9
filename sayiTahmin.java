import java.util.Random;
import java.util.Scanner;

public class sayiTahmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int random_number;
       
        random_number = random.nextInt(100)+1;

        while(true){
        System.out.print("Lütfen tahmininizi giriniz: ");
        int tahmin = scanner.nextInt();

        if(random_number==tahmin){
            System.out.print("Tebrik ederiz,Doğru cevap: "+tahmin);
            break;

        }else if(random_number < tahmin){
            System.out.print("Şuanlık cevabın yanlış,Tahmin edilen sayıdan daha yukarıdasın.Tekrar Dene!!");
        }else{
            System.out.print("Şuanlık cevabın yanlış,Tahmin edilen sayıdan daha aşağıdasın.Tekrar Dene!!");
        }
    }
    scanner.close();
    }
}