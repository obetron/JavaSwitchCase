package com.mobilhanem.ders;

/**
 * Created by ErenBasaran on 30/08/16. erenbasaran@gmail.com
 * https://www.mobilhanem.com
 */
public class SwitchCaseSample {

    public static void main(String[] args) {

        //Secilen ay degeri
        int ayDegeri = 7;
        //Yazdirilacak ay degeri
        String ayDegeriStr = null;

        //switch - case ile hanig ayın hangi sayıya denk geldiginin belirtildigi bolum
        switch(ayDegeri) {

            case 1:
                ayDegeriStr = "Ocak";
                break;
            case 2:
                ayDegeriStr = "Şubat";
                break;
            case 3:
                ayDegeriStr = "Mart";
                break;
            case 4:
                ayDegeriStr = "Nisan";
                break;
            case 5:
                ayDegeriStr = "Mayıs";
                break;
            case 6:
                ayDegeriStr = "Haziran";
                break;
            case 7:
                ayDegeriStr = "Temmuz";
                break;
            case 8:
                ayDegeriStr = "Ağustos";
                break;
            case 9:
                ayDegeriStr = "Eylül";
                break;
            case 10:
                ayDegeriStr = "Ekim";
                break;
            case 11:
                ayDegeriStr = "Kasım";
                break;
            case 12:
                ayDegeriStr = "Aralık";
                break;

        }

        //Konsol ekranina secilen ayin yazdirildigi bolum
        System.out.println("Seçilen Ay Değeri: " + ayDegeriStr);

    }

}
