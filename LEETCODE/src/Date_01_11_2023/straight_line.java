package Date_01_11_2023;

public class straight_line {
    public static void main(String[] args) {
        System.out.println(checkStraightLine(new int[][]{{1,2},{2,2},{3,3},{4,4}}));
    }

    private static boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2) return true;
        int x1=coordinates[0][0],x2=coordinates[1][0],y1=coordinates[0][1],y2=coordinates[1][1];
//        int m=(y2-y1)/(x2-x1);
//        int y,x;
//        y-y1=m(x-x1);
//        return (coordinates[i][1]-y1)==(m*(coordinates[i][0]-x1));
        for (int i = 0; i < coordinates.length; i++) {
            if((coordinates[i][1]-y1)*(x2-x1)!=((y2-y1)*(coordinates[i][0]-x1))) return false;
        }
        return true;
    }
}
