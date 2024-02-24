package com.programmers.lv1;

public class SmallSubstring {
    /**
     * 크기가 작은 부분 문자열(https://school.programmers.co.kr/learn/courses/30/lessons/147355)
     */
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        Long intP = Long.parseLong(p);
        for(int i=0; i<t.length(); i++){
            if(t.length() < i+pLength){
                break;
            }
            Long intSubStr = Long.parseLong(t.substring(i, i+pLength));
            if(intSubStr <= intP){
                answer++;
            }
        }
        
        return answer;
    }
}
