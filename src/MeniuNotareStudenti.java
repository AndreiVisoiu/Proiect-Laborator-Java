import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeniuNotareStudenti {
    public MeniuNotareStudenti(JFrame owner, String curs){
        this.owner = owner;
        noteazaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == noteazaButton){
                    System.out.println("Se noteaza studentul!");
                    try{
                        ManagerCursuri manager = new ManagerCursuri();
                        Student tempStudent = new Student(nume.getText(), prenume.getText(), Integer.parseInt(grupa.getText()), Integer.parseInt(an.getText()));
                        for(Curs c : manager.cursuri)
                        {
                            if(c.nume == curs)
                                for(Student s : c.studenti)
                                    if(s == tempStudent) {
                                        c.nota.put(s, Integer.parseInt(nota.getText()));
                                    }else
                                        JOptionPane.showMessageDialog(null, "Nu s-a putut gasi studentul!");
                        }

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
            }
        });
    }



    public JPanel getPanelNote() {
        return panelNote;
    }

    public JPanel panelNote;
    private JTextField prenume;
    private JTextField nume;
    private JTextField grupa;
    private JTextField nota;
    private JButton noteazaButton;
    private JTextField an;
    private JFrame owner;
}
