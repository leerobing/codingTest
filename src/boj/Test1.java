package boj;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int[] arr = new int[N];
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        for (int j = 0; j < arr.length; j++) {
            result += arr[j];
        }

        System.out.println(result);

    }
}
