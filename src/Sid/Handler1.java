package Sid;

import java.util.ArrayList;

public class Handler1 {
	public ArrayList<Integer> List;
	public ArrayList<Integer> List1;
	public double sum1 = 0;
	public int min1 = 100;
	public int max1 = 0;
	public double sred1 = 0.0;
	private int i,n;
	Generator random1;
	
	public void handler(int i, int k) {
		n = random1.getN();
		i = i*k;
		k += i-1;
		if (k>n) {
			k = n;
		}
		//List = new ArrayList<Integer>();
		for (int z = i; z < k; z++) {
			List.add(List1.get(z)); //берем нужную нам часть списка
		}
		for (int z = 0; z < List.size(); z++) {
		sum1 = sum1 + List.get(i);
		if (List.get(i) < min1){
			min1 = List.get(i);
		}
		if (List.get(i) > max1) {
			max1 = List.get(i);
			}
	}
	sred1 = sum1 / k;
}
	public void handlerDel() {
		for (int i = 0; i < List.size(); i++) {
			if ((List.get(i) % 2) != 0) { // ==0 удаляем четные, != нечетные
				List.remove(i);
				i--;
			}		
		}
	} 
	public double getSum1() {
		return sum1;
	}
	public int getMin1() {
		return min1;
	}
	public int getMax1() {
		return max1;
	}
	public double getSred1() {
		return sred1;
	}
	public ArrayList<Integer> getList() {
		return List;
	}
	public void setList1(ArrayList<Integer> list) {
		List1 = list;
	}	
}
