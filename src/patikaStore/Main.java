package patikaStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {


    static List<Urunler_CepTelefonu> cepTelefonuList = new ArrayList<>();
    static List<Urunler_Notebook> noteBookList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int urunTuru;




    public static void anaMenu() {  //ANA menü

        System.out.println("#### PatikaStore'a HOŞGELDİNİZ ####");
        System.out.println("##### ANA MENÜ #####");
        System.out.println("#####################################");
        System.out.println("#########  1-ÜRÜN LİSTELEME  ##########");
        System.out.println("#########  2-ÜRÜN ARAMA  ###########");
        System.out.println("#########  3-ÜRÜN EKLEME  #######");
        System.out.println("#########  4-ÜRÜN SİLME  ###########");
        System.out.println("#########  5-ANA MENÜ  ##############");
        System.out.println("#########  0-ÇIKIŞ  #################");


        System.out.print("Bir Seçim Yapınız :");
        int secilenIslem = scan.nextInt();

        switch (secilenIslem) {  //secilen işlem
            case 1:
                urunListele();
                anaMenu();
                break;

            case 2:
                urunAra();
                anaMenu();
                break;

            case 3:
                urunEkle();
                anaMenu();
                break;

            case 4:
                urunSil();
                anaMenu();
                break;

            case 5:
                anaMenu();
                break;

            case 0:
                break;

            default:
                System.out.println("yanlis secim yaptiniz");
                break;

        }   //secilen işlem sonu
    }//ANA MENU SONU

    private static void urunListele() {

        System.out.println("Listelemek istediginiz urun turunu seciniz \n1. CEP TELEFONU \n2. NOTEBOOK");
        int select = scan.nextInt();


        if (select == 1) {

            System.out.println("############################");
            System.out.println("## TUM TELEFONLAR ##");
            System.out.println("#############################");

            for (int i = 0; i < cepTelefonuList.size(); i++) {

                System.out.println(cepTelefonuList.get(i));
                System.out.println("...........................");
            }
        } else {

            System.out.println("############################");
            System.out.println("## TUM NOTEBOOKLAR##");
            System.out.println("#############################");
            for (int i = 0; i < noteBookList.size(); i++) {

                System.out.println(noteBookList.get(i));
                System.out.println("...........................");


            }
        }
    }

    private static void urunAra() {
        System.out.println("Aramak istediginiz urun turunu seciniz  \n1. CEP TELEFONU \n2. NOTEBOOK");
        urunTuru = scan.nextInt();
        System.out.println("##### " + urunTuru + "  ARAMA SAYFASI ##### ");
        System.out.print("Aramak istediginiz urunun markasini girin : \nApple  \nAsus \nCasper \nHP \nHuawei \nLenova \nMonster \nSamsung \nXiomi");
        String arananMarka = scan.next().toUpperCase();
        boolean varMi = false;

        if (urunTuru == 1) {
            for (int i = 0; i < cepTelefonuList.size(); i++) {
                if (arananMarka.equals(cepTelefonuList.get(i).getBrand())) {
                    System.out.println(cepTelefonuList.get(i));
                    varMi = true;
                }
            }
            if (varMi == false) System.out.println("Arama sonucu bulunamadi");
        } else {
            for (int i = 0; i < noteBookList.size(); i++) {
                if (arananMarka.equals(noteBookList.get(i).getBrand())) {
                    System.out.println(noteBookList.get(i));
                    varMi = true;
                }
            }
            if (varMi == false) System.out.println("Arama sonucu bulunamadi");
        }
        // urun arama method sonu
    }

    private static void urunEkle() {

        System.out.println("##########################");
        System.out.println("###### URUN EKLEME ######");
        System.out.println("##########################");
        System.out.println("Eklemek istediginiz urun turunu seciniz  \n1. CEP TELEFONU \n2. NOTEBOOK");
        urunTuru = scan.nextInt();

        if (urunTuru == 1) {

            scan.nextLine();
            System.out.print("Urunun adı : ");
            String productName = scan.nextLine();
            System.out.print("Urun ID : ");
            String productId = scan.next();
            System.out.print("Urunun markasi : ");
            String brand = scan.next();
            scan.nextLine(); // dumy;  sout hatası almamak için
            System.out.print("Urunun fiyati : ");
            int productPrice = scan.nextInt();
            System.out.print("Indirim orani : ");
            double discount = scan.nextDouble();
            System.out.print("Stok miktari : ");
            int stock = scan.nextInt();
            System.out.print("Hafiza bilgisi: ");
            String memoryInfo = scan.next();
            System.out.print("Pil Gucu :");
            int batteryPower = scan.nextInt();
            System.out.print("Ekran boyutu: ");
            String screensize = scan.next();
            System.out.print("Ram : ");
            String ram = scan.next();
            System.out.print("Urun rengi :");
            String colour = scan.next();

            Urunler_CepTelefonu cepTelefonu = new Urunler_CepTelefonu(productName, productId, brand, productPrice, discount, stock, memoryInfo, screensize,
                    batteryPower, ram, colour);
            cepTelefonuList.add(cepTelefonu);

        } else {

            scan.nextLine();
            System.out.print("Urunun adı : ");
            String productName = scan.nextLine();
            System.out.print("Urun ID : ");
            String productId = scan.next();
            System.out.print("Urunun markasi : ");
            String brand = scan.next();
            System.out.print("Urunun fiyati : ");
            int productPrice = scan.nextInt();
            scan.nextLine();
            System.out.print("Indirim orani : ");
            double discount = scan.nextDouble();
            System.out.print("Stok miktari : ");
            int stock = scan.nextInt();
            System.out.print("Depolama : ");
            String memory = scan.nextLine();
            System.out.print("Ekran boyutu: ");
            String screenSize = scan.nextLine();
            System.out.println("Ram : ");
            String ram = scan.nextLine();

            Urunler_Notebook notebook = new Urunler_Notebook(productName, productId, brand, productPrice, discount, stock, memory, screenSize, ram);
            noteBookList.add(notebook);
        }
    } // urun ekleme method sonu

    private static void urunSil() {

        System.out.println("##### " + urunTuru + "URUN SILME ##### ");
        scan.nextLine();
        System.out.println("Silmek istediginiz urun turunu seciniz  \n1. CEP TELEFONU \n2. NOTEBOOK");
        urunTuru = scan.nextInt();
        System.out.println("##########################");
        System.out.print("Silmek istediginiz urunun ıd numarasini giriniz:");
        String urunId = scan.next();
        boolean varMi = false;


        if (urunTuru == 1) {
            for (int i = 0; i < cepTelefonuList.size(); i++) {
                if (urunId.equals(cepTelefonuList.get(i).getProductId())) {

                    System.out.println(cepTelefonuList.get(i).getProductId() + " no'lu telefon silindi");
                    cepTelefonuList.remove(i);
                    varMi = true;

                }
            }
            if (varMi == false) System.out.println("Urun bulunamadi");

        } else {
            for (int i = 0; i < noteBookList.size(); i++) {
                if (urunId.equals(noteBookList.get(i).getProductId())) {
                    System.out.println(noteBookList.get(i).getProductId() + " no'lu notebook silindi");
                    noteBookList.remove(i);
                    varMi = true;
                }

            }
            if (varMi == false) System.out.println("Urun bulunamadi");
        }
        //urun silme method sonu
    }
}












