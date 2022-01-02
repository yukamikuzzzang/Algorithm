package Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2577 {
    public static void main(String[] args) throws IOException {
        int A, B, C, mul, rest;
        int[] arr = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());
        mul = A * B * C;

        while (true) {
            rest = mul % 10;
            if (rest != 0) {
                arr[rest] += 1;
            } else {
                arr[0] += 1;
            }
            mul = mul / 10; //* 나머지를 전체에서 뺄셈하는 방향으로 간다면 더 복잡해진다.
            if (mul <= 0) {
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}

/*
어떻게 이 문제를 접근해야할까?
결국에는 배열이 필요한 문제, ArrayList보단 생각하기에 좀 더 편했음.
while문 로직이 조금 힘들어보임.
몫으로 접근하려 했으나 결국 나머지로 접근하는 방향.
 */