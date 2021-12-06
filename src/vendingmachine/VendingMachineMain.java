package vendingmachine;

import java.util.Scanner;

public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.runVendingMachine();
    }
    private static void log(String message){
        System.out.println(message);
    }
}

/* 예외처리 */
// 1000원, 500원, 100원, 50원, 10원만 넣는 상황 가정
// 투입 금액이 마이너스가 되는 상황 가정 X
// 정해진 버튼 외에 다른 버튼을 누르는 상황 가정 X

/* 12.01 */
// 변수명 수정
// 잔돈 반환 기능 추가
// 필수예외처리 기능 추가

