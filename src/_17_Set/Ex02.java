package _17_Set;

import java.util.ArrayList;
import java.util.Collections;

public class Ex02 {

    /*  Method:
           10 ve 5 elemanli, elemanlari 0-20 arasinda değer alan 2 adet  ArrayList create edin ve
        elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
        sonucta bir ArrayList return eden bir method yaziniz
        main:
        1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli
            elemanlari 0-20 arasinda 2 adet ArrayList olusturun
        2.  Bu iki list'in ortak elemanlarini bulunuz
        3.  Bu iki list'in farkli olan elemanlarini bulunuz
        4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz

     */


    public static void main(String[] args) {

        ArrayList<Integer>arrList1 = new ArrayList<>();
        ArrayList<Integer>arrList2 = new ArrayList<>();


        arrList1=arrlisHazırla(10,0,20);
        arrList2=arrlisHazırla(5,0,20);

        System.out.println(arrList1);
        System.out.println(arrList2);

     // // arrList1.retainAll(arrList2);
     //  //System.out.println("ortak eleman:"+arrList1);

     //  arrList1.removeAll(arrList2);//list1 den list2 çıkaralacak list1 de olup list 2 de olmayan yani
     //                               //farklı elemanların olduğu list create edildi.
     //  System.out.println(arrList1);
     //  arrList2.removeAll(arrList1);//list2 den list1 çıkaralacak list2 de olup list 1 de olmayan yani
     //                              //farklı elemanların olduğu list create edildi.
     //  System.out.println(arrList2);


        ArrayList<Integer> arayListFark1 = new ArrayList<>();// list 1 de olup list2 de olmayanlar==>list1-list2
        ArrayList<Integer> arayListFark2 = new ArrayList<>();// list 2 de olup list1 de olmayanlar==>list2-list1


        arayListFark1=arrList1;
        arayListFark1.removeAll(arrList2);
        System.out.println("farklı list1:"+arayListFark1);
        arayListFark2=arrList2;
        arayListFark2.removeAll(arrList1);
        System.out.println("farklı list2:"+arayListFark2);


    }//********Mat.random()==>[0,1)değerlerini verir.********


    public static int getRandomInt(int min,int max){// bu method max ile min arası sayı return eder.

        return (int) (Math.random()*(max-min+1));
    }


    private static ArrayList<Integer> arrlisHazırla(int size, int min, int max) {// bu method create edilecek arrList size kadar
                                                                            //min ile max

       ArrayList<Integer>bosList = new ArrayList<Integer>();

        for (int j = 0; j <size ; j++) {
            bosList.add(getRandomInt(min,max));

        }
        return bosList;
    }
}
