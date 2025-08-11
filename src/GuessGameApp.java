import lgcns.inspire.game.GuessGame;

public class GuessGameApp {

    /*
    우리의 목표는 해당 answer 값을 맞추는 것 
    */
    public static void main(String[] args) {
        int answer = GuessGame.generatorNan();
        System.out.println("정답 : "+answer);

        GuessGame game = new GuessGame();
        String result = game.gameStart(answer);
        System.out.println("결과: "+result);
    }





}
