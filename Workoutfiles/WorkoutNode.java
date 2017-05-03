package trainer_tuesday;

public class WorkoutNode {
WorkoutSegment data;
WorkoutNode next;
public WorkoutNode(WorkoutSegment data){
	this.data = data;
}
public WorkoutNode(String name, String description, int seconds){
	this.data = new WorkoutSegment(name, description, seconds);
}
public WorkoutNode getNext(){
	return next;
}
public void setNext(WorkoutNode n){
	this.next = n;
}
public WorkoutSegment getSegment(){
	return data;
}
}
