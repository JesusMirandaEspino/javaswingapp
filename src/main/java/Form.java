import javax.swing.*;

public class Form extends JFrame{
    private JPanel panel1;

    public Form(){
        inicializarForma();
    }

    private void inicializarForma(){
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        SetLocationRelativeTo(null);
    }

    private void SetLocationRelativeTo(Object o) {
    }


    public static void main( String[] args){
        Form forma = new Form();
        forma.setVisible(true);
    }

}
