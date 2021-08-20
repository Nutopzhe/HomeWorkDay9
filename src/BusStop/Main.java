package BusStop;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<int[]> busStop = new ArrayList<>();
        Random random = new Random();

        //счетчик для наполнения остановок и заполнение количеством вошедших и вышедших людей в массив
        //вышедших людей не будет больше вошедших
        for (int i = 0; i < 10; i++) {
            int included = random.nextInt(10);
            int released = random.nextInt(included + 1);
            busStop.add(new int[]{included, released});
        }

        System.out.println(busStop.stream().mapToInt(s -> Integer.parseInt(String.valueOf(s[0] - s[1])))
                .sum());
    }
}
