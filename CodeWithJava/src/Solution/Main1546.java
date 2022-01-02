package Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main1546 {
    public static void main(String[] args) throws IOException {
        int M;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        //M = Integer.parseInt(br.readLine());
        M = scanner.nextInt();
        
        for(int i = 0; i < M; i++) {
            //arr.add(Integer.parseInt(String.valueOf(br.read())));
            //System.out.println(arr);
            //System.out.println(String.valueOf(br.read()));
            arr.add(scanner.nextInt());

        }
    }
}
