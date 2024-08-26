package com.programmers.game;

public abstract class ThreeSixNine {
    
    Player[] players;

    ThreeSixNine(Player[] players) {
        this.players = players;
    }

    public abstract String startGame(int number);

    void playTreeSixNime() {
        int number = 1;
        while (true) {
            int playerIndex = number % players.length;
            Player player = players[playerIndex];
            String result = startGame(number);

            // 틀린경우 게임을 종료
            if(!player.isCorrect()) return;
            
            System.out.println(player.getName() + " : " + result);
            number++;
        }
    }
}
