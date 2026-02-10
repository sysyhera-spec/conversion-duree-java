package exam_tp_2223;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class AppliDuree {

	private JFrame frmApplication;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel heure;
	private JLabel minute;
	private JLabel seconde;
	private int h = 0;
	private int m = 0;
	private int s = 0;
	private JLabel totalSecondes;
	private int duree = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppliDuree window = new AppliDuree();
					window.frmApplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppliDuree() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmApplication = new JFrame();
		frmApplication.setTitle("Conversion durée");
		frmApplication.setBounds(100, 100, 395, 251);
		frmApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmApplication.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		frmApplication.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel heures = new JPanel();
		panel.add(heures);
		heures.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.LIGHT_GRAY));
		heures.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton heureBoutonHaut = new JButton("\u25B2");
		heureBoutonHaut.setFont(new Font("Tahoma", Font.PLAIN, 20));
		heureBoutonHaut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h++;
				if (h == 24)
					h = 0;
//				duree = h * 3600 + m * 60 + s;
				heure.setText(h + " ");
				mettreAJourAffichageBas();
//				totalSecondes.setText(duree + " secondes ");
				//---------------
			}
		});
		panel_3.add(heureBoutonHaut);
		
		JPanel panel_6 = new JPanel();
		panel_3.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 1, 0, 0));
		
		heure = new JLabel("0 ");
		heure.setFont(new Font("Tahoma", Font.PLAIN, 20));
		heure.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_6.add(heure);
		
		JButton heureBoutonBas = new JButton("\u25BC");
		heureBoutonBas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		heureBoutonBas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h--;
				if (h < 0)
					h = 23;
				heure.setText(h + " ");
				mettreAJourAffichageBas();
				//------------------
			}
		});
		panel_3.add(heureBoutonBas);
		
		JLabel lblNewLabel_3 = new JLabel(" h ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		heures.add(lblNewLabel_3, BorderLayout.EAST);
		
		JPanel minutes = new JPanel();
		panel.add(minutes);
		minutes.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(192, 192, 192)));
		minutes.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton minuteBoutonHaut = new JButton("\u25B2");
		minuteBoutonHaut.setFont(new Font("Tahoma", Font.PLAIN, 20));
		minuteBoutonHaut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m++;
				if (m == 60)
					m = 0;
				minute.setText(m + " ");
				mettreAJourAffichageBas();
				//--------------
			}
		});
		panel_2.add(minuteBoutonHaut);
		
		JPanel panel_8 = new JPanel();
		panel_2.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		minute = new JLabel("0 ");
		minute.setFont(new Font("Tahoma", Font.PLAIN, 20));
		minute.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_8.add(minute);
		
		JButton minuteBoutonBas = new JButton("\u25BC");
		minuteBoutonBas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		minuteBoutonBas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m--;
				if (m < 0)
					m = 59;
				minute.setText(m + " ");
				mettreAJourAffichageBas();
				//----------------------
			}
		});
		panel_2.add(minuteBoutonBas);
		
		JLabel lblNewLabel_4 = new JLabel(" m ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		minutes.add(lblNewLabel_4, BorderLayout.EAST);
		
		JPanel secondes = new JPanel();
		panel.add(secondes);
		secondes.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(192, 192, 192)));
		secondes.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton secondeBoutonHaut = new JButton("\u25B2");
		secondeBoutonHaut.setFont(new Font("Tahoma", Font.PLAIN, 20));
		secondeBoutonHaut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s++;
				if (s == 60)
					s = 0;
				seconde.setText(s + " ");
				mettreAJourAffichageBas();
				//--------------
			}
		});
		panel_4.add(secondeBoutonHaut);
		
		JPanel panel_11 = new JPanel();
		panel_4.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		seconde = new JLabel("0 ");
		seconde.setFont(new Font("Tahoma", Font.PLAIN, 20));
		seconde.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_11.add(seconde, BorderLayout.CENTER);
		
		JButton secondeBoutonBas = new JButton("\u25BC");
		secondeBoutonBas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		secondeBoutonBas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s--;
				if (s < 0)
					s = 59;
				seconde.setText(s + " ");
				mettreAJourAffichageBas();
				//----------------
			}
		});
		panel_4.add(secondeBoutonBas);
		
		JLabel lblNewLabel_5 = new JLabel(" s ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		secondes.add(lblNewLabel_5, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		frmApplication.getContentPane().add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton moins = new JButton("-");
		moins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (duree > 0)
					duree--;
				totalSecondes.setText(duree + " secondes " );
				mettreAJourAffichageHaut();
				//------------------
			}
		});
		moins.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(moins);
		
		totalSecondes = new JLabel("0 secondes ");
		totalSecondes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(totalSecondes);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (duree < 86399)
				duree++;
				totalSecondes.setText(duree + " secondes " );
				mettreAJourAffichageHaut();
				//-------------------
			}
		});
		plus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(plus);
	}
	
	private void mettreAJourAffichageBas() {
	    duree = h * 3600 + m * 60 + s;
	    totalSecondes.setText(duree + " secondes ");
	}
	
	private void mettreAJourAffichageHaut() {
		h = duree / 3600;
		heure.setText(h + " ");
		m = duree % 3600 / 60;
		minute.setText(m + " ");
		s = (duree % 3600) % 60;
		seconde.setText(s + " ");
	}

}
