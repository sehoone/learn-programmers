package com.programmers.game;

public class SimpleThreeSixNineGame extends ThreeSixNine {
    public SimpleThreeSixNineGame(Player[] players) {
        super(players);
    }

    @Override
    public String startGame(int number) {
        
        String numberStr = String.valueOf(number);

        for (char c : numberStr.toCharArray()) {
            if (c == '3' || c == '6' || c == '9') {
                return "Clap!";
            }
        }
        return numberStr;
    }
    
}
