
public class Main {
	static int timesPer = 100;
	static int total = 10000;
	static double aver = 0;
	static double[] averages = new double[total];
	static Randp[] gens;
	
	public static void main(String[] args) {
		for (int i = 0; i < total; i++){
			averages[i] = test(i + 1);
		}
		for (int i = 0; i < total; i++){
			System.out.println("Average depth for " + (i + 1) + " number tree: " + averages[i]);
		}
	}
	
	public static double test(int a){
		gens = new Randp[a];
		aver = 0;
		for (int i = 0; i < timesPer; i++){
			Randp r = new Randp(a);
			BST<Integer> t = new BST<Integer>(r.nextInt());
			for (int j = 0; j < (a - 1); j++){
				t.insert(r.nextInt());
			}
			aver += t.depth();
		}
		aver /= timesPer;
		return aver;
	}

}
