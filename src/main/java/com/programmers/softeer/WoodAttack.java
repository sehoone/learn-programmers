package com.programmers.softeer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class WoodAttack {
    /**
     * 나무공격(https://softeer.ai/app/assessment/index.html?xid=266742&xsrfToken=UyMlx1bmCG57RfhZhdP4DSYTUFsX9nOV&testType=practice)
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int rowHeight = Integer.parseInt(st.nextToken());
        int rowWidth = Integer.parseInt(st.nextToken());

        // 행기준으로 카운트 저장
        int[] location = new int[rowHeight];
        for (int i = 0; i < rowHeight; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < rowWidth; j++) {
                int locationWidth = Integer.parseInt(st.nextToken());
                location[i] += locationWidth;

            }
        }

        // 시작, 종료 기준으로 for문을 돌아서 카운트를 뺌
        for (int z = 0; z < 2; z++) {
            st = new StringTokenizer(br.readLine());
            int attactStart = Integer.parseInt(st.nextToken());
            int attactEnd = Integer.parseInt(st.nextToken());
            for (int x = attactStart; x <= attactEnd; x++) {
                if (location[x - 1] > 0) {
                    location[x - 1]--;
                }
            }
        }

        // 합을 구한다
        int result = 0;
        for (int locationDestroyer : location) {
            result += locationDestroyer;
        }
        System.out.println(result);
    }
}