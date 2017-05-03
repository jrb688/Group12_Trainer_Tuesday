package trainer_tuesday;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class WorkoutSegment {
	private String name;
	private String description;
	private int seconds;
	JPanel p = new JPanel();
	public WorkoutSegment(String n, String des, int s){
		name = n;
		description = des;
		seconds = s;
		p.add(new JLabel("Name: "+ name));
		p.add(new JLabel("description: "+ description));
		p.add(new JLabel("Seconds: " + seconds));
	}
	public String getName(){
		return name;
	}
	public String getDesc(){
		return description;
	}
	public int getSecs(){
		return seconds;
	}

}
