package vendingmachine;

import java.util.Scanner;

public class VendingMachineMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendingMachine vm = new VendingMachine();

        int buttonNum = 0;

        while(vm.run) {
            /* 옵션 보여주기, 옵션 선택 */
            vm.displayOption();
            vm.selectOption(scanner.nextInt());

            /* 메뉴 보여주기, 돈 투입 및 잔액 계산 */
            vm.displayMenu();
            vm.inputMoney = scanner.nextInt();
            vm.balance += vm.inputMoney;

            /* 버튼 눌러서 원하는 음료 뽑기 */
            log("잔액: " + vm.balance);
            log("숫자를 입력해 버튼을 누르세요");
            buttonNum = scanner.nextInt();
            vm.pushMenuButton(buttonNum);
            vm.giveBeverage()

            /* 잔액 계산 */;
            vm.calculateBalance();
        }
        scanner.close();

    }
    private static void log(String message){
        System.out.println(message);
    }
}

/* 예외처리 */
// 1000원, 500원, 100원, 50원, 10원만 넣는 상황 가정
// 투입 금액이 마이너스가 되는 상황 가정 X
// 정해진 버튼 외에 다른 버튼을 누르는 상황 가정 X


