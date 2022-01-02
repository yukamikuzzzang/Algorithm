package Solution;

import java.io.*;
import java.util.*;

public class Main3052_another {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hashset = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {  //10개
            hashset.add(Integer.parseInt(br.readLine()) % 42);
        }
        System.out.println(hashset.size());
    }
}
