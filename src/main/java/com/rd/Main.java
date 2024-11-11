package com.rd;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.time.LocalDate;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Kadın ve Erkek personel nesnelerinin oluşturulması
        Personel kadin1 = new Kadin("Aysel", "Karaca", LocalDate.of(1985, 5, 20));
        Personel erkek1 = new Erkek("Celal Selçuk", "KARACA", LocalDate.of(1980, 3, 15));
        Personel erkek2 = new Erkek("Kemal", "Karaca", LocalDate.of(1990, 7, 10));

        // Departman oluşturulması ve takım liderinin atanması
        Departman departman = new Departman("IT", kadin1);

        // Personel ekleme
        departman.personelEkle(erkek1);
        departman.personelEkle(erkek2);

        // Mevcut personelin tekrar eklenmeye çalışılması
        departman.personelEkle(erkek1);

        // Personel çıkarma
        departman.personelCikar(erkek2);

        // Mevcut olmayan personelin çıkarılmaya çalışılması
        departman.personelCikar(erkek2);

        // Takım liderinin değiştirilmesi
        departman.takimLideriDegistir(erkek1);

        // Departmanda olmayan bir personelin takım lideri yapılmaya çalışılması
        Personel kadin2 = new Kadin("Fatma", "Kara", LocalDate.of(1992, 8, 25));
        departman.takimLideriDegistir(kadin2);

        // Görev ekleme
        departman.gorevEkle("Sistem Güncellemesi");
        departman.gorevEkle("Veritabanı Yedekleme");

        // Görev tamamlama
        departman.gorevTamamla("Sistem Güncellemesi");

        // Mevcut olmayan bir görevin tamamlanmaya çalışılması
        departman.gorevTamamla("Ağ Bakımı");

        // Personelin emekliliğe kalan yılının hesaplanması
        System.out.println(kadin1.getAd() + " " + kadin1.getSoyad() + " için emekliliğe kalan yıl: " + kadin1.emekliligeKalanYil());
        System.out.println(erkek1.getAd() + " " + erkek1.getSoyad() + " için emekliliğe kalan yıl: " + erkek1.emekliligeKalanYil());
    }
}