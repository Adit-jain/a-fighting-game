package game1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import game1.display.display;
class front implements ActionListener
{

    JLabel lab,sac;
    JButton btn1;
    JButton btn2;
    JFrame frame;
    
     front()
    {
        frame = new JFrame("StartWindow");
        frame.setBounds(100,100,1000,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        Font f = new Font("ARIAL", Font.ITALIC,20);

        Container c =frame.getContentPane();
        c.setBackground(Color.DARK_GRAY);
        c.setLayout(null);

        ImageIcon start = new ImageIcon("src\\game1\\start1.jpg");
        ImageIcon quit = new ImageIcon("src\\game1\\quit1.jpg");
        ImageIcon front = new ImageIcon("src\\game1\\front.jpeg");

        btn1 = new JButton(start);
        btn1.setBounds(800, 450,start.getIconWidth(),start.getIconHeight());
        
        
        btn2 = new JButton(quit);
        btn2.setBounds(1000, 450,quit.getIconWidth(),quit.getIconHeight());

        JLabel pic = new JLabel(front);
        pic.setBounds(800, 100, front.getIconWidth(), front.getIconHeight());

        
        JLabel sac = new JLabel("");
        
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        c.add(btn1);
        c.add(btn2);
        c.add(pic);
        c.add(sac);

        lab = new JLabel("");
        lab.setBounds(300, 50, 200, 40);
        c.add(lab);

        sac = new JLabel("");
        sac.setBounds(300, 50, 200, 40);
        c.add(sac);

        
    }

    public void actionPerformed(ActionEvent ac)
    {
        if(ac.getSource()==btn1)
        {
        	game ob=new game("Title!",1920,1080);
    		ob.start();
        
        frame.dispose();
        }
        else
        frame.dispose();


    }

}