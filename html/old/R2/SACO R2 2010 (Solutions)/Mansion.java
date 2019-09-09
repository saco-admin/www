import java.util.*;

public class Mansion {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows and columns are there? ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        String[] map = new String[rows];
        Set<Coord> lightsFound = new TreeSet<Coord>();
        Queue<Coord> newLights = new LinkedList<Coord>();
        System.out.println("Enter the mansion one row per line:")
        for (int r = 0; r < rows; ++r) {
            map[r] = sc.next();
            for (int c = 0; c < columns; ++c) {
                if (map[r].charAt(c) == 'S') {
                    Coord start = new Coord(r,c);
                    lightsFound.add(start);
                    newLights.add(start);
                }
            }
        }

        int[] stepx = {-1, 0, 1, 0, 0};
        int[] stepy = {0, -1, 0, 1, 0};
        int[] lightx = {-1, -1, 0, 1, 1, 1, 0, -1, 0};
        int[] lighty = {0, -1, -1, -1, 0, 1, 1, 1, 0};

        while (true) {
            Coord light = newLights.poll();
            if (light == null)
                break;

            int r = light.row;
            int c = light.column;

            for (int i = 0; i < lightx.length; ++i) {
                for (int j = 0; j < stepx.length; ++j) {
                    for (int k = 0; k < stepx.length; ++k) {
                        int r1 = r + lighty[i] + stepy[j] + stepy[k];
                        int c1 = c + lightx[i] + stepx[j] + stepx[k];
                        Coord coord = new Coord(r1, c1);

                        if (0 <= r1 && r1 < rows && 0 <= c1 && c1 < columns
                            && map[r1].charAt(c1) == '*' &&
                            !lightsFound.contains(coord)) {

                            lightsFound.add(coord);
                            newLights.add(coord);
                        }
                    }
                }
            }
        }

        System.out.println("I can switch on " + (lightsFound.size()-1)
                            + " lights.");
    }
}

class Coord implements Comparable<Coord> {
    final int row, column;
    public Coord (int r, int c) {
        row = r;
        column = c;
    }

    public int compareTo (Coord other) {
        if (row != other.row)
            return row - other.row;
        else
            return column - other.column;
    }
}
