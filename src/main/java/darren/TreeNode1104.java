package darren;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeNode1104 {
    public static void main(String[] args) {
        TreeNode1104 s = new TreeNode1104();
        List<Integer> integerList = s.pathInZigZagTree(26);
        for (Integer e : integerList) {
            System.out.println(e);
        }
    }

    public List<Integer> pathInZigZagTree(int label) {
        int startLevel = 1;
        while (getLevelMaxValue(startLevel) < label) startLevel++;
        List<Integer> result = new ArrayList<Integer>();

        int level = startLevel;
        while (level >= 1) {
            if (level % 2 == 0) {
                int actualValue = getLevelMinValue(level) + getLevelMaxValue(level) - label;
                if (level != startLevel) {
                    result.add(actualValue);
                    label = label / 2;
                } else {
                    result.add(label);
                    label = actualValue / 2;
                }
            } else {

                result.add(label);

                label = label / 2;
            }
            level--;
        }
        Collections.reverse(result);
        return result;
    }

    private int getLevelMinValue(int level) {
        return (int) Math.pow(2, level - 1);
    }

    private int getLevelMaxValue(int level) {
        return getLevelMinValue(level) * 2 - 1;
    }


}
