package Solution;

import java.util.Scanner;

public class Main2577_another {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = a * b * c;
        String e = "" + d;

        int arrnu[] = new int[10];

        for (int i = 0; i < e.length(); i++) {
            arrnu[e.charAt(i) - '0']++; //???????
        }


        //System.out.println(e.charAt(3)-'2');
        for (int i = 0; i < 10; i++) {
            System.out.println(arrnu[i]);
        }
    }
}

/*
보다가 되게 독특해보여서 하나 가져왔다.
Charater간의 연산이 된다는 것이 상당히 충격이다...
단 연산시 싱글쿼트로 감싸주어야한다.
 */