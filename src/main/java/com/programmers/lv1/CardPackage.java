package com.programmers.lv1;

public class CardPackage {
    /**
     * 카드 뭉치(https://school.programmers.co.kr/learn/courses/30/lessons/159994)
     */
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int currCard1Idx = 0;
        int currCard2Idx = 0;
        
        for(String word : goal) {
            if(currCard1Idx<cards1.length && word.equals(cards1[currCard1Idx])) {
                currCard1Idx++;
                continue;
            }
            if(currCard2Idx<cards2.length && word.equals(cards2[currCard2Idx])) {
                currCard2Idx++;
                continue;
            }
            
            answer = "No";
            break;
        }
        
        return answer;
    }
}
