package capstoneCS2334;

public class CustomNode<T> {
	private T value;
	private CustomNode<T> nextNode;
	
	public CustomNode(T value, CustomNode<T> nextNode) {
		this.value = value;
		this.nextNode = nextNode;
	}
	
	public T getValue() {return value;}
	public void setValue(T value) {this.value = value;}
	public CustomNode<T> getNextNode() {return nextNode;}
	public void setNextNode(CustomNode<T> nextNode) {this.nextNode = nextNode;}
}
