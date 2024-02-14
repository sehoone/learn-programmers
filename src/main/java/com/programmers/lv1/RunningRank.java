package com.programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class RunningRank {
    /**
     * 달리기 경주(https://school.programmers.co.kr/learn/courses/30/lessons/178871)
     */
    public String[] solution(String[] players, String[] callings) {

        Map<Integer, String> rankPlayerMap = new HashMap<>();
        Map<String, Integer> playerRankMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rankPlayerMap.put(i + 1, players[i]);
            playerRankMap.put(players[i], i + 1);
        }

        for (String callName : callings) {
            int rank = playerRankMap.get(callName);
            String backPlayer = rankPlayerMap.get(rank - 1);

            rankPlayerMap.put(rank - 1, callName);
            rankPlayerMap.put(rank, backPlayer);

            playerRankMap.put(callName, rank - 1);
            playerRankMap.put(backPlayer, rank);
        }
        String[] answer = new String[players.length];
        int idx = 0;
        for (int key : rankPlayerMap.keySet()) {
            answer[idx++] = rankPlayerMap.get(key);
        }

        // 시간복잡도에 걸림. 효율성 테스트 통과 못함. 단순히 for로 처리하지말고 map을 사용하여 처리해야함.
        // List<String> playersList = Stream.of(players).collect(Collectors.toList());

        // for (String callName : callings) {
        //     for (int i = 0; i < playersList.size(); i++) {
        //         String player = playersList.get(i);
        //         if (player.equals(callName)) {
        //             System.out.println(i);
        //             Collections.swap(playersList, i, i - 1);
        //         }
        //     }
        // }
        // String[] answer = playersList.stream().toArray(String[]::new);

        // 다른 사람 풀이. rankMap을 사용하여 풀이
        // int n = players.length;
        // HashMap<String, Integer> rankMap = new HashMap<>();

        // for (int i = 0; i < n; i++) {
        //     rankMap.put(players[i], i);
        // }

        // for (String calling : callings) {
        //     int idx = rankMap.get(calling);
        //     if (idx > 0) {
        //         String temp = players[idx - 1];
        //         players[idx - 1] = players[idx];
        //         players[idx] = temp;

        //         rankMap.put(players[idx - 1], idx - 1);
        //         rankMap.put(players[idx], idx);
        //     }
        // }

        return answer;
    }
}
