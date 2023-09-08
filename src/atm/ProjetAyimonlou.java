package atm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProjetAyimonlou extends JFrame {

    private JButton finaliserBut;
    private JTextField riz;
    private JTextField maka;
    private JTextField gali;
    private JTextField sauce;
    private JTextField azo;
    private JTextField viande;
    private JTextField poison;
    private JTextField accompagnement;
    private JComboBox rizBox;
    private JComboBox makaBox;
    private JComboBox galiBox;
    private JComboBox sauceBox;
    private JComboBox azoBox;
    private JComboBox viandeBox;
    private JComboBox poisonBox;
    private JComboBox accompagnementBox;
    private JLabel soldeLab;
    private int solde = 0;

    public ProjetAyimonlou() {
        super();
        setTitle("AYIMONLOU");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        init();
        listen();

    }

    public void init() {
        finaliserBut = new JButton("Finaliser");
        riz = new JTextField();
        maka = new JTextField();
        gali = new JTextField();
        sauce = new JTextField();
        azo = new JTextField();
        viande = new JTextField();
        poison = new JTextField();
        accompagnement = new JTextField();
        rizBox = new JComboBox(new String[]{"riz", "ayimonlou", "riz blanc", "riz au gras"});
        makaBox = new JComboBox(new String[]{"maka", "rien", "maka", "salade"});
        galiBox = new JComboBox(new String[]{"gali", "rien", "gali blnac", "gali jaune"});
        sauceBox = new JComboBox(new String[]{"sauce", "ébécé toto", "sauce", "fionfion"});
        azoBox = new JComboBox(new String[]{"azo", "rien", "azo"});
        viandeBox = new JComboBox(new String[]{"viande", "rien", "akpama", "saucice", "oeuf", "poulet", "bœuf"});
        poisonBox = new JComboBox(new String[]{"poison", "rien", "assiké", "sodja", "dodomé"});
        accompagnementBox = new JComboBox(new String[]{"rien", "eau", "jus", "boisson"});
        soldeLab = new JLabel("Solde " + solde);

        JPanel mainPane = new JPanel();
        JPanel soldePane = new JPanel();
        JPanel finaliserPane = new JPanel();
        JPanel centerPane = new JPanel();

        JPanel rizPane = new JPanel();
        JPanel makaPane = new JPanel();
        JPanel galiPane = new JPanel();
        JPanel saucePane = new JPanel();
        JPanel azoPane = new JPanel();
        JPanel viandePane = new JPanel();
        JPanel poisonPane = new JPanel();
        JPanel accpPane = new JPanel();
        JLabel rizLab = new JLabel("Prix:");
        JLabel makaLab = new JLabel("Prix:");
        JLabel galiLab = new JLabel("Prix:");
        JLabel sauceLab = new JLabel("Prix:");
        JLabel azoLab = new JLabel("Prix:");
        JLabel viandeLab = new JLabel("Prix:");
        JLabel poisonLab = new JLabel("Prix:");
        JLabel accpLab = new JLabel("Prix:");

        mainPane.setLayout(new BorderLayout(5, 5));
        mainPane.setBackground(Color.WHITE);
        mainPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red), "Bienvenu "));

        mainPane.add(soldePane, BorderLayout.WEST);
        mainPane.add(centerPane, BorderLayout.CENTER);
        mainPane.add(finaliserPane, BorderLayout.SOUTH);

        soldePane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        soldePane.add(soldeLab);

        finaliserPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        finaliserPane.add(finaliserBut);

        JPanel pane1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel pane2 = new JPanel(new GridLayout(1, 3));
        JPanel pane21 = new JPanel(new GridLayout(2, 1));
        JPanel pane22 = new JPanel(new GridLayout(2, 1));
        JPanel pane23 = new JPanel(new GridLayout(2, 1));
        JPanel pane3 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        pane1.add(rizPane);
        pane2.add(pane21);
        pane2.add(pane22);
        pane2.add(pane23);
        pane21.add(makaPane);
        pane21.add(viandePane);
        pane22.add(poisonPane);
        pane22.add(azoPane);
        pane23.add(galiPane);
        pane23.add(saucePane);
        
        pane3.add(accpPane);

        centerPane.setLayout(new BorderLayout(5, 5));
        centerPane.add(pane1, BorderLayout.NORTH);
        centerPane.add(pane2, BorderLayout.CENTER);
        centerPane.add(pane3, BorderLayout.SOUTH);
      

        rizPane.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        rizPane.add(rizBox);
        rizPane.add(rizLab);

        makaPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
        makaPane.add(makaBox);
        makaPane.add(makaLab);

        galiPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        galiPane.add(galiBox);
        galiPane.add(galiLab);

        saucePane.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        saucePane.add(sauceBox);
        saucePane.add(sauceLab);

        azoPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        azoPane.add(azoBox);
        azoPane.add(azoLab);

        viandePane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        viandePane.add(viandeBox);
        viandePane.add(viandeLab);

        poisonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        poisonPane.add(poisonBox);
        poisonPane.add(poisonLab);

        accpPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        accpPane.add(accompagnementBox);
        accpPane.add(accpLab);
        //combo

        
        rizPane.add(riz);
        riz.setPreferredSize(new Dimension(80, 25));

        
        makaPane.add(maka);
        maka.setPreferredSize(new Dimension(80, 25));

        
        galiPane.add(gali);
        gali.setPreferredSize(new Dimension(80, 25));

      
        saucePane.add(sauce);
        sauce.setPreferredSize(new Dimension(80, 25));

        
        azoPane.add(azo);
        azo.setPreferredSize(new Dimension(80, 25));

      
        viandePane.add(viande);
        viande.setPreferredSize(new Dimension(80, 25));

       
        poisonPane.add(poison);
        poison.setPreferredSize(new Dimension(80, 25));

        accpPane.add(accompagnement);
        accompagnement.setPreferredSize(new Dimension(80, 25));

        this.getContentPane().add(mainPane);
    }
    
    public void listen()
    {
        
        
    }

}
