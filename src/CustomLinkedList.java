package capstoneCS2334;

public class CustomLinkedList<T> {
	private CustomNode<T> firstNode;
	private CustomNode<T> lastNode;
	private boolean isEmpty = false;
	private int size = 0;
	
	public CustomLinkedList() {}

    public void add(T value) {
        // Create the new node first
        CustomNode<T> newNode = new CustomNode<T>(value, null);

        if (firstNode == null) { // Check if the list is empty
            // If empty, first and last are the same node
            firstNode = newNode;
            lastNode = newNode;
        } else {
            // If not empty, attach the new node to the end
            lastNode.setNextNode(newNode);
            // IMPORTANT: Update lastNode to be the new node
            lastNode = newNode;
        }

        // IMPORTANT: Increment size in all cases
        size++;
    }

    public T get(int index) {
        if (index >= size || index < 0) {throw new IndexOutOfBoundsException("Attempted to index " + index + " on CustomLinkedList with size " + size);}
        CustomNode<T> nodeToReturn = firstNode;
        //                                      The fix is here
        for (int currentIndex = 0; currentIndex < index; currentIndex++) {
            nodeToReturn = nodeToReturn.getNextNode();
        }
        return nodeToReturn.getValue();
    }
	
	public void setFirstNode(CustomNode<T> node) {firstNode = node;}
	public void setLastNode(CustomNode<T> node) {lastNode = node;}

    public void insert(int index, T value) {
        if (index > size || index < 0) {throw new IndexOutOfBoundsException("Attempted to insert " + index + " on CustomLinkedList with size " + size);}

        if (index == 0) {
            CustomNode<T> newFirstNode = new CustomNode<>(value, firstNode);
            setFirstNode(newFirstNode);
            if (size == 0) { // If list was empty, new node is also last node
                lastNode = newFirstNode;
            }
            size++;
            return;
        }

        if (index == size) {
            // This is just a normal 'add'
            add(value); // Let's just re-use the 'add' method we already fixed!
            return;
        }

        CustomNode<T> nodeBeforeIndex = firstNode;

        for (int iteration = 0; iteration < index - 1; iteration++) {
            nodeBeforeIndex = nodeBeforeIndex.getNextNode();
        }

        CustomNode<T> nodeAfterIndex = nodeBeforeIndex.getNextNode();

        CustomNode<T> newNode = new CustomNode<T>(value, nodeAfterIndex);

        nodeBeforeIndex.setNextNode(newNode);
        size++;
    }

    public T remove(int index) {
        if (index >= size || index < 0) {throw new IndexOutOfBoundsException("Attempted to remove " + index + " on CustomLinkedList with size " + size);}

        if (index == 0) {
            T cachedValue = firstNode.getValue();
            CustomNode<T> newFirstNode = firstNode.getNextNode();
            firstNode = newFirstNode;
            if (firstNode == null) {
                lastNode = null;
            }
            size--;
            return cachedValue;
        }

        CustomNode<T> nodeBeforeNodeToRemove = null;
        CustomNode<T> nodeToRemove = firstNode;

        for (int currentIndex = 0; currentIndex < index; currentIndex++) {
            nodeBeforeNodeToRemove = nodeToRemove;
            nodeToRemove = nodeToRemove.getNextNode();
        }


        nodeBeforeNodeToRemove.setNextNode(nodeToRemove.getNextNode());

        if (nodeToRemove.getNextNode() == null) {
            lastNode = nodeBeforeNodeToRemove;
        }

        size--;
        return nodeToRemove.getValue();
    }

    public int size() {
        return size;
    }
}
