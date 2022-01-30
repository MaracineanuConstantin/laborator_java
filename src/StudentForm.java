import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm {
    public StudentForm(JFrame user) {
        this.user=user;
        user.setPreferredSize(new Dimension(500,500));
        noteCursuriButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] list = new String[Application.getInstance().manager.cursuri.size()];
                for (String s : Application.getInstance().currentUser.menuStrategy.getAccountHolderInformation().keySet()){
                    String prenume = Application.getInstance().currentUser.menuStrategy.getAccountHolderInformation().get(s);
                   // list = Application.getInstance().manager(new Student(s,prenume));
                }
            }
        });
        cursuriInscrisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        mediaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        restanteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }
    private JPanel panel1;
    private JButton cursuriInscrisButton;
    private JButton noteCursuriButton;
    private JButton mediaButton;
    private JButton restanteButton;
    private JFrame user;
}
