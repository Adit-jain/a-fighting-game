package game1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import game1.display.display;
import game1.gfx.Assets;
class front implements ActionListener
{

    JLabel lab,sac;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JFrame frame;
    
     front()
    {
        frame = new JFrame("AKD presents");
        frame.setBounds(0,0,1000,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        Font f = new Font("ARIAL", Font.ITALIC,20);

        Container c =frame.getContentPane();
        c.setBackground(Color.DARK_GRAY);
        c.setLayout(null);

        ImageIcon start = new ImageIcon("res\\textures\\start.png");
        ImageIcon quit = new ImageIcon("res\\textures\\quit.png");
        ImageIcon front = new ImageIcon("res\\textures\\front2.jpg");
        ImageIcon settings = new ImageIcon("res\\textures\\settings.jpg");
        
        
        btn1 = new JButton(start);
        btn1.setBounds(0, 10,start.getIconWidth(),start.getIconHeight());
        
        
        btn2 = new JButton(quit);
        btn2.setBounds(0, 372,quit.getIconWidth(),quit.getIconHeight());

        btn3 = new JButton(settings);
        btn3.setBounds(0, 190,settings.getIconWidth(),settings.getIconHeight());
        
       
        JLabel pic = new JLabel(front);
        pic.setBounds(200, 0, front.getIconWidth(), front.getIconHeight());

        
        JLabel sac = new JLabel("");
        
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
       

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
       
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
        else if(ac.getSource()==btn2)
        {
        	frame.dispose();
        }
        else
        {
        
        }
    }

}