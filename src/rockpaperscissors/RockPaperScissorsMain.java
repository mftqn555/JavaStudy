package rockpaperscissors;

import java.util.Scanner;

public class RockPaperScissorsMain {

    private static void log(String message) {
        System.out.println(message);
    }

    private static String rockPaperScissorsRandomCase() {
        int rockPaperScissorsRandomCase = (int) (Math.random() * 3 + 1);
        String result = "";

        switch (rockPaperScissorsRandomCase) {
            case 1:
                result = "가위";
                break;
            case 2:
                result = "바위";
                break;
            case 3:
                result = "보";
                break;
        }
        return result;
    }

    private static String rockPaperScissorsResult(String player) {
        String opponentResult = rockPaperScissorsRandomCase();

        log("상대는 " + opponentResult + "를 냈습니다.");

        switch (player) {
            case "가위":
                if (opponentResult.equals("보")) {
                    opponentResult = "이겼습니다";
                } else if (opponentResult.equals("바위")) {
                    opponentResult = "졌습니다";
                } else if (opponentResult.equals("가위")) {
                    opponentResult = "비겼습니다";
                }

                break;
            case "바위":
                if (opponentResult.equals("보")) {
                    opponentResult = "졌습니다";
                } else if (opponentResult.equals("가위")) {
                    opponentResult = "이겼습니다";
                } else if (opponentResult.equals("바위")) {
                    opponentResult = "비겼습니다";
                }

                break;
            case "보":
                if (opponentResult.equals("바위")) {
                    opponentResult = "이겼습니다";
                } else if (opponentResult.equals("가위")) {
                    opponentResult = "졌습니다";
                } else if (opponentResult.equals("보")) {
                    opponentResult = "비겼습니다";
                }
                break;
        }
        return opponentResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int winCount = 0;
        int drawCount = 0;
        int loseCount = 0;

        boolean run = true;

        log("가위바위보를 합니다. q를 입력하여 종료합니다");
        while (run) {
            /* 플레이어의 수 변수에 저장 */
            String playerResult = scanner.next();
            /* 상대방의 수와 게임 결과 변수에 저장 */
            String opponentResult = rockPaperScissorsResult(playerResult);
            /* 게임결과 출력 */
            log(opponentResult);
            /* 승/무/패 카운트 */
            if (opponentResult.equals("이겼습니다")) {
                winCount++;
            } else if (opponentResult.equals("졌습니다")) {
                loseCount++;
            } else {
                drawCount++;
            }
            log(winCount + "승 " + drawCount + "무 " + loseCount + "패");

            if (playerResult.equals("q")) {
                run = false;
                scanner.close();
            }

        } // end of while
        
    } // end of main
} // end of class.

