package patikaStore;

import static patikaStore.Main.cepTelefonuList;
import static patikaStore.Main.noteBookList;

public class Input {

static void stoktakiUrunler(){


    Products_Phones cep1=new Products_Phones("Iphone 13","185245","APPLE", 25970, 0.03, 5, "128 GB", "6.1 Inc",
    4000, "6 MB", "Siyah");
    cepTelefonuList.add(cep1);
    Products_Phones cep2=new Products_Phones("Iphone 13","185246","APPLE", 24990, 0.03, 5, "64 GB", "6.1 Inc",
            4000, "6 MB", "Siyah");
    cepTelefonuList.add(cep2);
    Products_Phones cep3=new Products_Phones("Iphone 13","185247","APPLE", 25970, 0.03, 5, "128 GB", "6.1 Inc",
            4000, "6 MB", "Kirmizi");
    cepTelefonuList.add(cep3);
    Products_Phones cep4=new Products_Phones("Iphone 13","185249","APPLE", 23970, 0.05, 5, "64 GB", "6.1 Inc",
            4000, "6 MB", "Kirmizi");
    cepTelefonuList.add(cep4);
    Products_Phones cep5=new Products_Phones("Iphone 13","185250","APPLE", 25970, 0.03, 5, "128 GB", "6.1 Inc",
            4000, "6 MB", "Mavi");
    cepTelefonuList.add(cep5);
    Products_Phones cep6=new Products_Phones("Iphone 13","185251","APPLE", 24990, 0.03, 5, "64 GB", "6.1 Inc",
            4000, "6 MB", "Mavi");
    cepTelefonuList.add(cep6);

    Products_Notebooks notebook1=new Products_Notebooks("NP940x5n","173190", "SAMSUNG", 23918, 0.05, 6,"512 SSD", "14 Inc", "8 GB");
    noteBookList.add(notebook1);
    Products_Notebooks notebook2=new Products_Notebooks("Ideapad flex","535011", "LENOVA", 19990, 0.10, 3,"512 SSD", "14 Inc", "8 GB");
    noteBookList.add(notebook2);
    Products_Notebooks notebook3=new Products_Notebooks("Apple Macbook Air","163190", "APPLE", 18990, 0.03, 6,"512 SSD", "14 Inc", "8 GB");
    noteBookList.add(notebook3);
    Products_Notebooks notebook4=new Products_Notebooks("Matebook D15","133180", "HUWAI", 18990, 0.10, 6,"512 SSD", "14 Inc", "8 GB");
    noteBookList.add(notebook4);
    Products_Notebooks notebook5=new Products_Notebooks("Nirvana X400","124290",  "CASPER", 11437, 0.10, 6,"512 SSD", "14 Inc", "8 GB");
    noteBookList.add(notebook5);
    Products_Notebooks notebook6=new Products_Notebooks("Asus X515ea","116789", "ASUS", 18990, 0.10, 6,"512 SSD", "14 Inc", "8 GB");
    noteBookList.add(notebook6);
    Products_Notebooks notebook7=new Products_Notebooks("6G0B7EA","14555", "HP", 15990, 0.10, 4,"512 SSD", "14 Inc", "8 GB");
    noteBookList.add(notebook7);
    Products_Notebooks notebook8=new Products_Notebooks("Redmibook Pro 15","109001", "XIOMI", 17340, 0.10, 5,"512 SSD", "14 Inc", "8 GB");
    noteBookList.add(notebook8);


}
}
