package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Factorization {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

        boolean run = true;
        int inputNum = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 1; i <= inputNum; i++) {
            for(int j = 1; j <= i; j++) {
                if (i % j == 0 ) {
                    sum += j;
                }
            }
            if (sum - 1 == i) {
                primeNumbers.add(i);
            }
            sum = 0;
        }

        if (inputNum == 1 || inputNum == primeNumbers.get(primeNumbers.size() - 1)) {
            System.out.println(inputNum);
        } else {
            int i = 0;
            while (run) {
                if (inputNum % primeNumbers.get(i) == 0) {
                    inputNum /= primeNumbers.get(i);
                    System.out.print(primeNumbers.get(i) + " ");
                } else {
                    i++;
                }
                for (int j = 0; j < primeNumbers.size(); j++) {
                    if (inputNum == primeNumbers.get(i)) {
                        run = false;
                        System.out.print(inputNum);
                        break;
                    }
                }
            }
        }


    }
}

