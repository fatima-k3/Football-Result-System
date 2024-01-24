
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import org.json.simple.JSONObject;

import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import org.json.simple.JSONArray;

public class FootBallResultSystemGUI extends JFrame implements ActionListener {
	
	
	public FootBallResultSystemGUI() {
		super("FootBall Result System");
		setSize(750,900);
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
		
		public void setLabels(int index, JSONObject match, JPanel mainScores) {
			
			
				JSONObject matchJson = (JSONObject) match;
				JSONObject homeTeamJson = (JSONObject) matchJson.get("homeTeam");
				String homeTeamName = (String) homeTeamJson.get("shortName");
				String homeTeamlogo = (String) homeTeamJson.get("crest");
				
				JSONObject awayTeamJson = (JSONObject) matchJson.get("awayTeam");
				String awayTeamName = (String) awayTeamJson.get("shortName");
				String awayTeamlogo = (String) awayTeamJson.get("crest");
				
				String dateJson = (String) matchJson.get("utcDate");
				
				JSONObject ScoreJson = (JSONObject) matchJson.get("score");
				JSONObject score = (JSONObject) ScoreJson.get("fullTime");
				Long scoreA = (Long) score.get("home");
				Long scoreB = (Long) score.get("away");
		
				String StatusJson = (String) matchJson.get("status");
			
		JLabel date,resultgameA,resultgameB, teamLogoA, teamLogoB, teamNameA, teamNameB,scorerA,scorerB,gameStates, week; 
		
		int distanceToTop = index * 190 + 20 + 140;
		
		 JPanel gamesResultLable= new JPanel();
		 gamesResultLable.setBounds(10 , distanceToTop, 340 , 180);
		 gamesResultLable.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		 
		 date=new JLabel(dateJson);
		 date.setBounds(15 ,13, 340 ,30);
		 date.setFont(new Font("Dialog" , Font.PLAIN, 19));
		 date.setHorizontalAlignment(SwingConstants.CENTER);
		 gamesResultLable.add(date);
		 
		 resultgameA=new JLabel(String.valueOf(scoreA));
		 resultgameA.setBounds(15 , 7, 150 ,155);
		 resultgameA.setFont(new Font("Dialog" , Font.BOLD, 90));
		 resultgameA.setHorizontalAlignment(SwingConstants.CENTER);
		 gamesResultLable.add(resultgameA);
		 
		 resultgameB=new JLabel(String.valueOf(scoreB));
		 resultgameB.setBounds(185 , 7, 150 ,155);
		 resultgameB.setFont(new Font("Dialog" , Font.BOLD, 90));
		 resultgameB.setHorizontalAlignment(SwingConstants.CENTER);
		 gamesResultLable.add(resultgameB);
		 
		 teamLogoA = new JLabel(loadImage(homeTeamlogo));
		 teamLogoA.setBounds( 70, 60, 50, 55);
		 teamLogoA.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		 gamesResultLable.add(teamLogoA);
		 
		 teamLogoB = new JLabel(loadImage(awayTeamlogo));
		 teamLogoB.setBounds( 239, 60, 50, 55);
		 teamLogoB.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		 gamesResultLable.add(teamLogoB);
		 
		 teamNameA = new JLabel(homeTeamName);
		 teamNameA.setBounds( 16, 73, 55, 30);
		 teamNameA.setFont(new Font("Dialog" , Font.BOLD, 10));
		 gamesResultLable.add(teamNameA);
		 
		 teamNameB = new JLabel(awayTeamName);
		 teamNameB.setBounds( 289, 73, 60, 30);
		 teamNameB.setFont(new Font("Dialog" , Font.BOLD, 10));
		 gamesResultLable.add(teamNameB);
		 
		 
		 gameStates = new JLabel(StatusJson);
		 gameStates.setBounds(15, 2, 80, 30);
		 gameStates.setFont(new Font("Dialog" , Font.PLAIN, 12));
		 gamesResultLable.add(gameStates);
		 mainScores.add(gamesResultLable);
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
		
		
		
		JPanel mainScoresPanel = new JPanel();
		int h=matches.size() * 190;
		mainScoresPanel.setBounds(205,140, 340, h);
		mainScoresPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
 		mainScoresPanel.setLayout(new FlowLayout());//new BoxLayout(mainScoresPanel, BoxLayout.Y_AXIS));
 		//mainScoresPanel.setLayout(new BorderLayout());
 		
		for (int i =0; i < matches.size(); i++) {
	
			JSONObject match = (JSONObject) matches.get(i);
			System.out.println(matches);
			setLabels(i,match, mainScoresPanel);
		}
		
		JScrollPane scrollPane = new JScrollPane(mainScoresPanel);
		scrollPane.setBounds(205,140, 340, 500);
		add(scrollPane);
		repaint();
	}
	private ImageIcon loadImage(String resourcePath) {
		try {
			BufferedImage image = ImageIO.read(new File(resourcePath));
			return new ImageIcon(image);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//System.out.println("Could not find resource file");
		return null;
	}


}
