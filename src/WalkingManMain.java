import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class WalkingManMain extends JFrame
{

	public WalkingManMain()
	{
		setTitle("Walking Man");
		setBounds(100, 100, 300, 500);
		setLayout(null);
		
		WalkingMan man = new WalkingMan();
		man.setLocation(10, 10);
		add(man);
		
		addKeyListener(new KeyListener()
				{
					public void keyPressed(KeyEvent e)
					{
						if(e.getKeyCode() == KeyEvent.VK_RIGHT)
						{
							man.setLocation(man.getX()+1, man.getY());
						}
						else if(e.getKeyCode() == KeyEvent.VK_LEFT)
						{
							man.setLocation(man.getX()-1, man.getY());
						}
						else if(e.getKeyCode() == KeyEvent.VK_UP)
						{
							man.setLocation(man.getX(), man.getY()-1);
						}
						else if(e.getKeyCode() == KeyEvent.VK_DOWN)
						{
							man.setLocation(man.getX(), man.getY()+1);
						}
					}
					
					public void keyTyped(KeyEvent e) 
					{
					
					}
					
					public void keyReleased(KeyEvent e)
					{
						
					}
					
				});
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) 
	{
		new WalkingManMain();
	}

}
