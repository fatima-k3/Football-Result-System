
import java.awt.Color;
import java.awt.Cursor;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;


public class FootBallResultSystemGUI extends JFrame implements ActionListener {
	
	JLabel gamesResultLable,date,resultgame, teamLogoA, teamLogoB, teamNameA, teamNameB,scorerA,scorerB,gameStates, week 
 ;
	
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
		 gamesResultLable.setBounds(10 , 155, 340 , 180);
		 gamesResultLable.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		 add(gamesResultLable);
		 
		 date=new JLabel("2024/01/09");
		 date.setBounds(15 , 168, 340 ,30);
		 date.setFont(new Font("Dialog" , Font.PLAIN, 19));
		 date.setHorizontalAlignment(SwingConstants.CENTER);
		 add(date);
		 
		 resultgame=new JLabel("2-1");
		 resultgame.setBounds(15 , 162, 340 ,155);
		 resultgame.setFont(new Font("Dialog" , Font.BOLD, 90));
		 resultgame.setHorizontalAlignment(SwingConstants.CENTER);
		 add(resultgame);
		 
		 teamLogoA = new JLabel();
		 teamLogoA.setBounds( 70, 215, 50, 55);
		 teamLogoA.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		 add(teamLogoA);
		 
		 teamLogoB = new JLabel();
		 teamLogoB.setBounds( 239, 215, 50, 55);
		 teamLogoB.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		 add(teamLogoB);
		 
		 teamNameA = new JLabel("Liverpool");
		 teamNameA.setBounds( 16, 228, 55, 30);
		 teamNameA.setFont(new Font("Dialog" , Font.BOLD, 10));
		 add(teamNameA);
		 
		 teamNameB = new JLabel("<html><b>Manchester</b> city</html>");
		 teamNameB.setBounds( 289, 228, 60, 30);
		 teamNameB.setFont(new Font("Dialog" , Font.BOLD, 10));
		 add(teamNameB);
		 
		 scorerA = new JLabel("Salah");
<<<<<<< HEAD
		 scorerA.setBounds( 16, 240, 55, 30);
=======
<<<<<<< HEAD
		 scorerA.setBounds( 16, 265, 55, 30);
=======
		 scorerA.setBounds( 16, 240, 55, 30);
>>>>>>> 037c194d2da0e67c6f4dd698df60ef1818a5fea1
>>>>>>> 2e438a4df6e8989fca1f38c8a12cacd5aef2f4dc
		 scorerA.setFont(new Font("Dialog" , Font.PLAIN, 10));
		 add(scorerA);
		 
		 scorerB = new JLabel("De Bruyne");
<<<<<<< HEAD
		 scorerB.setBounds( 289, 240, 55, 30);
=======
<<<<<<< HEAD
		 scorerB.setBounds( 289, 265, 55, 30);
=======
		 scorerB.setBounds( 289, 240, 55, 30);
>>>>>>> 037c194d2da0e67c6f4dd698df60ef1818a5fea1
>>>>>>> 2e438a4df6e8989fca1f38c8a12cacd5aef2f4dc
		 scorerB.setFont(new Font("Dialog" , Font.PLAIN, 10));
		 add(scorerB);
		 
		 gameStates = new JLabel("Not Started");
		 gameStates.setBounds(15, 157, 80, 30);
		 gameStates.setFont(new Font("Dialog" , Font.PLAIN, 12));
		 add(gameStates);
		 
		 week = new JLabel("nightteenth");
		 week.setBounds(280, 155, 80, 30);
		 week.setFont(new Font("Dialog" , Font.PLAIN, 12));
		 add(week);


	}


}
