import java.util.HashSet;
import java.util.Set;

public class Walking_Robot_Simulation {
    public int robotSim(int[] commands, int[][] obstacles) {
        int dir = 0; 
        int dx = 0, dy = 0; 
        int maxDistance = 0;

        // converting to Set for searching
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }

        for (int command : commands) {
            // changing direction
            if (command == -1) {
                dir = (dir + 1) % 4;
            } else if (command == -2) {
                dir = (dir - 1 + 4) % 4; 
            } else {
                for (int newX = dx, newY = dy, j = 0; j < command; j++) {
                    
                    // Set new directions
                    switch (dir) {
                        case 0: // North
                            newY += 1;
                            break;
                        case 1: // East
                            newX += 1;
                            break;
                        case 2: // South
                            newY -= 1;
                            break;
                        case 3: // West
                            newX -= 1;
                            break;
                    }
                    // check temp coordinates
                    if (!obstacleSet.contains(newX + "," + newY)) {
                        dx = newX;
                        dy = newY;
                        int distanceSquared = dx * dx + dy * dy;
                        if (distanceSquared > maxDistance) {
                            maxDistance = distanceSquared;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return maxDistance; 
    }
}