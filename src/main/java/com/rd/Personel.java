package com.rd;

import java.time.LocalDate;
import java.time.Period;

public abstract class Personel {
    private String ad;
    private String soyad;
    private LocalDate dogumTarihi;

    public Personel(String ad, String soyad, LocalDate dogumTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public int yasHesapla() {
        return Period.between(dogumTarihi, LocalDate.now()).getYears();
    }

    public abstract int emekliligeKalanYil();
}

class Kadin extends Personel {
    private static final int EMEKLILIK_YASI = 60;

    public Kadin(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public int emekliligeKalanYil() {
        int kalanYil = EMEKLILIK_YASI - yasHesapla();
        return Math.max(kalanYil, 0);
    }
}

class Erkek extends Personel {
    private static final int EMEKLILIK_YASI = 65;

    public Erkek(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public int emekliligeKalanYil() {
        int kalanYil = EMEKLILIK_YASI - yasHesapla();
        return Math.max(kalanYil, 0);
    }
}
