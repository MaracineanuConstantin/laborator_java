import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class TeacherForm {

    public JPanel getPanel1() {
        return panel1;
    }

    public TeacherForm(JFrame user)
    {   this.user=user;
        user.setPreferredSize(new Dimension(500,500));
        afisareCursuriButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==afisareCursuriButton) {

                    String[] cursuriprofesor = new String[Application.getInstance().manager.cursuri.size()];
                    for (String s : Application.getInstance().currentUser.menuStrategy.getAccountHolderInformation().keySet()) {
                        String prenume = Application.getInstance().currentUser.menuStrategy.getAccountHolderInformation().get(s);
                        cursuriprofesor = Application.getInstance().manager.ProfessorCourses(new Profesor(s, prenume));
                    }
                    System.out.println(cursuriprofesor.toString());
                }
            }
        });

        /*
        String[] cursuriprofesor=new String[Application.getInstance().manager.cursuri.size()];
        for(String s: Application.getInstance().currentUser.menuStrategy.getAccountHolderInformation().keySet()) {
            String prenume = Application.getInstance().currentUser.menuStrategy.getAccountHolderInformation().get(s);

            int counter=0;
            */
           /*
            for (Curs c : Application.getInstance().manager.cursuri)
            {  if(c.profu.nume.equals(s) && c.profu.prenume.equals(prenume))
                 cursuriprofesor[counter]=c.nume;
            }
        }


        afisareCursuriButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==afisareCursuriButton) {

                    String[] cursuriprofesor = new String[Application.getInstance().manager.cursuri.size()];
                    for (String s : Application.getInstance().currentUser.menuStrategy.getAccountHolderInformation().keySet()) {
                        String prenume = Application.getInstance().currentUser.menuStrategy.getAccountHolderInformation().get(s);
                        cursuriprofesor = Application.getInstance().manager.ProfessorCourses(new Profesor(s, prenume));
                    }
                    for(int i=0;i<cursuriprofesor.length;i++){
                        System.out.println(cursuriprofesor);
                    }
                }
            }
        });

*/

        AfisareStudentiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        gradeStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }



    private JPanel panel1;
    private JButton afisareCursuriButton;
    private JButton AfisareStudentiButton;
    private JButton gradeStudentButton;
    private JFrame user;
}
