package com.rd;

import java.util.ArrayList;
import java.util.List;

public class Departman {
    private String ad;
    private Personel takimLideri;
    private List<Personel> personelListesi;
    private List<String> gorevListesi;

    public Departman(String ad, Personel takimLideri) {
        this.ad = ad;
        this.takimLideri = takimLideri;
        this.personelListesi = new ArrayList<>();
        this.gorevListesi = new ArrayList<>();
        personelEkle(takimLideri);
    }

    public void takimLideriDegistir(Personel yeniTakimLideri) {
        if (personelListesi.contains(yeniTakimLideri)) {
            this.takimLideri = yeniTakimLideri;
            System.out.println("Yeni takım lideri: " + yeniTakimLideri.getAd() + " " + yeniTakimLideri.getSoyad());
        } else {
            System.out.println("Yeni takım lideri departmanda mevcut değil.");
        }
    }

    public void personelEkle(Personel personel) {
        if (!personelListesi.contains(personel)) {
            personelListesi.add(personel);
            System.out.println(personel.getAd() + " " + personel.getSoyad() + " departmana eklendi.");
        } else {
            System.out.println(personel.getAd() + " " + personel.getSoyad() + " zaten departmanda mevcut.");
        }
    }

    public void personelCikar(Personel personel) {
        if (personelListesi.contains(personel)) {
            personelListesi.remove(personel);
            System.out.println(personel.getAd() + " " + personel.getSoyad() + " departmandan çıkarıldı.");
        } else {
            System.out.println(personel.getAd() + " " + personel.getSoyad() + " departmanda mevcut değil.");
        }
    }

    public void personelGuncelle(Personel eskiPersonel, Personel yeniPersonel) {
        int index = personelListesi.indexOf(eskiPersonel);
        if (index != -1) {
            personelListesi.set(index, yeniPersonel);
            System.out.println(eskiPersonel.getAd() + " " + eskiPersonel.getSoyad() + " yerine " + yeniPersonel.getAd() + " " + yeniPersonel.getSoyad() + " eklendi.");
        } else {
            System.out.println("Eski personel departmanda mevcut değil.");
        }
    }

    public void gorevEkle(String gorev) {
        gorevListesi.add(gorev);
        System.out.println("'" + gorev + "' görevi eklendi.");
    }

    public void gorevTamamla(String gorev) {
        if (gorevListesi.contains(gorev)) {
            gorevListesi.remove(gorev);
            System.out.println("'" + gorev + "' görevi tamamlandı.");
        } else {
            System.out.println("'" + gorev + "' görevi bulunamadı.");
        }
    }
}
