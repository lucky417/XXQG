
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num_ch_day = new ArrayList();
		List<Integer> num_ch_house = new ArrayList();
		Map<String, List<Integer>> Ca= new HashMap();
		List<Integer> num_us_day = new ArrayList();
		List<Integer> num_us_house = new ArrayList();
		Map<String, List<Integer>> us= new HashMap();
		Map<String, Map<String, List<Integer>>> Co = new HashMap();
	    num_ch_day.add(1);
	    num_ch_day.add(2);
	    num_ch_day.add(3);
	    num_ch_house.add(2);
	    num_ch_house.add(3);
	    num_ch_house.add(4);
	    num_us_day.add(1);
	    num_us_day.add(2);
	    num_us_day.add(3);
	    num_us_house.add(2);
	    num_us_house.add(3);
	    num_us_house.add(4);
	    Ca.put("生活",num_ch_day);
	    Ca.put("房产", num_ch_house);
	    us.put("生活",num_us_day);
	    us.put("房产", num_us_house);
	    Co.put("中国", Ca);
	    Co.put("美国", us);
	    for(Map.Entry<String, Map<String, List<Integer>>> FO: Co.entrySet()) {
	    	for(Map.Entry<String,List<Integer>> country:FO.getValue().entrySet()) {
	    		int sum = 0;
	    		for(Integer s:country.getValue()) {
	    			sum=sum+s;
	    		}
    			System.out.println("国家："+FO.getKey()+"行业："+country.getKey()
    			+"GTP:"+sum/country.getValue().size());
	    	}
	    			}

	}

}
