# Guess the Number Game
Bu Java programı, bilgisayarın rastgele bir sayı seçtiği ve kullanıcının bu sayıyı tahmin etmeye çalıştığı bir oyunu simüle eder.

## Kullanım
Programı çalıştırmak için bir Java IDE'si kullanarak veya terminalde aşağıdaki adımları takip ederek çalıştırabilirsiniz:

1. Java derleyicisi ile `sayiTahmin.java` dosyasını derleyin:  
   ```
   javac sayiTahmin.java
   ```

2. Oluşturulan `.class` dosyasını çalıştırın:  
   ```
   java sayiTahmin
   ```

3. Program, bir sayı tahmini isteyecek. Bir sayı girin ve program, seçilen rastgele sayıyla karşılaştırarak size geri bildirimde bulunacaktır.

## Oyun Akışı
- Bilgisayar rastgele bir sayı seçer (1 ile 100 arasında).
- Kullanıcıdan bir tahmin istenir.
- Kullanıcının tahmini ile bilgisayarın seçtiği sayı karşılaştırılır.
- Eğer tahmin doğru ise, tebrik mesajı gösterilir ve oyun biter.
- Eğer tahmin yanlış ise, kullanıcıya doğru yönlendirme yapılır ve yeni bir tahmin istenir.

## Notlar
- Program, kullanıcıdan girdi almak için `Scanner` sınıfını kullanır.
- Bilgisayarın rastgele sayı seçmesi için `Random` sınıfı kullanılır.
- Oyun, kullanıcının 1 ile 100 arasında bir sayı tahmin etmesini sağlar.

Bu README dosyası, programın nasıl çalıştırılacağını, oyunun akışını, programın kullanımını ve diğer bazı bilgileri açıklar. Ayrıca, katkıları nasıl yapabileceğiniz hakkında bilgi verir ve projenin lisansını belirtir.
