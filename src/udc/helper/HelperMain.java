
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.swing.JTextField;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelperMain {

    private JFrame frame;
    private JTextField textField;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JButton btnNewButton_1;

    /**
     * Launch the application.
     */
//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    HelperMain window = new HelperMain();
//                    window.frame.setVisible(true);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//    }

    /**
     * Create the application.
     */
    public HelperMain() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        ImageIcon image = new ImageIcon("work.png/");
        ImageIcon pfp = null;
        frame = new JFrame();

        frame.setTitle("UDC Helper");
        frame.setIconImage(image.getImage());
        frame.setBounds(400, 200, 500, 500);
        frame.getContentPane().setBackground(new Color(240, 248, 255));
        frame.getContentPane().setLayout(null);

        image = resize(image);

        String namepfp = randompfp();

        pfp = new ImageIcon(namepfp);
        pfp = resize(pfp);

        JLabel labelpfp = new JLabel("Could not locate file");
//		labelpfp.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				ImageIcon pfp1 = null;
//				
//				String namepfp = randompfp();
//				
//				pfp1 = new ImageIcon(namepfp);
//				pfp1 = resize(pfp1);
//				labelpfp.setIcon(pfp1);
//				
//				
//				
//			}
//		});
        labelpfp.setIcon(pfp);
        labelpfp.setBounds(152, 61, 180, 180);
        frame.getContentPane().add(labelpfp);

        String name = "Yo";

        textField = new JTextField();

        textField.setBounds(168, 365, 148, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        name = textField.getText();

        lblNewLabel = new JLabel("Please type your name:");
        lblNewLabel.setBounds(41, 325, 154, 19);
        frame.getContentPane().add(lblNewLabel);

        JButton btnNewButton = new JButton("Generate New");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon pfp1 = null;

                String namepfp = randompfp();

                pfp1 = new ImageIcon(namepfp);
                pfp1 = resize(pfp1);
                labelpfp.setIcon(pfp1);
            }
        });
        btnNewButton.setBounds(69, 271, 148, 23);
        frame.getContentPane().add(btnNewButton);

        btnNewButton_1 = new JButton("Upload a picture");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.showOpenDialog(null);
                File f = chooser.getSelectedFile();
                String filename = f.getAbsolutePath();
                ImageIcon icon = new ImageIcon(filename);
                icon = resize(icon);

                File file = new File("user/pfp.txt");
                FileWriter fw = null;
                try {
                    fw = new FileWriter(file);
                } catch (IOException e1) {

                    e1.printStackTrace();
                }
                PrintWriter pw = new PrintWriter(fw);
                pw.println(filename);
                pw.close();
                System.out.print(filename);

                labelpfp.setIcon(icon);
            }
        });
        btnNewButton_1.setBounds(259, 271, 148, 23);
        frame.getContentPane().add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Next");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_2.setBounds(385, 427, 89, 23);
        frame.getContentPane().add(btnNewButton_2);

        JLabel lblNewLabel_2 = new JLabel("Choose your profile picture");
        lblNewLabel_2.setBounds(64, 26, 219, 14);
        frame.getContentPane().add(lblNewLabel_2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private String randompfp() {
        Random ram = new Random();
        String name;
        int num = 9 + ram.nextInt(10);

        name = "pfp/" + num + ".jpg/";

        return name;

    }

    private ImageIcon resize(ImageIcon image) {
        Image test = image.getImage();

        Image rescaled = test.getScaledInstance(180, 180, Image.SCALE_SMOOTH);

        image = new ImageIcon(rescaled);

        return image;
    }
}
