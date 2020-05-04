/* Report4_2
 * 
 * 	2. 다음과 같은 GUI 모양을 가진 스윙 프레임을 작성하라 
 * 10개의 ‘*’ 문자는 10개의 JLabel을 이용하여 랜덤한 위치에 출력한다. 
 * 
 * 
 * 
 *  작성일 :2019년 5월 29일
 *  작성자: 양명철
 */
import java.awt.*;
import javax.swing.*;

// NorthPanel은 Jpanel을 extends
class NorthPanel extends JPanel{
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY); // 배경색은 회색
		add(new JButton("열기")); // Jbutton으로 열기, 닫기, 나가기 구현
		add(new JButton("닫기"));
		add(new JButton("나가기"));
		setLayout(new FlowLayout());
	}
}

// CenterPanel은 Jpanel을 extends
class CenterPanel extends JPanel{
	public CenterPanel() {
		setBackground(Color.WHITE); //White 설정
		setLayout(null);
		for(int i=0; i<10; i++) {
			JLabel la = new JLabel("*");
			la.setSize(20,20); // Size
			la.setForeground(Color.RED); //색깔 빨강
			la.setLocation((int)(Math.random()*200+10), (int)(Math.random()*200+100)); // 랜덤한 위치
			
			add(la);
		}
	}
	
}

// SouthPanel은 Jpanel을 extends
class SouthPanel extends JPanel{
	public SouthPanel() {
		setBackground(Color.YELLOW);	// 배경색은 노랑	
		add(new JLabel("Word Input")); // JLabel로 Word INput
		add(new JTextField(16));		// JTextField는 16
		setLayout(new FlowLayout());

	}
}

// GUI_SWING 클래스는 JFrame을 extends
public class GUI_SWING extends JFrame{
	public GUI_SWING() {
		setTitle("여러 개의 패널을 가진 프레임"); // 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.add(new NorthPanel(), BorderLayout.NORTH); //NORTH
		c.add(new CenterPanel(), BorderLayout.CENTER); //CENTER
		c.add(new SouthPanel(), BorderLayout.SOUTH); // SOUTH
		
		setSize(300,300); // 사이즈
		setVisible(true); // Visible

	}
	
	public static void main(String[] arges) {
		new GUI_SWING();
	}

}
