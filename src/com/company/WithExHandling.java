package com.company;
public class WithExHandling {
    public static void main(String[] args) {
        int [] arr = {1,2,4,0,6};
        try {
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]/0);
            System.out.println(arr[3]);
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException name){      //name eto chto za.....
            System.out.println("Вышли за рамки массива");
            System.out.println(name.getMessage());
            name.printStackTrace();
        }catch (ArithmeticException name1) {
            System.out.println("Арифметическая ошибка");
            System.out.println(name1.getMessage());
            name1.printStackTrace();
        }catch (Exception name2){
            System.out.println("Другая ошибка");
            System.out.println(name2.getMessage());
        }finally {
            System.out.println("Блок финала");
        }
        System.out.println("Вес массив");
        System.out.println("Ураа");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Элемент под индексом " + i + " " + arr[i]);
        }
    }
    public void String () {
        int[] arr = {1,2,3,4,5};
        try {
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]);
            System.out.println(arr[3]);
            System.out.println(arr[4]);
        }catch (ArrayIndexOutOfBoundsException ss){
            System.out.println("knmkispsj");
            System.out.println(ss.getMessage());
            ss.printStackTrace();
        }catch (ArithmeticException dd){
            System.out.println("kdmidi");
            System.out.println(dd.getMessage());
            dd.printStackTrace();
        }catch (Exception kk){
            System.out.println("ksdmksmk");
        }finally {
            System.out.println("klsnfisji");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("skldnfss" + i + arr[i]);

        }
    }
}

