import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;
public class FootBallResultSystemGUI extends JFrame implements ActionListener {
	
	JLabel gamesResultLable,date,resultgame;
	
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
		iranLeague.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		iranLeague.addActionListener(this);
		add(iranLeague);
		
		JButton spainLeague = new JButton("Spain");
		spainLeague.setBounds(305 , 20, 140 , 40);
		spainLeague.setFont(new Font("Dialog" , Font.PLAIN, 22));
		spainLeague.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		spainLeague.addActionListener(this);
		add(spainLeague);
		
		JButton italyLeague = new JButton("Italy");
		italyLeague.setBounds(520 , 20, 140 , 40);
		italyLeague.setFont(new Font("Dialog" , Font.PLAIN, 22));
		italyLeague.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		italyLeague.addActionListener(this);
		add(italyLeague);
		
		JButton germanyLeague = new JButton("Germany");
		germanyLeague.setBounds(90 , 80, 140 , 40);
		germanyLeague.setFont(new Font("Dialog" , Font.PLAIN, 22));
		germanyLeague.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		germanyLeague.addActionListener(this);
		add(germanyLeague);
		
		JButton franceLeague = new JButton("France");
		franceLeague.setBounds(305 , 80, 140 , 40);
		franceLeague.setFont(new Font("Dialog" , Font.PLAIN, 22));
		franceLeague.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		franceLeague.addActionListener(this);
		add(franceLeague);
		
		JButton englandLeague = new JButton("England");
		englandLeague.setBounds(520 , 80, 140 , 40);
		englandLeague.setFont(new Font("Dialog" , Font.PLAIN, 22));
		englandLeague.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		englandLeague.addActionListener(this);
		add(englandLeague);
		
		 gamesResultLable=new JLabel();
		 gamesResultLable.setBounds(15 , 155, 340 , 180);
		 gamesResultLable.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		 add(gamesResultLable);
		 
		 date=new JLabel("2024/01/09");
		 date.setBounds(15 , 155, 340 ,30);
		 date.setFont(new Font("Dialog" , Font.PLAIN, 19));
		 date.setHorizontalAlignment(SwingConstants.CENTER);
		 add(date);
		 
		 resultgame=new JLabel("2-1");
		 resultgame.setBounds(15 , 147, 340 ,155);
		 resultgame.setFont(new Font("Dialog" , Font.BOLD, 90));
		 resultgame.setHorizontalAlignment(SwingConstants.CENTER);
		 add(resultgame);
		 
	}

}
