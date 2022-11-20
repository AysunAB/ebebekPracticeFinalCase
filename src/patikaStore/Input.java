package patikaStore;

import static patikaStore.Main.cepTelefonuList;
import static patikaStore.Main.noteBookList;

public class Input {

static void stoktakiUrunler(){


    Urunler_CepTelefonu cep1=new Urunler_CepTelefonu("Iphone 13","185245","APPLE", 25970, 0.03, 5, "128 GB", "6.1 Inc",
    4000, "6 MB", "Siyah");
    cepTelefonuList.add(cep1);
    Urunler_CepTelefonu cep2=new Urunler_CepTelefonu("Iphone 13","185246","APPLE", 24990, 0.03, 5, "64 GB", "6.1 Inc",
            4000, "6 MB", "Siyah");
    cepTelefonuList.add(cep2);
    Urunler_CepTelefonu cep3=new Urunler_CepTelefonu("Iphone 13","185247","APPLE", 25970, 0.03, 5, "128 GB", "6.1 Inc",
            4000, "6 MB", "Kirmizi");
    cepTelefonuList.add(cep3);
    Urunler_CepTelefonu cep4=new Urunler_CepTelefonu("Iphone 13","185249","APPLE", 23970, 0.05, 5, "64 GB", "6.1 Inc",
            4000, "6 MB", "Kirmizi");
    cepTelefonuList.add(cep4);
    Urunler_CepTelefonu cep5=new Urunler_CepTelefonu("Iphone 13","185250","APPLE", 25970, 0.03, 5, "128 GB", "6.1 Inc",
            4000, "6 MB", "Mavi");
    cepTelefonuList.add(cep5);
    Urunler_CepTelefonu cep6=new Urunler_CepTelefonu("Iphone 13","185251","APPLE", 24990, 0.03, 5, "64 GB", "6.1 Inc",
            4000, "6 MB", "Mavi");
    cepTelefonuList.add(cep6);

    Urunler_Notebook notebook1=new Urunler_Notebook("NP940x5n","173190", "SAMSUNG", 23918, 0.05, 6,"512 SSD", "14 Inc", "8 GB");
    noteBookList.add(notebook1);
    Urunler_Notebook notebook2=new Urunler_Notebook("Ideapad flex","535011", "LENOVA", 19990, 0.10, 3,"512 SSD", "14 Inc", "8 GB");
    noteBookList.add(notebook2);
    Urunler_Notebook notebook3=new Urunler_Notebook("Apple Macbook Air","163190", "APPLE", 18990, 0.03, 6,"512 SSD", "14 Inc", "8 GB");
    noteBookList.add(notebook3);
    Urunler_Notebook notebook4=new Urunler_Notebook("Matebook D15","133180", "HUWAI", 18990, 0.10, 6,"512 SSD", "14 Inc", "8 GB");
    noteBookList.add(notebook4);
    Urunler_Notebook notebook5=new Urunler_Notebook("Nirvana X400","124290",  "CASPER", 11437, 0.10, 6,"512 SSD", "14 Inc", "8 GB");
    noteBookList.add(notebook5);
    Urunler_Notebook notebook6=new Urunler_Notebook("Asus X515ea","116789", "ASUS", 18990, 0.10, 6,"512 SSD", "14 Inc", "8 GB");
    noteBookList.add(notebook6);
    Urunler_Notebook notebook7=new Urunler_Notebook("6G0B7EA","14555", "HP", 15990, 0.10, 4,"512 SSD", "14 Inc", "8 GB");
    noteBookList.add(notebook7);
    Urunler_Notebook notebook8=new Urunler_Notebook("Redmibook Pro 15","109001", "XIOMI", 17340, 0.10, 5,"512 SSD", "14 Inc", "8 GB");
    noteBookList.add(notebook8);


}
}
