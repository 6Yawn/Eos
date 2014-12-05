/*
 * Created by JFormDesigner on Fri Dec 05 04:49:14 EST 2014
 */

package me.yawn.eos.ui;

import oracle.jrockit.jfr.JFR;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author yawn
 */
public class Window extends JFrame {
    public Window(final String TITLE) {
        initComponents();
        setTitle(TITLE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(555,390));
    }

    public JScrollPane getScrollPane1() {
        return scrollPane1;
    }

    public static JTextArea getTextArea1(){
        return textArea1;
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public JButton getButton3() {
        return button3;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    private void initComponents() {
        textArea1 = new JTextArea();
        scrollPane1 = new JScrollPane(textArea1);
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        textField1 = new JTextField();

        setVisible(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(8, 5, 525, 310);


        button1.setText("Attack");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(10, 320), button1.getPreferredSize()));


        button2.setText("Block");
        contentPane.add(button2);
        button2.setBounds(85, 320, 67, 25);


        button3.setText("Enter Command");
        contentPane.add(button3);
        button3.setBounds(160, 320, 125, 25);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setEditable(true);
                button3.setEnabled(false);
            }
        });

        contentPane.add(textField1);
        textField1.setBounds(290, 320, 240, 25);
        textField1.setEditable(false);
        textField1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    print(ChatIdentifier.PLAYER,textField1.getText());
                    textField1.setText("");
                    textField1.setEditable(false);
                    button3.setEnabled(true);
                }
            }
        });

        {
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        setLocationRelativeTo(getOwner());
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Your Moms
    private JScrollPane scrollPane1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JTextField textField1;
    private static JTextArea textArea1;

    public void print(ChatIdentifier identifier, String message){
       getTextArea1().append("[" + identifier.name() + "]: " + message + "\n");
    }

    public static enum ChatIdentifier {
        GAME, PLAYER, ENTITY
    }
}
