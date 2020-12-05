package lab0;

import java.util.Arrays;

public class Variant16<n> {

    private int field1;
    private int i;

    /**
     * Найти расстояние между двумя точками с заданными
     * координатами x1 и x2 на числовой оси: |x2 – x1|.
     */
    public int inputOutputTask(int x1, int x2) {
        int l = x2 - x1;
        return Math.abs(l);
    }

    /**
     * Дано трехзначное число. Вывести число,
     * полученное при перестановке цифр десятков
     * и единиц исходного числа
     * (например, 123 перейдет в 132).
     */

    public int integerNumbersTask(int n) {

        int a = n % 10;
        int b = (n / 10) % 10;
        int k = n / 100 * 100 + a * 10 + b;
        //int k = (n + (n % 10 - n / 10 % 10) * 9);
        return k;
    }

    /**
     * Дано целое положительное число.
     * Проверить истинность высказывания:
     * «Данное число является четным двузначным».
     */
    public boolean booleanTask(int x) {
        if (Math.abs(x) >= 10 && Math.abs(x) <= 99 && x % 2 == 0)
            return true;
        else
            return false;
    }

    /**
     * Даны три переменные вещественного типа: A, B, C.
     * Если их значения упорядочены по возрастанию, то
     * удвоить их; в противном случае заменить значение
     * каждой переменной на противоположное. Вывести новые
     * значения переменных A, B, C.
     */
    public int ifTask(int a, int b, int c) {

        if (a > b && b > c || a < b && b < c) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a *= -1;
            b *= -1;
            c *= -1;
        }
        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);
        return 0;
    }

    /**
     * Дано вещественное число A и целое число N (> 0). Найти A в степени N:
     * AN = A·A· … ·A
     * (числа A перемножаются N раз).
     * @return
     */

    public double forTask(int a, int n) {

        return Math.pow(a, n);
    }

    /**
     * Спортсмен-лыжник начал тренировки, пробежав в первый день 10 км.
     * Каждый следующий день он увеличивал длину пробега на P процентов
     * от пробега предыдущего дня (P — вещественное, 0 < P < 50). По данному
     * P определить, после какого дня суммарный пробег
     * лыжника за все дни превысит 200 км, и вывести найденное количество
     * дней K (целое) и суммарный пробег S (вещественное число).
     */

    public int whileTask(int p) {
        int k = 1;
        float d = 10, s = 10;
        while (s <= 200) {
            ++k;
            d += d * p / 100;
            s += d;
        }
        System.out.println(k);
        System.out.println(s);
        return 0;
    }
    
    /**
     * Дано целое число N и набор из N целых чисел.
     * Найти количество элементов, расположенных перед
     * первым минимальным элементом.
     */

    public int MinmaxTask(int n, int r) {

        int minnum = 0, i, min = 0;
        for (i = 1; i <= n; ++i) {
            if ((r < min) || (i == 1)) {
                min = r;
                minnum = i;
            }
        }
        return minnum - 1;
    }

    /**
     * Дан массив A размера N. Вывести его элементы в следующем порядке:
     * <p>
     * A1,    AN,    A2,    AN–1,    A3,    AN–2,    … .
     */
    public int arrayTask(double[] array) {
        int countMono = 0, countValue = 0;
        for (int i = 0; i < array.length - 1; i++) {
            while (array[i] < array[i + 1] && i < array.length) {
                i++;
                countValue++;
            }
            if (countValue >= 2) {
                countMono++;
            }
            countValue = 0;
        }
        return countMono;
    }


    /**
     * . Дана квадратная матрица A порядка M (M — нечетное число).
     * Начиная с элемента A1,1 и перемещаясь против часовой стрелки,
     * вывести все ее элементы по спирали: первый столбец, последняя строка,
     * последний столбец в обратном порядке, первая строка в обратном порядке,
     * оставшиеся элементы второго столбца и т. д.; последним выводится
     * центральный элемент матрицы.
     */
    public int[][] twoDimensionArrayTask(int[][] array) {
        int count = 0;
        int[][] arrayResult;
        for (int[] anArray : array) {
            if (anArray[array.length - 1] < 0) {
                count++;
            }
        }
        if (count == array.length) {
            arrayResult = Arrays.copyOf(array, array.length);
            for (int i = 0; i < array.length; i++) {
                arrayResult[i] = Arrays.copyOf(array[i], array.length - 1);
            }
            return arrayResult;
        }
        return array;
    }
}

