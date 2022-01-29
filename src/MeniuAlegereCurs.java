import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeniuAlegereCurs {
    public MeniuAlegereCurs(JFrame owner){
    this.owner = owner;
    cautaButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == cautaButton){
                System.out.println("Am apasat butnoul de cautare curs");
                try {
                    JOptionPane.showMessageDialog(null, "Se cauta cursul");
                    String tempCursName = textField1.getText();
                    panelCurs.setVisible(false);
                    owner.setContentPane(new MeniuNotareStudenti(owner, tempCursName).getPanelNote());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        }
    });
    }

    public JPanel getPanelCurs() {
        return panelCurs;
    }

    public JPanel panelCurs;
    private JTextField textField1;
    private JButton cautaButton;
    private JFrame owner;
}
