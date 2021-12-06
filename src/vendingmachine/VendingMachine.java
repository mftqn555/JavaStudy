package vendingmachine;

import java.util.Scanner;

public class VendingMachine {

    int drinkPrice1 = 700;
    int drinkPrice2 = 1000;
    int drinkPrice3 = 800;
    int drinkPrice4 = 900;
    int inputMoney;
    int price;
    int balance;

    String drinkName1 = "콜라";
    String drinkName2 = "오렌지";
    String drinkName3 = "사이다";
    String drinkName4 = "커피";

    public boolean run = true;


    private static void log(String message){
        System.out.println(message);
    }

    public void showOption(){
        log("===================================");
        log(" 1. 돈 넣기 | 2. 잔액 반환, 종료 " );
        log("====================================");
        log("잔액: " + balance);
        log("옵션을 선택하세요 >> ");
    }

    public void selectOption(int selectNum){
        switch (selectNum) {
            case 1:
                break;
            case 2:
                returnBalance();
                System.exit(0);
        }
    }

    public void showMenu(){
        log("====================================");
        log("1 "+drinkName1+"("+drinkPrice1+")   2 "+drinkName2+"("+drinkPrice2+")");
        log("3 "+drinkName3+"("+drinkPrice3+")   4 "+drinkName4+"("+drinkPrice4+")");
        log("====================================");
        log("잔액: " + balance);
        log("돈을 투입하세요 >>");
    }

    public void pushMenuButton(int buttonNum){
        switch (buttonNum){
            case 1:
                price = drinkPrice1;
                break;
            case 2:
                price = drinkPrice2;
                break;
            case 3:
                price = drinkPrice3;
                break;
            case 4:
                price = drinkPrice4;
                break;
        }
    }

    public void giveBeverage() {
        if(price > balance) {
            balance = inputMoney;
            log("잔액이 부족합니다.");
        } else {
            if (price == drinkPrice1) {
                log(drinkName1 + "가 나왔습니다");
            } else if (price == drinkPrice2) {
                log(drinkName2 + "가 나왔습니다");
            } else if (price == drinkPrice3) {
                log(drinkName3 + "가 나왔습니다");
            } else if (price == drinkPrice4) {
                log(drinkName4 + "가 나왔습니다");
            }
        }
    }

    public void calculateBalance() {
        balance = balance - price;
        balance = balance < 0 ? inputMoney : balance;
    }

    public void returnBalance() {
        int coin500 = (balance / 500);
        int coin100 = (balance % 500) / 100;
        int coin50 = (balance % 500 % 100) / 50;
        int coin10 = (balance % 500 % 100 % 50) / 10;

        log("500원 " + coin500 + "개");
        log("100원 " + coin100 + "개");
        log("50원 " + coin50 + "개");
        log("10원 " + coin10 + "개 반환 되었습니다.");

    }

    public void runVendingMachine(){
        int buttonNum = 0;
        Scanner scanner = new Scanner(System.in);
        while(run) {
            /* 옵션 보여주기, 옵션 선택 */
            showOption();
            selectOption(scanner.nextInt());

            /* 메뉴 보여주기, 돈 투입 및 잔액 계산 */
            showMenu();
            inputMoney = scanner.nextInt();
            balance += inputMoney;

            /* 버튼 눌러서 원하는 음료 뽑기 */
            log("잔액: " + balance);
            log("숫자를 입력해 버튼을 누르세요");
            buttonNum = scanner.nextInt();
            pushMenuButton(buttonNum);
            giveBeverage()

            /* 잔액 계산 */;
            calculateBalance();
        }

    }

}