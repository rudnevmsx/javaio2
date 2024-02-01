package ru.rudnev.test.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    /***
     *
     * @param args
     * ● Реализуйте метод, который подсчитывает сколько раз в текстовом файле (с кодировкой UTF-8)
     * встречается указанная последовательность символов с учетом регистра;
     * ● При запуске приложения пользователь вводит имя файла и искомую последовательность символов,
     * программа должна выполнить расчет и напечатать результат в консоль
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите название файла: ");
        String fileName = sc.nextLine();

        System.out.print("Введите искомое слово: ");
        String foundName = sc.nextLine();

        int count = findMatch(fileName, foundName);
        System.out.println(count);


    }

    public static int findMatch(String fileName, String foundName){
        String path = "/home/rudnievi/IdeaProjects/untitled3/src/main/java/org/example/" + fileName;
        int count = 0;
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();

            while (line != null) {
                if (line.contains(foundName)){
                    count += 1;
                    line = reader.readLine();
                }
                else {
                    count += 0;
                }

            }
            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        return count;
    }
}