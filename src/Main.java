
public class Main {
	static int timesPer = 10;
	static int total = 1000;
	static double aver = 0;
	static double[] averages = new double[total];
	
	public static void main(String[] args) {
		test(10000);
	}
	
	public static void test(int a){
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
		System.out.println("Average depth for " + a + " number tree: " + aver);
	}
	
	public static void multTester(){
		for (int i = 0; i < total; i++){
			test(i + 1);
		}
	}
}
