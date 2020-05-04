/* Report4_3
 * 
 * 3. �̺�Ʈó�� ���α׷�: ��C���� ����ϴ� JLabel �� �ϳ� �����, �ʱ� ��ġ�� (100, 100)���� �ϰ�, 
 * ���콺��  ��C���� Ŭ���� ������ �������� ���� ������ ��ġ�� �����̵��� �϶� 
 * 
 * 
 * 
 *  �ۼ��� :2019�� 5�� 29��
 *  �ۼ���: ���ö
 */
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
//Ŭ�� ������ ���� �������α׷��� �ۼ��϶�. 
//JLabel�� �̿��Ͽ� ���ڿ��� "C"�� ���̺��� �ϳ������ �ʱ� ��ġ�� (100,100)���� �϶�.
//���ڿ��� Ŭ���� ������ ���̺��� ������ ���� ������ ��ġ�� �����δ�.
public class JLabel_Event extends JFrame{
    JLabel label; 
    JLabel_Event(){
        setTitle("Ŭ�� ������ �������α׷�"); // ���� ����
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // �ݱ� ��ư�� ������ �� ȭ�� �ݱ�
         
        label= new JLabel("C	");
        label.setSize(100,50);
        label.setLocation(100,100);
        label.addMouseListener(new MyMouseAdapter());
        // JLabel ������Ʈ ���� �� MouseListener�� �ܴ�.
         
        add(label);
        setSize(500,500);
        setVisible(true);
        label.requestFocus();
        // ����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
         
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new JLabel_Event();
    }
     
    class MyMouseAdapter extends MouseAdapter{
        int x,y;
        public void mousePressed(MouseEvent e) {
            x = (int)(Math.random()*400); // ������ ���� ����� ���� 400���� ����
            y = (int)(Math.random()*400); // ������ ���� ����� ���� 400���� ����
            label.setLocation(x,y);
        }
    }
}