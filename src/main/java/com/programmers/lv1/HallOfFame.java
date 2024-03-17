package com.programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;

public class HallOfFame {

    /**
     * 명예의 전당(https://school.programmers.co.kr/learn/courses/30/lessons/138477)
     */
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        ArrayList<Integer> scores = new ArrayList<Integer>();

        for(int i=0; i<score.length; i++){
            scores.add(score[i]);
            Collections.sort(scores, Collections.reverseOrder());

            if(scores.size() <= k) {
                answer[i] = scores.get(scores.size()-1);
            } else {
                answer[i] = scores.get(k-1);
            }

        }

        return answer;
    }
}
