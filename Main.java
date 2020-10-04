package com.company;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,19,6,7,8,9,10};
        TaskA(array);

        int[] fibo=new int[50];
        int count=10;
        TaskB(fibo,count);

        int[] nums = new int[] {22, 77, 15, -29, 55};
        TaskC(nums);
    }

    static void TaskA(int[] array){
        boolean sorted= true;

        if (array[0] < array[1]) {
            System.out.println("Возрастает.");

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                System.out.println("Массив отсортирован по возрастанию");
                System.out.println();
            }
            else {
                System.out.println("ОШИБКА: массив не отсортирован.");
                System.out.println();
            }
        }
        else {
            System.out.println("Убывает.");

            for (int i = 2; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                System.out.println("Массив отсортирован по убыванию");
                System.out.println();
            }
            else {
                System.out.println("ОШИБКА: массив не отсортирован.");
                System.out.println();
            }
        }
    }

    static void TaskB(int[] fibo,int count){
        fibo[0]=1;
        fibo[1]=1;
        for(int i=2;i<fibo.length;i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        System.out.print("Первые 10 элементов чисел Фибоначчи: ");
        for (int i=0;i<count;i++){
            if(fibo[i]%2==0){
                System.out.print("*" + fibo[i] + " ");
            }
            else{
                System.out.print(fibo[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Четные числа отмечены символом * ");
    }

    static void TaskC(int[] nums){
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println();
        System.out.println("Минимальный элемент в массиве: " + min);
    }
}
