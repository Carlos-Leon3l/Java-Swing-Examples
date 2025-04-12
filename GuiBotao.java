import javax.swing.*;
import java.awt.event.*;

public class GuiBotao extends JPanel {
    private JButton btMensagem, btTeimoso;
    private ImageIcon imageIcon1;

    public GuiBotao() {
        inicializaComponentes();
        definirEventos();
    }
    private void inicializaComponentes() {
        setLayout(null);
        imageIcon1 = new ImageIcon ("java.jpg");
        btMensagem =new JButton("Mensagem", imageIcon1);
        btMensagem.setBounds(50,20,140,30);
        btMensagem.setMnemonic(KeyEvent.VK_N);
        btMensagem.setToolTipText("Clique para ver a mensagem");
        btTeimoso =new JButton("Teimoso");
        btTeimoso.setBounds(50,70,100,25);
        add(btMensagem);
        add(btTeimoso);
    }
    private void definirEventos() {
        btMensagem.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Mensagem enviada com sucesso");
            }
        });
        btTeimoso.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Botão teimoso");
            }
        });
        btTeimoso.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                btTeimoso.setBounds(50,120,100,25);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btTeimoso.setBounds(50,70,100,25);
            }
        });
    }
}
