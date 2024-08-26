package com.programmers.game;

public class Main {
    /**
     * 1단계 : 주어진 요구사항에 맞게 369 게임 구현
        2단계 : 오답률에 따른 게임 종료 및 사용자 등 몇 가지 심화 기능과 클래스 추가
        3단계 : 지역별 다른 규칙의 369 게임을 위해 추상화 및 다형성 적용
        4단계 : 다양한 지역 동시 게임 진행을 위한 동시성 적용
     */
    public static void main(String[] args) {
        /**
         * main 메소드에서는 게임을 시작하는 코드를 작성
         * 1. 플레이어는 3,6,9 에 clap 박수를 쳐야함
         * 2. 3,6,9 에 해당하는 숫자가 포함된 경우 박수를 치고, 해당 숫자를 출력
         * 3. 3,6,9 에 해당하는 숫자가 포함되지 않은 경우 숫자를 출력
         */
        Player[] players = {
            new Player("Alice", 0.01),
            new Player("Bob", 0.02),
            new Player("Charlie", 0.05)
        };

        ThreeSixNine game = new SimpleThreeSixNineGame(players);
        game.playTreeSixNime();
    }
}