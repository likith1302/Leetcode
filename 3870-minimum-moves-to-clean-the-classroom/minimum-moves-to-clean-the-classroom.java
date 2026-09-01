import java.util.*;

public class Solution {
    static class State {
        int x, y, mask, energy, steps;
        State(int x, int y, int mask, int energy, int steps) {
            this.x = x; this.y = y; this.mask = mask;
            this.energy = energy; this.steps = steps;
        }
    }

    public int minMoves(String[] classroom, int E) {  // <-- FIXED name
        int m = classroom.length, n = classroom[0].length();
        int startX = 0, startY = 0;
        List<int[]> litter = new ArrayList<>();

        // Collect positions
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c = classroom[i].charAt(j);
                if (c == 'S') { startX = i; startY = j; }
                if (c == 'L') litter.add(new int[]{i, j});
            }
        }

        int k = litter.size();
        int fullMask = (1 << k) - 1;
        int[][][] bestEnergy = new int[m][n][1 << k];
        for (int[][] arr : bestEnergy)
            for (int[] row : arr)
                Arrays.fill(row, -1);

        Queue<State> q = new LinkedList<>();
        q.offer(new State(startX, startY, 0, E, 0));
        bestEnergy[startX][startY][0] = E;

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while (!q.isEmpty()) {
            State cur = q.poll();
            if (cur.mask == fullMask) return cur.steps;

            for (int dir = 0; dir < 4; dir++) {
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];
                int ne = cur.energy - 1;
                if (nx < 0 || ny < 0 || nx >= m || ny >= n || ne < 0) continue;
                char c = classroom[nx].charAt(ny);
                if (c == 'X') continue;
                if (c == 'R') ne = E;

                int nmask = cur.mask;
                for (int i = 0; i < k; i++) {
                    if (litter.get(i)[0] == nx && litter.get(i)[1] == ny)
                        nmask |= (1 << i);
                }

                if (ne <= bestEnergy[nx][ny][nmask]) continue;
                bestEnergy[nx][ny][nmask] = ne;
                q.offer(new State(nx, ny, nmask, ne, cur.steps + 1));
            }
        }
        return -1;
    }
}
