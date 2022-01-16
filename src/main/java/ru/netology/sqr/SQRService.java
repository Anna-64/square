package ru.netology.sqr;

import org.w3c.dom.ls.LSOutput;

public class SQRService {
    public int squareAmount(int lowerBound, int upperBound) {
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            if (i * i >= lowerBound && i * i <= upperBound) {
                System.out.println((" Корень числа:  " + i) + (" Число: " + i * i));
                count = count + 1;
        }
    }
        System.out.println(" Количество квадратов "+ count);
        return count;
}
}




