package day0926;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CaculateSumprice {
	public static void CaculateCount(List<CityCatogryDetial> citycatogrydetial) {
		Map<String,List<Map<String,int[]>>> catogry = new HashMap<String, List<Map<String,int[]>>>();
		for(int i=0;i<citycatogrydetial.size();i++) {
			System.out.println(i+"citycatogrydetial.size():"+citycatogrydetial.size());
			if(catogry.containsKey(citycatogrydetial.get(i).getCartgory())) {
				Map<String,int[]> cityCount =new HashMap<String, int[]>();
				List<Map<String,int[]>> cityCountList = new ArrayList<Map<String,int[]>>();
				int[] num =new int[2];
				num[0]=citycatogrydetial.get(i).getPrice();
				num[1]=citycatogrydetial.get(i).getCount();
				cityCount.put(citycatogrydetial.get(i).getCity(), num);
				cityCountList.add(cityCount);
			}
			else {
				Map<String,int[]> cityCount =new HashMap<String, int[]>();
				List<Map<String,int[]>> cityCountList = new ArrayList<Map<String,int[]>>();
				int[] num =new int[2];
				num[0]=citycatogrydetial.get(i).getPrice();
				num[1]=citycatogrydetial.get(i).getCount();
				cityCount.put(citycatogrydetial.get(i).getCity(), num);
				cityCountList.add(cityCount);
				catogry.put(citycatogrydetial.get(i).getCartgory(), cityCountList);
			}
		}
		
		for(Entry<String,List<Map<String,int[]>>> Ca:catogry.entrySet()) {
			for(int j=0;j<Ca.getValue().size();j++) {
				for(int f=0;f<Ca.getValue().size();f++) {
					System.out.println(Ca.getValue().size());
					for(Entry<String, int[]> ci:Ca.getValue().get(f).entrySet()){
				   System.out.println(Ca.getKey()+ci.getKey());
					}
				}
			}
	}
		
		
	}

	public static void main(String[] args) {
		List<CityCatogryDetial> ci =new ArrayList<CityCatogryDetial>();
		ci.add(new CityCatogryDetial("A","BJ",1,12));
		ci.add(new CityCatogryDetial("A","hz",1,12));
		CaculateCount(ci);
	}
	
	
	
	
}
