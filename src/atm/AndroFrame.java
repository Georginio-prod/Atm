package atm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AndroFrame extends JFrame 
{
    private JButton validBut; 
    private JTextField field;
    private JComboBox choixBox;
    private JLabel soldeLab;
    private int solde = 1000;
    public AndroFrame()
    {
        super();
        this.setTitle("ATM");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        init();
        listen();
    }
    
    private void init()
    {
        validBut = new JButton("Valider");
        field = new JTextField();
        choixBox = new JComboBox (new String []{"Depot", "Retrait"});
        soldeLab = new JLabel ("Solde " + solde);
        
        JPanel mainPane = new JPanel();
        JPanel soldePane = new JPanel();
        JPanel validePane = new JPanel();
        JPanel centerPane = new JPanel();
        JPanel boxPane = new JPanel ();
        JPanel fieldPane = new JPanel ();
        JLabel opLab = new JLabel("Opération :");
        JLabel mtnLab = new JLabel ("Montant :");
        
        mainPane.setLayout(new BorderLayout(5,5));
        mainPane.setBackground(Color.WHITE);
        mainPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red), "Accueil"));
        
        mainPane.add(soldePane, BorderLayout.WEST);
        mainPane.add(centerPane, BorderLayout.CENTER);
        mainPane.add(validePane, BorderLayout.SOUTH);
        
        soldePane.setLayout(new FlowLayout(FlowLayout.CENTER ,5,5));
        soldePane.add(soldeLab);
        
        validePane.setLayout(new FlowLayout(FlowLayout.CENTER ,5,5));
        validePane.add(validBut);
        
        centerPane.setLayout(new BorderLayout(5,5));
        centerPane.add(boxPane,BorderLayout.NORTH);
        centerPane.add(fieldPane, BorderLayout.CENTER);
        
        boxPane.setLayout(new FlowLayout(FlowLayout.CENTER ,5,5));
        boxPane.add(opLab);
        boxPane.add(choixBox);
        
        fieldPane.setLayout(new FlowLayout(FlowLayout.CENTER ,5,5));
        fieldPane.add(mtnLab);
        fieldPane.add(field);
        field.setPreferredSize(new Dimension(180, 25));
        
        this.getContentPane().add(mainPane);  
    }
    
    private void listen(){
        field.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
                char c = e.getKeyChar();
                if(!Character.isDigit(c))
                {
                    e.consume();
                }
            }
        });
        
        
        validBut.addActionListener(e ->{
            if(e.getSource() instanceof JButton )
            {
                if(choixBox.getSelectedItem().toString().equals("Depot")){
                    if(!field.getText().isEmpty())
                    {
                        int montant = Integer.valueOf(field.getText());
                        if(montant <= solde && montant > 0)
                        {
                            int temp = solde + montant;
                            JOptionPane.showMessageDialog(this,
                                    "La solde etait" + solde  + " et maintenant il est de " + temp,
                                    "Resultat de l'operation",
                                    JOptionPane.INFORMATION_MESSAGE);
                            solde = temp;
                        }
                        else
                        {
                            if(montant < 0)
                            {
                                JOptionPane.showMessageDialog(this,
                                   "Impossible de deposer un montant négatif",
                                   "Resultat de l'operation",
                                   JOptionPane.ERROR_MESSAGE);
                            }
                            else if( montant == 0)
                            {
                                JOptionPane.showMessageDialog(this,
                                   "Impossible de deposer un montant null",
                                   "Resultat de l'operation",
                                   JOptionPane.ERROR_MESSAGE);
                            }
                        } 
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,
                            "Veuillez specifier un montant",
                            "Resultat de l'operation",
                            JOptionPane.WARNING_MESSAGE);
                    }
                }
                
                if(choixBox.getSelectedItem().toString().equals("Retirer")){
                    if(!field.getText().isEmpty())
                    {
                        int montant = Integer.valueOf(field.getText());
                        if(montant > 0)
                        {
                            int temp = solde - montant;
                            JOptionPane.showMessageDialog(this,
                                    "La solde etait" + solde  + " et maintenant il est de " + temp,
                                    "Resultat de l'operation",
                                    JOptionPane.INFORMATION_MESSAGE);
                            solde = temp;
                        }
                        else
                        {
                            if(montant < 0)
                            {
                                JOptionPane.showMessageDialog(this,
                                   "Impossible de retirer un montant négatif",
                                   "Resultat de l'operation",
                                   JOptionPane.ERROR_MESSAGE);
                            }
                            else if( montant == 0)
                            {
                                JOptionPane.showMessageDialog(this,
                                   "Impossible de retirer un montant null",
                                   "Resultat de l'operation",
                                   JOptionPane.ERROR_MESSAGE);
                            }
                            else if( montant > solde)
                            {
                                JOptionPane.showMessageDialog(this,
                                   "Votre solde est insuffisant",
                                   "Resultat de l'operation",
                                   JOptionPane.ERROR_MESSAGE);
                            }
                        } 
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,
                            "Veuillez specifier un montant",
                            "Resultat de l'operation",
                            JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        }); 
    }
}