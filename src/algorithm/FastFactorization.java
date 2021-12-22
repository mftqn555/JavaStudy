package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FastFactorization {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int inputInt = Integer.parseInt(input);
        int i = 2 ;

        while (inputInt > i) {
            if (inputInt % i == 0) {
                inputInt /= i;
                System.out.println(i);
            } else {
                i++;
            }
        }
        System.out.println(inputInt == 1 ? "" : inputInt);

    }
}
