package day1023;

public class longestCommonPrefix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "fcdd", "acddcd","acdd" };
		if (str == null) {
			String comda = null;
		}
		int cout=0;
		cout=str[0].length();
		for(int i=0;i<str.length-1;i++){
			if(str[i].length()>str[i+1].length()) {
				cout=str[i+1].length();
			}
			
		}
		System.out.println(cout);
		// 循环匹配
		String comda = null;
		boolean flag = true;
		for (int j = 0; j < cout;) {
			if (flag == true) {
				System.out.println("j:"+j);
				for (int g = 0; g < str.length-1;g++) {
					if (str[g].substring(0, j+1).equals(str[g + 1].substring(0, j+1)) ) {
						comda = str[0].substring(0,j+1);
					} else {
						flag = false;
						break;
					}

				}
				j++;

			} else {
				
				break;
			}
		}
		System.out.println("comda:"+comda);

	}

}
