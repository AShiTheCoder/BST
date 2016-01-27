
public class BST<T extends Comparable<T>>{
	private T datum;
	private BST<T> left;
	private BST<T> right;
	
	public BST(T d){
		datum = d;
	}
	
	public T getDatum(){
		return datum;
	}
	
	public BST<T> getLeft(){
		return left;
	}
	
	public BST<T> getRight(){
		return right;
	}
	
	public void printTree(){
		
	}
	
	public int depth(){
		if (left == null && right == null){
			return 1;
		} else if (left != null && right == null){
			return left.depth() + 1;
		} else if (left == null && right != null){
			return right.depth() + 1;
		} else {
			if (left.depth() > right.depth()){
				return left.depth() + 1;
			} else {
				return right.depth() + 1;
			}
		}
	}
	
	public void insert(T d){
		if (d.compareTo(datum) == 0){
			System.out.println("Item already exists");
		} else if (d.compareTo(datum) < 0){
			if (left == null){
				left = new BST<T>(d);
			} else {
				left.insert(d);
			}
		} else {
			if (right == null){
				right = new BST<T>(d);
			} else {
				right.insert(d);
			}
		}
	}
	
	public void delete(T d){
		
	}
	
	public String toString(){
		return String.valueOf(datum);
	}
}
