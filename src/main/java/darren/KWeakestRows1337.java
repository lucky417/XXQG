package darren;


import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class KWeakestRows1337 {

    public static void main(String[] args) {
        KWeakestRows1337 k = new KWeakestRows1337();
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        List<Pair<Integer, Integer>> result = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                int rowValue = mat[i][j];
                if (rowValue == 1) {
                    count++;
                } else if (rowValue == 0) {
                    Pair<Integer, Integer> pair = new Pair(i, count);
                    result.add(pair);
                    break;
                }
                if (j == mat[i].length - 1) {
                    Pair<Integer, Integer> pair = new Pair(i, count);
                    result.add(pair);
                }
            }
        }
        result.sort(Comparator.comparing(Pair::getValue));
        int[] s = new int[k];
        for (int i = 0; i < result.subList(0, k).size(); i++) {
            s[i] = result.get(i).getKey();
        }
        return s;
    }


}
