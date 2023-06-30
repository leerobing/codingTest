package test1_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double [] arr = new double[N];
        int i = 0;
        String score = br.readLine();
        double plus = 0.0;
        double result;


        for (String s :   score.split(" ")) {
            double index = Double.parseDouble(s);
            arr[i] = index;
            i++;
        }
        Arrays.sort(arr);
        double max = arr[N-1];

        for (int j = 0; j < arr.length; j++) {
            arr[j] = arr[j] / max * 100;
        }
        for (double v : arr) {
            plus += v;
        }
        result = plus / N;
        System.out.println(result);


    }

}
