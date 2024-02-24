package com.programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class ClosestSameLetter {
    /**
     * 가장 가까운 같은 문자(https://school.programmers.co.kr/learn/courses/30/lessons/142086)
     */
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> strIdxMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char strChar = s.charAt(i);
            if (null == strIdxMap.get(strChar)) {
                strIdxMap.put(strChar, i);
                answer[i] = -1;
            } else {
                answer[i] = i - strIdxMap.get(strChar);
                strIdxMap.put(strChar, i);
            }
        }

        return answer;
    }
}
