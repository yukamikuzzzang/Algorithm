package Solution;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main2562_1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9]; //배열 선언 및 생성 부분
        int input, max = 0;
        int index = 0;

        try {
            for (int i = 0; i < 9; i++) {
                input = Integer.parseInt(br.readLine());    //오랜만에 등장한 .PaserInt()
                arr[i] = input;
                if (i == 0) {   //max 초기값 설정
                    max = arr[0];
                } else if (i > 0) {
                    if (max < input) {
                        max = input;    //최댓값을 구해야한다.
                        index = i;      //index 번호를 기억해야함
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(max);
        System.out.println(index+1);
        //System.out.println(Arrays.asList(arr).indexOf(max)+1);    //이건 왜 안되는지 잘 모르겠음.
    }
}
