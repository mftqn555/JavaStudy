package vendingmachine;

import java.util.Scanner;

public class VendingMachineMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendingMachine vm = new VendingMachine();

        int inputMoney = 0;
        int buttonNum = 0;
        int balance = 0;

        while(vm.run) {
            vm.displayOption();
            log("잔액: " + vm.displayMoney);
            log("옵션을 선택하세요 >> ");

            vm.pushOptionButton(scanner.nextInt());

            vm.displayMenu();
            log("잔액: " + vm.displayMoney);
            log("돈을 투입하세요 >>");
            inputMoney = scanner.nextInt();
            vm.displayMoney += inputMoney;

            log("잔액: " + vm.displayMoney);
            log("숫자를 입력해 버튼을 누르세요");
            buttonNum = scanner.nextInt();
            vm.pushMenuButton(buttonNum);

            balance = vm.displayMoney - vm.price;
            balance = Math.max(balance, 0);
            vm.displayMoney = balance;

        }

    }
    private static void log(String message){
        System.out.println(message);
    }
}


