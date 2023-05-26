import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VPNClient extends JFrame {
    private JButton connectBtn;
    JTextField connect = new JTextField(10);
    public VPNClient() {
        super("Banana VPN");

        connectBtn = new JButton("Connect");
        setLocationRelativeTo(null);
        connectBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to establish VPN connection
                JOptionPane.showMessageDialog(VPNClient.this, "VPN connected!");
            }
        });

        setLayout(new FlowLayout());
        add(connectBtn);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VPNClient());
    }
}
