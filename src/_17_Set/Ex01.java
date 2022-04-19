package _17_Set;

import java.util.HashSet;

public class Ex01 {

    /* TASK:
    parametresi Integer set ve integer array ve adi elementEkle
    olan array elemanları set' e convert eden bir method create ediniz .
    yine set icindekileri yazdiracak ayrica bir metod daha create edip print ediniz.
     */

    public static void main(String[] args) {

        HashSet<Integer>hs=new HashSet<>();
        int arr[]=new int[]{1,2,3,4,5,6,7};

        elementEkle(arr,hs);
    }

    private static void elementEkle(int[] arr, HashSet<Integer> hs) {


        HashSet<Integer> hs2=new HashSet<>();
        for (Integer sayi:arr) {

            hs.add(sayi);
        }
        yazdır(hs);

    }
    public static void yazdır(HashSet<Integer>hs){
        for (Integer s:hs) {

            System.out.print(s);
        }

    }
}
