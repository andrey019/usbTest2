import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class form1 {
    private JButton button1;
    private JPanel panel1;
    private JTextField textField1;
    private JButton button2;
    private JButton button3;
    private JButton radioButton;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JRadioButton radioButton5;
    private JRadioButton radioButton6;
    private ButtonGroup buttonGroup;
    private JTextArea textArea1;
    private JPanel panelRadio;
    private JPanel panelText;

    public form1() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("aaaaaa");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //textArea1.setText("fuck you!\r\n");
                textArea1.append("fuck you!\r\n");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (panelRadio.isVisible()) {
                    panelRadio.setVisible(false);
                } else {
                    panelRadio.setVisible(true);
                }
            }
        });
        radioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (buttonGroup.getSelection() == null) {
                    textArea1.append("not selected!\r\n");
                } else {
                    textArea1.append(buttonGroup.getSelection().getActionCommand() + "\r\n");
                }
            }
        });
    }


    //    public static void main(String[] args) {
//        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                JFrame frame = new JFrame("frame");
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.pack();
//                frame.setVisible(true);
//                frame.setSize(300, 200);
//
//            }
//        });
//    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("form1");
        form1 form1 = new form1();
        frame.setContentPane(form1.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(700, 500));
        frame.pack();
        frame.setLocationByPlatform(false);
        centerFrame(frame);

        groupRadio(form1);


        frame.setResizable(false);
        frame.setVisible(true);
    }

    private static void groupRadio(form1 form) {
        form.buttonGroup = new ButtonGroup();
        form.radioButton1.setActionCommand("radio1");
        form.radioButton2.setActionCommand("radio2");
        form.radioButton3.setActionCommand("radio3");
        form.radioButton4.setActionCommand("radio4");
        form.radioButton5.setActionCommand("radio5");
        form.radioButton6.setActionCommand("radio6");
        form.buttonGroup.add(form.radioButton1);
        form.buttonGroup.add(form.radioButton2);
        form.buttonGroup.add(form.radioButton3);
        form.buttonGroup.add(form.radioButton4);
        form.buttonGroup.add(form.radioButton5);
        form.buttonGroup.add(form.radioButton6);
    }

    private static void centerFrame(JFrame frame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = frame.getSize();
        if(frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if(frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        frame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
    }
}
