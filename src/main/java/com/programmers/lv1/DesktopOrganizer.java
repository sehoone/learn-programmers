package com.programmers.lv1;

public class DesktopOrganizer {
    /**
     * 바탕화면 정리https://school.programmers.co.kr/learn/courses/30/lessons/161990)
     */
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        answer[0] = wallpaper.length;
        answer[1] = wallpaper[0].length();

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                char grid = wallpaper[i].charAt(j);
                if (grid == '#') {
                    answer[0] = Math.min(i, answer[0]);
                    answer[1] = Math.min(j, answer[1]);
                    answer[2] = Math.max(i + 1, answer[2]);
                    answer[3] = Math.max(j + 1, answer[3]);
                }
            }
        }

        return answer;
    }
}
