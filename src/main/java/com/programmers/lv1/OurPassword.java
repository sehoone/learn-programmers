package com.programmers.lv1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OurPassword {
    /**
     * 둘만의 암호(https://school.programmers.co.kr/learn/courses/30/lessons/155652)
     */
    public String solution(String s, String skip, int index) {
        String answer = "";
        String[] alphabets = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };
        Map<String, Integer> alphabetMap = new HashMap<>();
        List<String> skipedalphabets = new ArrayList<>();
        for (int i = 0; i < alphabets.length; i++) {
            if (skip.indexOf(alphabets[i]) > -1) {
                continue;
            }
            alphabetMap.put(alphabets[i], skipedalphabets.size());
            skipedalphabets.add(alphabets[i]);
        }

        for (int i = 0; i < s.length(); i++) {
            String encryptAlphabet = Character.toString(s.charAt(i));

            int alphabetIdx = alphabetMap.get(encryptAlphabet);
            for (int j = 0; j < index; j++) {
                if (alphabetIdx == skipedalphabets.size() - 1) {
                    alphabetIdx = 0;
                } else {
                    alphabetIdx++;
                }
            }
            answer += skipedalphabets.get(alphabetIdx);
        }

        return answer;
    }
}
