package N1298_maxCandiesCanGetFromBoxes;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int cand = 0;
        boolean[] visited = new boolean[candies.length];
        Queue<Integer> boxes = new PriorityQueue<>();
        boolean[]closedEarnedBoxes = new boolean[candies.length];
        for (int box:initialBoxes) {
            boxes.add(box);
        }
        int currnode = 0;
        while(!boxes.isEmpty()){
            currnode = boxes.poll();
            if(visited[currnode]){
                continue;
            }
            if(status[currnode] == 0){
                closedEarnedBoxes[currnode] = true;
                continue;
            }
            for (int key : keys[currnode]) {
                status[key] = 1;
                if(closedEarnedBoxes[key]){
                    boxes.add(key);
                }
            }
            for (int box : containedBoxes[currnode]) {
                boxes.add(box);
            }
            cand+=candies[currnode];
            visited[currnode] = true;
        }

        return cand;
    }
}
