package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

//метод для замены элементов массива по индексам------------------------------------------------------------------------
    public static  <T> T[]  replaceElement(T[] items, int pos1, int pos2) {

        if(items[pos1]!=null&items[pos2]!=null){
            T temp;                  //объявляю обобщенную переменную как буфер для рокеровки элементов массива
            temp=items[pos1];        //из первого указанного индекса массива получаю значание и кладу в temp
            items[pos1]=items[pos2]; //копирование из второго элеменнта массива в первый
            items[pos2]=temp;        //копирование из буфера первоначального значения элемента по индексу pos1
        }
        return items;                //возвращаю массив с рокеровкой указаных элементов
    }


    public static void main(String[] args) {

//Проверка массива с типом данных String--------------------------------------------------------------------------------
        String[] strArray = new String[] {"Ваня", "Маша", "Жорик"};
        System.out.println(strArray[0]);
        System.out.println(strArray[1]);
        System.out.println(strArray[2]);
        strArray=replaceElement(strArray,0,1);
        System.out.println('\n'+strArray[0]);
        System.out.println(strArray[1]);
        System.out.println(strArray[2]);
        System.out.println("---------------------");
//Проверка массива с типом данных Integer-------------------------------------------------------------------------------
        Integer intArray[]={5,6,8};
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        intArray=replaceElement(intArray,0,1);
        System.out.println('\n'+""+intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println("---------------------");
//Проверка массива с типом данных Cat-----------------------------------------------------------------------------------
        Cat[] cats = new Cat[20];
        cats[0]=new Cat("Tom");
        cats[1]=new Cat("Tyzik");
        cats[2]=new Cat("Masik");
        cats[3]=new Cat("Masik");
        System.out.println(cats[0]);
        System.out.println(cats[1]);
        System.out.println(cats[2]);
        System.out.println(cats[3]);
        cats=replaceElement(cats,0,1);
        System.out.println('\n'+""+cats[0]);
        System.out.println(cats[1]);
        System.out.println(cats[2]);
        System.out.println(cats[3]);
        System.out.println("---------------------");
//Проверка массива с типом данных Boolean-------------------------------------------------------------------------------
        Boolean[] arrbool=new Boolean[20];
        arrbool[0]=true;
        arrbool[1]=false;
        arrbool[2]=true;
        System.out.println(arrbool[0]);
        System.out.println(arrbool[1]);
        System.out.println(arrbool[2]);
        arrbool=replaceElement(arrbool,0,1);
        System.out.println('\n'+""+arrbool[0]);
        System.out.println(arrbool[1]);
        System.out.println(arrbool[2]);
        System.out.println("---------------------");
    }
}
