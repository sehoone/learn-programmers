package com.programmers.lv1;

public class ApplyMorePaint {
    /**
     * 덧칠하기(https://school.programmers.co.kr/learn/courses/30/lessons/161989)
     */
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int startIndex = 0;
        for(int location : section){
            if(location > startIndex){
                answer++;
                startIndex = location + m - 1;
            }
        }
        
        return answer;
    }
}
