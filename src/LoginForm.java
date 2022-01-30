import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    public LoginForm(JFrame user) {
        this.user = user;
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( e.getSource() == btnLogin) {
                    System.out.println("Am apasat butonul de login");
                    try {

                        Application.getInstance().login(new User(txtUsername.getText(), new String(txtPassword.getPassword())));
                       JOptionPane.showMessageDialog(null, "Login successfully!");
                        mainPanel.setVisible(false);

                        if(Application.getInstance().currentUser.menuStrategy.getAccountType()==UserAccountType.STUDENT)
                        { user.setContentPane(new StudentForm(user).getPanel1());

                        }
                        else if(Application.getInstance().currentUser.menuStrategy.getAccountType()==UserAccountType.TEACHER)
                         user.setContentPane(new TeacherForm(user).getPanel1());




                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private JPanel mainPanel;
    private JLabel lblUsername;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JFrame user;
}
