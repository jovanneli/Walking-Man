import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class WalkingMan extends JComponent
{
	private Rectangle arms, body, body2, leftLeg, rightLeg;
	private Ellipse2D.Double head;
	
	public WalkingMan()
	{
		head = new Ellipse2D.Double(12, 0, 15, 15);
		arms = new Rectangle(0, 15, 40, 10);
		body = new Rectangle(15, 25, 10, 20);
		body2 = new Rectangle(5, 45, 30, 10);
		leftLeg = new Rectangle(5, 55, 10, 15);
		rightLeg = new Rectangle(25, 55, 10, 15);
		this.setSize(41, 86);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.GREEN);
		g2.fill(head);
		g2.fill(arms);
		g2.fill(body);
		g2.fill(body2);
		g2.fill(leftLeg);
		g2.fill(rightLeg);
	}
}
