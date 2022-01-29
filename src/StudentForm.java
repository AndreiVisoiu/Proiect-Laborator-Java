import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm {
    public StudentForm(JFrame owner){
        this.owner = owner;
        ManagerCursuri manager = new ManagerCursuri();

        afisareCursuriButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == afisareCursuriButton)
                {
                    System.out.println("Se afiseaza cursurile la care participati!");
                    /*
                    try{
                        //Ia fiecare curs si cauta daca user-ul participa
                        for(Curs c : manager.cursuri)
                        {
                            for(Student s : c.studenti)
                            {
                               // if(s == ????)
                                    System.out.println(c);
                            }
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    */
                }

            }
        });

        noteCursuriButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == noteCursuriButton) {
                    System.out.println("Se afiseaza notele de la cursuri!");
                    /*
                    try {
                        //Cauta in fiecare curs daca user-ul participa si ii afiseaza notele
                        for (Curs c : manager.cursuri) {
                            for (Student s : c.studenti) {
                                // if(s == ????)
                                System.out.println(c.nota.get(s));
                            }
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    */
                }
            }
        });

        medieAnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == medieAnButton)
                {
                    System.out.println("Se afiseaza media anului!");
                   /*
                    try{
                        for (Curs c : manager.cursuri) {
                            for (Student s : c.studenti) {
                                // if(s == ????)
                                System.out.println();
                            }
                        }
                    } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                    */
                }
            }
        });

    }

    public JPanel getPanelStudent() {
        return panelStudent;
    }

    private JPanel panelStudent;
    private JButton afisareCursuriButton;
    private JButton noteCursuriButton;
    private JButton medieAnButton;
    private JFrame owner;
}
