package darren;

public class TitleToNumber171 {
    public static void main(String[] args) {
        TitleToNumber171 s = new TitleToNumber171();
        System.out.println(s.titleToNumber3("ZYZ"));
    }

    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            int actualNum = columnTitle.charAt(i) - 'A' + 1;
            sum += Math.pow(26, columnTitle.length() - 1 - i) * actualNum;
        }
        return sum;
    }

    public int titleToNumber1(String columnTitle) {
        int number = 0;
        int multiple = 1;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            int k = columnTitle.charAt(i) - 'A' + 1;
            number += k * multiple;
            multiple *= 26;
        }
        return number;
    }

    public int titleToNumber3(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'A' + 1;
            ans = ans * 26 + num;
        }
        return ans;
    }

}
