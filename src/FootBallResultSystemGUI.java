
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import org.json.simple.JSONObject;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import org.json.simple.JSONArray;

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
		
		JButton iranLeague = new JButton("Portugal");
		iranLeague.setName("Portugal");
		iranLeague.setBounds(90 , 20, 140 , 40);
		iranLeague.setFont(new Font("Dialog" , Font.PLAIN, 22));
		iranLeague.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		iranLeague.addActionListener(this);
		add(iranLeague);
		
		JButton spainLeague = new JButton("Spain");
		spainLeague.setName("Spain");
		spainLeague.setBounds(305 , 20, 140 , 40);
		spainLeague.setFont(new Font("Dialog" , Font.PLAIN, 22));
		spainLeague.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		spainLeague.addActionListener(this);
		add(spainLeague);
		
		JButton italyLeague = new JButton("Italy");
		italyLeague.setName("Italy");
		italyLeague.setBounds(520 , 20, 140 , 40);
		italyLeague.setFont(new Font("Dialog" , Font.PLAIN, 22));
		italyLeague.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		italyLeague.addActionListener(this);
		add(italyLeague);
		
		JButton germanyLeague = new JButton("Germany");
		germanyLeague.setName("Germany");
		germanyLeague.setBounds(90 , 80, 140 , 40);
		germanyLeague.setFont(new Font("Dialog" , Font.PLAIN, 22));
		germanyLeague.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		germanyLeague.addActionListener(this);
		add(germanyLeague);
		
		JButton franceLeague = new JButton("France");
		franceLeague.setName("France");
		franceLeague.setBounds(305 , 80, 140 , 40);
		franceLeague.setFont(new Font("Dialog" , Font.PLAIN, 22));
		franceLeague.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		franceLeague.addActionListener(this);
		add(franceLeague);
		
		JButton englandLeague = new JButton("England");
		englandLeague.setName("England");
		englandLeague.setBounds(520 , 80, 140 , 40);
		englandLeague.setFont(new Font("Dialog" , Font.PLAIN, 22));
		englandLeague.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		englandLeague.addActionListener(this);
		add(englandLeague);
		
	}
	
	int dateH = 170, boxH = 165, resultH = 133, logoA = 185, logoB = 185, nameAH = 195, nameBH = 195;
	public void ShowResult(JSONObject results) {
		
		 JLabel gameResult =new JLabel();
		 gameResult.setBounds(15 , boxH = boxH +105, 700 , 90);
		 gameResult.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		 add(gameResult);

		
		 date=new JLabel("2024/01/09");
		 date.setBounds(20 , dateH = dateH + 105, 340 ,30);
		 date.setFont(new Font("Dialog" , Font.PLAIN, 19));
		 add(date);
		 
		 resultgame=new JLabel("2-1");
		 resultgame.setBounds(201, resultH = resultH +105, 340 ,155);
		 resultgame.setFont(new Font("Dialog" , Font.BOLD, 90));
		 resultgame.setHorizontalAlignment(SwingConstants.CENTER);
		 add(resultgame);
		 
		 teamLogoA = new JLabel();
		 teamLogoA.setBounds( 430, logoA = logoA + 105, 50, 55);
		 teamLogoA.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		 add(teamLogoA);
		 
		 teamLogoB = new JLabel();
		 teamLogoB.setBounds( 249, logoB = logoB + 105, 50, 55);
		 teamLogoB.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		 add(teamLogoB);
		 
		 teamNameA = new JLabel("Liverpool");
		 teamNameA.setBounds( 490, nameAH = nameAH + 105, 90, 30);
		 teamNameA.setFont(new Font("Dialog" , Font.BOLD, 14));
		 add(teamNameA);
		 //"<html><b>Manchester</b> city</html>
		 teamNameB = new JLabel("liverpool");
		 teamNameB.setBounds( 160, nameBH = nameBH + 105, 90, 30);
		 teamNameB.setFont(new Font("Dialog" , Font.BOLD, 14));
		 add(teamNameB);
		 
		 scorerA = new JLabel("Salah");
		 scorerA.setBounds( 580, 180, 55, 30);
		 scorerA.setFont(new Font("Dialog" , Font.PLAIN, 10));
		 add(scorerA);
		 
		 scorerB = new JLabel("De Bruyne");
		 scorerB.setBounds( 100, 180, 55, 30);
		 scorerB.setFont(new Font("Dialog" , Font.PLAIN, 10));
		 add(scorerB);
		 
		 gameStates = new JLabel("Not Started");
		 gameStates.setBounds(20, 180, 80, 30);
		 gameStates.setFont(new Font("Dialog" , Font.PLAIN, 12));
		 add(gameStates);
		 
		 week = new JLabel("nightteenth");
		 week.setBounds(640, 160, 80, 30);
		 week.setFont(new Font("Dialog" , Font.PLAIN, 12));
		 add(week);

	     
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		JButton o = (JButton)e.getSource();
		String name = o.getName();
		JSONArray matches = new JSONArray();
		switch (name) {
		case "Portugal"://PPL
			matches = FootBallResultSystemAPI.getLeageData("PPL");
			break;
		case "Spain"://PD
			matches = FootBallResultSystemAPI.getLeageData("PD");
			break;
		case "Italy"://SA
			matches = FootBallResultSystemAPI.getLeageData("SA");
			break;
		case "France"://FL1
			matches = FootBallResultSystemAPI.getLeageData("FL1");
			break;
		case "Germany"://BL1
			matches = FootBallResultSystemAPI.getLeageData("BL1");
			break;
		case "England"://PL
			matches = FootBallResultSystemAPI.getLeageData("PL");
			break;
		}
		
		for(int i = 0 ; i < matches.size() ; i++) {
			
			JSONObject match = (JSONObject) matches.get(i);
			 
			String gameStatus = (String) match.get("status");	
			String date = (String) match.get("utcDate");
			
			JSONObject  homeTeam = (JSONObject) match.get("homeTeam");
			String nameA = (String) homeTeam.get("shortName");
			JSONObject  awayTeam = (JSONObject) match.get("awayTeam");
			String nameB = (String) homeTeam.get("shortName");
			
			JSONObject  score = (JSONObject) match.get("score");
			JSONObject  fullTime = (JSONObject) score.get("fullTime");
			int homeScore = (int) fullTime.get("home");
			int awayScore = (int) fullTime.get("away");
			
			JSONObject results = new JSONObject();
			results.put("game_status", gameStatus);
			results.put("date", date);
			results.put("nameA", nameA);
			results.put("nameB", nameB);
			results.put("home_score", homeScore);
			results.put("home_score", homeScore);
			
			ShowResult(results);
		}
	}


}
