public class Main {
    public void restart() { //重新開啟新的一局
        GameSystem game = new GameSystem();
        System.out.println();
        System.out.println();
        System.out.println("新的一局遊戲！");
        game.start();
    }
    public static void main(String args[]){ //第一局
        GameSystem game = new GameSystem();
        System.out.println("新的一局遊戲！");
        game.start();
    }
}