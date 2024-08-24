package com.programmers.lv1;

import java.util.Arrays;
import java.util.Collections;

public class FruitSeller {

    /**
     * 과일장수(https://school.programmers.co.kr/learn/courses/30/lessons/135808)
     */
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 역순 정렬하기
        Integer[] scoresInteger = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scoresInteger, Collections.reverseOrder());

        // m개 만큼 넣는데 마지막꺼는 곱해서 answer에 넣기.
        for(int i=1; i<scoresInteger.length+1; i++){
            if(i % m == 0){
                answer += scoresInteger[i-1] * m;
            }
        }

        return answer;
    }
}
