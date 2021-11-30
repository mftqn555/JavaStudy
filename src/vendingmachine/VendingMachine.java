package vendingmachine;

public class VendingMachine {

    int priceBeverage1 = 700;
    int priceBeverage2 = 1000;
    int priceBeverage3 = 800;
    int priceBeverage4 = 900;

    String nameBeverage1 = "콜라";
    String nameBeverage2 = "오렌지";
    String nameBeverage3 = "사이다";
    String nameBeverage4 = "커피";

    public boolean run = true;

    int displayMoney = 0;
    int price = 0;

    private static void log(String message){
        System.out.println(message);
    }

    public void displayOption(){
      log("=======================================");
      log("  1. 돈 넣기 | 2. 잔액 반환, 종료 " );
      log("=======================================");
    }

    public void pushOptionButton(int buttonNum){
        switch (buttonNum) {
            case 1:
                break;
            case 2:
                log("잔액이 반환 되었습니다");
                System.exit(0);
        }
    }


    public void displayMenu(){
        log("1 "+nameBeverage1+"("+priceBeverage1+")   2 "+nameBeverage2+"("+priceBeverage2+")");
        log("3 "+nameBeverage3+"("+priceBeverage3+")   4 "+nameBeverage4+"("+priceBeverage4+")");
    }

    public void pushMenuButton(int buttonNum){
        switch (buttonNum){
            case 1:
                price = priceBeverage1;
                log(nameBeverage1+"가 나왔습니다");
                break;
            case 2:
                price = priceBeverage2;
                log(nameBeverage2+"가 나왔습니다");
                break;
            case 3: 
                price = priceBeverage3;
                log(nameBeverage3+"가 나왔습니다");
                break;
            case 4:
                price = priceBeverage4;
                log(nameBeverage4+"가 나왔습니다");
                break;
        }
    }

}
