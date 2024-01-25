
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import org.json.simple.JSONObject;

import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
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
		setResizable(false);
		getContentPane().setBackground(Color.BLUE);
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
		
		
		 JPanel gamesResultLable= new JPanel();
		 gamesResultLable.setPreferredSize(new Dimension(730,180));
		 gamesResultLable.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		 
		 date=new JLabel(dateJson);
		 date.setFont(new Font("Dialog" , Font.PLAIN, 19));
		 gamesResultLable.add(date);
		 
		 teamNameA = new JLabel(homeTeamName);
		 teamNameA.setFont(new Font("Dialog" , Font.BOLD, 10));
		 gamesResultLable.add(teamNameA);
		 
		 resultgameA=new JLabel(String.valueOf(scoreA));
		 resultgameA.setFont(new Font("Dialog" , Font.BOLD, 90));
		 gamesResultLable.add(resultgameA);
		 
		 teamNameB = new JLabel(awayTeamName);
		 teamNameB.setFont(new Font("Dialog" , Font.BOLD, 10));
		 gamesResultLable.add(teamNameB);
		 
		 resultgameB=new JLabel(String.valueOf(scoreB));
		 resultgameB.setFont(new Font("Dialog" , Font.BOLD, 90));
		 gamesResultLable.add(resultgameB);
	     
		 
		 gameStates = new JLabel(StatusJson);
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
		mainScoresPanel.setBounds(5, 140, 730, 500);
		mainScoresPanel.setLayout(new GridLayout(0, 1, 10, 10));
		mainScoresPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));

// 		mainScoresPanel.setLayout(new BoxLayout(mainScoresPanel, BoxLayout.Y_AXIS));
 		//mainScoresPanel.setLayout(new BorderLayout());/
 		
 		
 		
		for (int i =0; i < matches.size(); i++) {
	
			JSONObject match = (JSONObject) matches.get(i);
			setLabels(i,match, mainScoresPanel);
		}

		JScrollPane scrollPane = new JScrollPane(mainScoresPanel);		
		scrollPane.setBounds(5,140, 730, 500);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
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
