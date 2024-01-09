import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class FootBallResultSystemGUI extends JFrame implements ActionListener {
	public FootBallResultSystemGUI() {
		super("FootBall Result System");
		setSize(750,500);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		addGUIComponents();
	}

	private void addGUIComponents() {
		
		JButton iranLeague = new JButton("Iran");
		iranLeague.setBounds(90 , 20, 140 , 40);
		iranLeague.setFont(new Font("Dialog" , Font.PLAIN, 22));
		iranLeague.addActionListener(this);
		add(iranLeague);
		
		JButton spainLeague = new JButton("Spain");
		spainLeague.setBounds(305 , 20, 140 , 40);
		spainLeague.setFont(new Font("Dialog" , Font.PLAIN, 22));
		spainLeague.addActionListener(this);
		add(spainLeague);
		
		JButton italyLeague = new JButton("Italy");
		italyLeague.setBounds(520 , 20, 140 , 40);
		italyLeague.setFont(new Font("Dialog" , Font.PLAIN, 22));
		italyLeague.addActionListener(this);
		add(italyLeague);
		
		JButton germanyLeague = new JButton("Germany");
		germanyLeague.setBounds(90 , 80, 140 , 40);
		germanyLeague.setFont(new Font("Dialog" , Font.PLAIN, 22));
		germanyLeague.addActionListener(this);
		add(germanyLeague);
		
		JButton franceLeague = new JButton("France");
		franceLeague.setBounds(305 , 80, 140 , 40);
		franceLeague.setFont(new Font("Dialog" , Font.PLAIN, 22));
		franceLeague.addActionListener(this);
		add(franceLeague);
		
		JButton englandLeague = new JButton("England");
		englandLeague.setBounds(520 , 80, 140 , 40);
		englandLeague.setFont(new Font("Dialog" , Font.PLAIN, 22));
		englandLeague.addActionListener(this);
		add(englandLeague);
	}

}
