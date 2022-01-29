import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherForm {
    public TeacherForm(JFrame owner){
        this.owner = owner;
        ManagerCursuri manager = new ManagerCursuri();
        afisareCursuriButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == afisareCursuriButton) {
                    System.out.println("Se afiseaza cursurile!");
                    /*
                    try{
                        for(Curs c : manager.cursuri)
                        {
                            //Cauta in lista "cursuri" cursurile la care preda profesorul logat in cont
                            if(c.profu == ?????)
                                System.out.println(c); Afiseaza cursurile
                        }

                    }*/
                }
            }
        });

        afisareStudentiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == afisareStudentiButton) {
                    System.out.println("Se afiseaza studentii!");
                /*
                try{
                    for(Curs c : manager.cursuri)
                    {
                        //Cauta in lista "cursuri" cursurile la care preda profesorul si afiseaza studentii
                        if(c.profu == ????)
                            manager.reportStudentsOf(c);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                */
                }
            }
        });

        notareStudentiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == notareStudentiButton) {
                    System.out.println("S-a apasat butonul de notare studenti!");
                    try {
                        JOptionPane.showMessageDialog(null, "Dati numele cursului unde doriti sa notati studentii!");
                        panel1.setVisible(false);
                        owner.setContentPane(new MeniuAlegereCurs(owner).getPanelCurs());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }

    private JPanel panel1;
    private JButton afisareCursuriButton;
    private JButton afisareStudentiButton;
    private JButton notareStudentiButton;
    private JFrame owner;
}
