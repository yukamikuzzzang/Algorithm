package Solution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main2562 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input, max = 0;

        try {
            for (int i = 0; i < 9; i++) {
                input = Integer.parseInt(br.readLine());
                arr.add(input);
            }
            max = Collections.max(arr);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(max);
        System.out.println(arr.indexOf(max) + 1);
    }
}

/*
    ArrayList를 이용하여 해결하는 방법:
    Collections.max(ArrayList) /Collections.min(ArrayList) 최대,최솟값을 한 번에 찾아줌.
    arr.add(입력값) python의 List append같은 느낌

    +이걸 찾은 이유는 파이썬에서 리스트를 통해 최대 최소를 쉽게 구하는 방법이 있기 때문.
    '정말 어이없을 정도로 쉬웠음..'
 */