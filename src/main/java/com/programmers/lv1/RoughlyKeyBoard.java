package com.programmers.lv1;

import java.util.HashMap;

public class RoughlyKeyBoard {
    /**
     * 대충 만든 자판(https://school.programmers.co.kr/learn/courses/30/lessons/160586)
     */
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        // keymap을 map으로 변환. 각 알파벳별로 최소 푸쉬 횟수를 저장
        HashMap<Character, Integer> pushKeymap = new HashMap<>();
        for(String key : keymap){
            for(int i=0; i<key.length(); i++) {
                char alphabet = key.charAt(i);
                if (null == pushKeymap.get(alphabet)) {
                    pushKeymap.put(alphabet, i+1);
                } else {
                    int puahKeyCount = pushKeymap.get(alphabet);
                    if(i < puahKeyCount) {
                        pushKeymap.put(alphabet, i+1);
                    }
                }
            }
        }

        // targets의 각 문자열별로 푸쉬 횟수를 계산
        for(int i=0; i<targets.length; i++) {
            int puahKeyCount = 0;
            for(int j=0; j<targets[i].length(); j++) {
                char alphabet = targets[i].charAt(j);
                if(null == pushKeymap.get(alphabet)) {
                    puahKeyCount = -1;
                    break;
                } else {
                    puahKeyCount += pushKeymap.get(alphabet);
                }
            }
            answer[i] = puahKeyCount;
        }

        return answer;
    }
}
