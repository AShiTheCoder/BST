import java.util.ArrayList;

public class Randp {
	int x;
	int y;
	ArrayList<Integer> nums = new ArrayList<Integer>();
	
	public Randp(int c){
		for (int i = 0; i < c; i++){
			nums.add(i + 1);
		}
	}
	
	public int nextInt(){
		if (nums.size() == 0){
			return 0;
		} else {
			x = (int)(Math.random() * nums.size());
			y = nums.get(x);
			nums.remove(x);
			return y;
		}
	}
}
