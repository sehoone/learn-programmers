package com.programmers.lv1;

import java.util.Stack;

public class MakeHamburger {
    /**
     * 햄버거만들기(https://school.programmers.co.kr/learn/courses/30/lessons/133502)
     */
    public int solution(int[] ingredient) {
        // 원소를 넣을 스택 생성
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int num : ingredient) {
            stack.push(num);

            if (stack.size() >= 4) {
                // stack을 기준으로 1231이 있는지 확인
                int size = stack.size();
                if (stack.get(size - 4) == 1 && stack.get(size - 3) == 2 &&
                    stack.get(size - 2) == 3 && stack.get(size - 1) == 1) {
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    answer++;
                }
            }
        }
        
        return answer;
    }

    // 시간초과됨 오답
    // public int solution(int[] ingredient) {
    //     // ingredient 를 문자열로 만듬
    //     StringBuilder sb = new StringBuilder();
    //     for(int num:ingredient){
    //         sb.append(num);
    //     }
    //     String ingredientString = sb.toString();
    //     int answer = 0;
    //     // 1,2,3,1 을 replaceFirst로 바꿈
    //     while(true){
    //         if(ingredientString.contains("1231")){
    //             ingredientString = ingredientString.replaceFirst("1231", "");
    //             answer++;
    //         } else {
    //             break;
    //         }
    //     }
        
    //     return answer;
    // }
}
