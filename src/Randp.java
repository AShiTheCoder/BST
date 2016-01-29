public class Randp {
	private int numsLeft;
	int[] samples;
	
	public Randp(int c){
		numsLeft = c;
		samples = new int[c];
		for (int i = 0; i < c; i++){
			samples[i] = i + 1;
		}
	}
	
	public int nextInt(){
		if (numsLeft > 0){
			int x = (int) (Math.random() * numsLeft);
			int y = samples[x];
			if (x == numsLeft - 1){
				numsLeft--;
				return y;
			} else {
				samples[x] = samples[numsLeft - 1];
			}
			numsLeft--;
			return y;
		} else {
			return 0;
		}
	}
}
