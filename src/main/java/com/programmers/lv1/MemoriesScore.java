package com.programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class MemoriesScore {
    /**
     * 추억 점수(https://school.programmers.co.kr/learn/courses/30/lessons/176963)
     */
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> nameYearnMap = new HashMap<String, Integer>();
        for (int i = 0; i < name.length; i++) {
            nameYearnMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int sumYearning = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (null != nameYearnMap.get(photo[i][j])) {
                    sumYearning += nameYearnMap.get(photo[i][j]);
                }
            }
            answer[i] = sumYearning;
        }

        return answer;
    }
}
