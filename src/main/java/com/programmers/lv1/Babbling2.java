package com.programmers.lv1;

import java.util.*;

public class Babbling2 {
    /**
     * 옹알이2(https://school.programmers.co.kr/learn/courses/30/lessons/133499)
     */
    // public int solution(String[] babbling) {
    //     int answer = 0;
    //     String[] speaks = { "aya", "ye", "woo", "ma" };
    //     List<String> speakList = Arrays.asList(speaks);
        
    //     for(String babble : babbling) {
    //         StringBuilder sb = new StringBuilder();
    //         String repeatStr = "";
    //         String appendStr = "";
    //         String str = babble;
    //         for(int i=0; i<babble.length(); i++){
    //             char charAtIndex = babble.charAt(i);
    //             sb.append(String.valueOf(charAtIndex));
    //             appendStr = sb.toString();
    //             if(speakList.contains(appendStr) && !repeatStr.equals(appendStr)){
    //                 repeatStr = appendStr;
    //                 str = str.replaceFirst(appendStr, "");
    //                 sb.setLength(0);
    //             }
    //         }
    //         if(str.equals("")){
    //             answer++;
    //         }
            
    //     }
        
    //     return answer;
    // }

    // 소스정리
    public int solution(String[] babbling) {
        int answer = 0;
        String[] speaks = { "aya", "ye", "woo", "ma" };
        List<String> speakList = Arrays.asList(speaks);
    
        for (String babble : babbling) {
            String previousWord = "";
            boolean isValid = true;
    
            while (!babble.isEmpty()) {
                boolean found = false;
                for (String speak : speakList) {
                    if (babble.startsWith(speak) && !speak.equals(previousWord)) {
                        previousWord = speak;
                        babble = babble.substring(speak.length());
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    isValid = false;
                    break;
                }
            }
    
            if (isValid) {
                answer++;
            }
        }
    
        return answer;
    }
    
}
