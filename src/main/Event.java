package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event implements ActionListener {

	public IAction<ActionEvent> e;
	public Event(IAction<ActionEvent> e) {
		this.e = e;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		e.exec(arg0);		
	}

}
