import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register {
    private JTextField numeTextField;
    private JTextField prenumeTextField;
    private JPasswordField parolaPasswordField;
    private JButton inregistrareButton;
    private JFrame user;

    public Register(JFrame user) {
        this.user=user;
        user.setPreferredSize(new Dimension(500,500));
        inregistrareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Application.getInstance().Register(numeTextField.getText(),prenumeTextField.getText(), new String(parolaPasswordField.getPassword()));
                    JOptionPane.showMessageDialog(null, "Te-ai inregistrat!");

                } catch (HeadlessException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
