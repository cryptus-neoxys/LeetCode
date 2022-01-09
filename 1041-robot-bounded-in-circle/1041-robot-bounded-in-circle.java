class Solution {
    public boolean isRobotBounded(String instructions) {
        int[] pos = {0, 0};
        int[] dir = {0, 1};
        
//               x  y      L         R
//         N -> (0, 1)   (-1, 0)    (1, 0)
//         E -> (1, 0)   (0, 1)   (0, -1)
//         S -> (0, -1)  
//         W -> (-1, 0)
        for(int i = 0; i < 4; ++i) {
            for(Character instruction: instructions.toCharArray()) {
                System.out.println("instruction: " + instruction);
                if(instruction.equals('G')) {
                    pos[0] += dir[0];
                    pos[1] += dir[1];
                    System.out.println("pos: (" + pos[0] + ", " + pos[1] + ")");
                }
                else {if(instruction.equals('R')) {
                    int dirX = dir[0];
                    int dirY = dir[1];
                    dir[1] = -1 * dirX;
                    dir[0] = dirY;
                }
                else {
                    int dirX = dir[0];
                    int dirY = dir[1];
                    dir[1] = dirX;
                    dir[0] = -1 * dirY;
                }
                System.out.println("dir: (" + dir[0] + ", " + dir[1] + ")");}
            }
            if(pos[0] == 0 && pos[1] == 0) {
                return true;
                }    
        }
        return false;
    }
}