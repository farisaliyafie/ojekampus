import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.KeyAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;
import java.util.Date;
import java.text.DateFormat;

/**
 * Write a description of class PusatGUI here.
 * 
 * @author (Faris Ali Yafie) 
 * @version (22 Mei 2017)
 */
public class mainGUI extends JFrame {
    private JMenuBar menuBar;
    private JButton Pelanggan;
    private JButton button2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel jam;

    //Constructor 
    public mainGUI(){

        this.setTitle("OJEK KAMPUS");
        this.setSize(400,300);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);
        
        jam = new JLabel();
        jam.setHorizontalAlignment(JLabel.RIGHT);
        jam.setFont(UIManager.getFont("Raleway"));
        jam.setBounds(0,-190,400,400);
        jam.setVisible(true);
        jam_mulai();
        add(jam);
        Timer hitung = new Timer(500, new ActionListener() 
        {
          @Override
          public void actionPerformed(ActionEvent e) 
          {
              jam_mulai();
          }
        });
        hitung.setRepeats(true);
        hitung.setCoalesce(true);
        hitung.setInitialDelay(0);
        hitung.start();
        
        ImageIcon img = new ImageIcon("logo.png");
        this.setIconImage(img.getImage());

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(400,300));
        contentPane.setBackground(new Color(255,255,0));
        this.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent we) 
            {
                JOptionPane.showMessageDialog(null,"Terima Kasih Telah Menggunakan Jasa Kami !");
                System.exit(0);         
            }
        });


        Pelanggan = new JButton();
        Pelanggan.setBounds(75,150,100,70);
        Pelanggan.setBackground(new Color(214,217,223));
        Pelanggan.setForeground(new Color(0,0,0));
        Pelanggan.setEnabled(true);
        Pelanggan.setFont(new Font("sansserif",0,12));
        Pelanggan.setText("Pelanggan");
        Pelanggan.setVisible(true);
        Pelanggan.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent klik) 
            {
                new CustomerGUI();
            }
        });

        button2 = new JButton();
        button2.setBounds(225,150,100,70);
        button2.setBackground(new Color(214,217,223));
        button2.setForeground(new Color(0,0,0));
        button2.setEnabled(true);
        button2.setFont(new Font("sansserif",0,12));
        button2.setText("Ojek");
        button2.setVisible(true);
        button2.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent klik) 
            {
                new OjekGUI();
            }
        });

        label1 = new JLabel();
        label1.setBounds(115,20,200,45);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("SansSerif",0,24));
        label1.setText("Ini Baru Ojek");
        label1.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(140,100,119,33);
        label2.setBackground(new Color(255,255,0));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("SansSerif",0,20));
        label2.setText("Pilih Opsi:");
        label2.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(177,252,218,43);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Final Project for OjeKampus");
        label3.setVisible(true);
        
        label4 = new JLabel();
        label4.setBounds(130,50,300,45);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("sansserif",0,18));
        label4.setText("Ojek Kampus");
        label4.setVisible(true);
        
        label5 = new JLabel();
        label5.setBounds(-20,130,200,200);
        label5.setIcon(new ImageIcon("logo2.png"));
        label5.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(Pelanggan);
        contentPane.add(button2);
        contentPane.add(label1);
        contentPane.add(label2);
        contentPane.add(label3);
        contentPane.add(label4);
        contentPane.add(label5);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
        this.setResizable(false);
    }

    public void jam_mulai() 
    {
       jam.setText(DateFormat.getDateTimeInstance().format(new Date()));
    }
    
    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");


        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }


     public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new mainGUI();
            }
		});
	}

}