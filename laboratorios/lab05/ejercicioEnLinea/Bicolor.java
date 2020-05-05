import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Bicolor {

    public static void main (String [] args) {
        try {
            FileReader file  = new FileReader("Nodos.txt");
            BufferedReader bufrea = new BufferedReader(file);
            String line = bufrea.readLine();

            while(line != null) {
                int len = Integer.parseInt(line);
                int list[][] = new int[len][len];
                int len1 = Integer.parseInt(bufrea.readLine());

                for (int i = 0; i < len1; i++) {
                    line = bufrea.readLine();
                    String[] help = line.split(" ");
                    int num = Integer.parseInt(help[0]);
                    int num1 = Integer.parseInt(help[1]);
                    list[num][num1] = 1;
                }
                if (decBicolor(list, 0, len)) System.out.println("decBicolor");
                else System.out.println("Not decBicolor");
                line = bufrea.readLine();
            }
        } catch (IOException e) {
            System.out.println("Make sure ''Nodes.txt'' exists.");
        }
    }

    public static boolean decBicolor(int listH[][], int a, int len) {
        int [] col = new int[len];
        for (int i = 0; i < len; i++) col[i] = -1;
        col [a] = 1;
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(a);
        while (list.size() != 0) {
            int x = list.poll();
            if (listH[x][x] == 1) return false;
            for (int i = 0; i < len; i++) {
                if (listH[x][i] == 1 && col[i] == -1) {
                    col[i] = 1 - col[x];
                    list.add(i);
                }
                else if (listH[x][i] == 1 && col[i] == col[x]) return false;
            }
        }
        return true;
    }

}