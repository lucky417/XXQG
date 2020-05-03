
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] st= {1,2,3};
		int a=1;
		boolean flag = false;
		for (int j=0; j<st.length;j++)
		{
		    if(a==st[j])
		    {
		        System.out.println("此数列中包含这个数");
		        flag =true;
		        break;
		    }
		    System.out.println(j);      
		}
		 
		if(!flag)
		{
		    System.out.println("此数列中不包含这个数");
		}

	}

}
