package trainer_tuesday;

public class WorkoutSet {
WorkoutNode head;
WorkoutNode tail;
public void insert(WorkoutNode insertAfter, String name, String description, int seconds){
	WorkoutNode temp = new WorkoutNode(name, description, seconds);
	temp.setNext(insertAfter.getNext());
	insertAfter.setNext(temp);
}
public void add(String name, String description, int seconds){
		if(head == null){
			head = new WorkoutNode(name, description, seconds);
		}
		else{
			WorkoutNode node = head;
			while (node.getNext() != null){
			node = node.getNext();
			}//now we have the last node. make this node's next node the node we want to add.
		node.setNext(new WorkoutNode(name, description, seconds));
	}
}

}
