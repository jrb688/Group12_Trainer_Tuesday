package trainer_tuesday;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.ConsoleHandler;
import javax.swing.JPanel;

import org.cowboycoders.ant.Channel;
import org.cowboycoders.ant.Node;
import org.cowboycoders.ant.events.BroadcastListener;
import org.cowboycoders.ant.interfaces.AntTransceiver;
import org.cowboycoders.ant.messages.data.BroadcastDataMessage;

public class AntStick {
	private AntTransceiver antchip;
	List<Channel> channels = new ArrayList<Channel>();
	private 

	public AntStick(int num){
		try{
			antchip = new AntTransceiver(num);	
		}
		finally{}
	
	
	if (antchip1 != null){
		JPanel antchip1Panel = new JPanel();
		antchip1Panel.setLayout(new GridLayout(8,1));
		Node antchip1Node = new Node(antchip1);
		
		
	}
	

}
