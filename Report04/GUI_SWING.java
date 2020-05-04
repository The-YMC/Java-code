/* Report4_2
 * 
 * 	2. ������ ���� GUI ����� ���� ���� �������� �ۼ��϶� 
 * 10���� ��*�� ���ڴ� 10���� JLabel�� �̿��Ͽ� ������ ��ġ�� ����Ѵ�. 
 * 
 * 
 * 
 *  �ۼ��� :2019�� 5�� 29��
 *  �ۼ���: ���ö
 */
import java.awt.*;
import javax.swing.*;

// NorthPanel�� Jpanel�� extends
class NorthPanel extends JPanel{
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY); // ������ ȸ��
		add(new JButton("����")); // Jbutton���� ����, �ݱ�, ������ ����
		add(new JButton("�ݱ�"));
		add(new JButton("������"));
		setLayout(new FlowLayout());
	}
}

// CenterPanel�� Jpanel�� extends
class CenterPanel extends JPanel{
	public CenterPanel() {
		setBackground(Color.WHITE); //White ����
		setLayout(null);
		for(int i=0; i<10; i++) {
			JLabel la = new JLabel("*");
			la.setSize(20,20); // Size
			la.setForeground(Color.RED); //���� ����
			la.setLocation((int)(Math.random()*200+10), (int)(Math.random()*200+100)); // ������ ��ġ
			
			add(la);
		}
	}
	
}

// SouthPanel�� Jpanel�� extends
class SouthPanel extends JPanel{
	public SouthPanel() {
		setBackground(Color.YELLOW);	// ������ ���	
		add(new JLabel("Word Input")); // JLabel�� Word INput
		add(new JTextField(16));		// JTextField�� 16
		setLayout(new FlowLayout());

	}
}

// GUI_SWING Ŭ������ JFrame�� extends
public class GUI_SWING extends JFrame{
	public GUI_SWING() {
		setTitle("���� ���� �г��� ���� ������"); // ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.add(new NorthPanel(), BorderLayout.NORTH); //NORTH
		c.add(new CenterPanel(), BorderLayout.CENTER); //CENTER
		c.add(new SouthPanel(), BorderLayout.SOUTH); // SOUTH
		
		setSize(300,300); // ������
		setVisible(true); // Visible

	}
	
	public static void main(String[] arges) {
		new GUI_SWING();
	}

}
