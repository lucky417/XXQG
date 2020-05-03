import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new ArrayList();
		li.add(1);
		li.add(1);
		li.add(1);
		List<Integer> lius = new ArrayList();
		lius.add(2);
		lius.add(4);
		lius.add(2);
		Map<String,List<Integer>> map = new HashMap();
		map.put("中国",li);
		map.put("美国", lius);
		Map<String, Double> pr = new HashMap();
		for(Map.Entry<String, List<Integer>> en :map.entrySet()) {
			int sum=0;
			double avg=0.00;
			for(Integer in :en.getValue()) {
				sum= sum+ in;
			}
			System.out.println("国家："+ en.getKey()+"GTP:"+sum/(double)en.getValue().size());
			System.out.println("********************88");
			pr.put(en.getKey(),sum/(double)en.getValue().size());
		}
		
		for(Entry<String, Double> se:pr.entrySet()) {
			System.out.println("国家："+se.getKey()+"GTP:"+se.getValue());
		}
		

	}

}
