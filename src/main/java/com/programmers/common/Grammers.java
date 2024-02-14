package com.programmers.common;

import java.util.HashMap;

public class Grammers {
    // 평소 자주 사용하지 않아서 까먹었던 문법들 정리
    public static void main(String[] args) {
        // 1. MAP의 키값으로 loop
        HashMap<Integer, String> playerRankMap = new HashMap<Integer, String>();
        for (int key : playerRankMap.keySet()) {
            System.out.println(playerRankMap.get(key));
        }
        
        // 2. 문자열 loop
        String str = "abcde";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
