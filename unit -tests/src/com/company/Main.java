package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение в Мб/мин. - ");
        int megabit = in.nextInt();
        System.out.print("Введите значение в Кб/сек. - ");
        int kilobit = in.nextInt();
        System.out.println("Введите 1 чтобы перевести Кб/сек. в Мб/мин. и 0 для перевода Мб/мин в Кб/сек.");
        int i = in.nextInt();
        if(i == 1) {
            double znach = getZnach(kilobit);
            System.out.println("Значение " + kilobit + " Кб/мин. равно " + znach + " Мб/сек.");
        }
        else if(i == 0){
            double znach1 = getZnach1(megabit);
            System.out.println("Значение " + megabit + " Мб/мин. равно " + znach1 + " Кб/сек.");
        }
    }

    public static double getZnach1(int megabit) {
        return megabit * 133.3;
    }

    public static double getZnach(int kilobit) {
        return kilobit / 133.3;
    }
}
