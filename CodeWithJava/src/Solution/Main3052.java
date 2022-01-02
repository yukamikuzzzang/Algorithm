package Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3052 {
    public static void main(String[] args) {
        int[] rest = new int[42];
        int num, result = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            try {
                num = Integer.parseInt(br.readLine());
                if (rest[num % 42] == 1) {
                    rest[num % 42] = 1;
                } else {
                    rest[num % 42]++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (int j = 0; j < 42; j++) {  //hashSet을 이용한다면 이 과정이 필요없음.
            if (rest[j] == 1) {
                result++;
            }
        }
        System.out.println(result);
    }
}
/*
    hashSet을 사용하는 방법을 익히는 방법을 익혀야..
*/