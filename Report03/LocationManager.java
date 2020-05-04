/* Report3_3
 * 
 * 	���� �̸�, ����, �浵 ������ ���� Location Ŭ������ �ۼ��ϰ�, �����̸��� ��Ű���� �ϴ� HashMap<String,Location> �̷����� ����ÿ�. ����ڷκ��� �Է� �޾� 4���� ���ø� �Ʒ� ���� ����� �����Ͽ� �����϶�. �׸��� ������ �̸����� �˻��ϴ� ���α׷��� �ۼ��϶�. 
 *  ������:
 *  ����, �浵, ������ �Է��ϼ���.
 *  >> ����, 37, 126
 *  >> LA, 34, -118
 *  >> �ĸ�, 2, 48
 *  >> �õ��, 151, -33
 *  
 *  �ؽøʿ� �ִ� ��� ���ø� ����մϴ�.
 *  ����, 37, 126
 *  LA, 34, -118
 *  �ĸ�, 2, 48
 *  �õ��, 151, -33
 *  
 *  ���ø� �˻��մϴ�.
 *  �����̸� >> �λ�
 *  �λ� �����ϴ�. 
 *  �����̸� >> �ĸ�
 *  �ĸ� 2 48
 *  �����̸� >> ����
 *  �˻��� �����մϴ�.
 *  
 *  �ۼ��� :2019�� 5�� 12��
 *  �ۼ���: ���ö
 */
import java.util.*;

// ���� �̸�, ����, �浵 ������ ���� Location Ŭ����
class Location {
	private String city; // ���� �̸�
	private double longitude; // �浵
	private double latitude; // ����
	
	public Location(String city, double longitude, double latitude) { // ���� , �浵, ���� ����
		this.city = city;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public void setCity(String city) {  // ���� ����
		this.city = city;
	}
	public String getCity() { // ���� ��ȯ
		return city;
	}
	public void setLogitude(double longitude) { // �浵 ����
		this.longitude = longitude;
	}
	public double getLongitude() { // �浵 ��ȯ
		return longitude;
	}
	public void setLatitude(double latitude) { // ���� ����
		this.latitude = latitude;
	}
	public double getLatitude() { // ���� ��ȯ
		return latitude;
	}
}



public class LocationManager {
	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Location> dept = new HashMap<String, Location>(); //HashMap<String,Location> �̷���
	
	// ���� �Է�
	private void read() {
		System.out.println("����,�浵,������ �Է��ϼ���.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ","); // ','�� ��ūȭ
			String city = st.nextToken().trim();
			double longitude = Double.parseDouble(st.nextToken().trim());
			double latitude = Double.parseDouble(st.nextToken().trim());
			
			Location loc = new Location(city, longitude, latitude); // ����, �浵
			dept.put(city, loc); //�ؽøʿ� ����
		}			
	}
	
	// ���
	private void printAll() {
		Set<String> key = dept.keySet();
		Iterator<String> it = key.iterator();
		System.out.println();		
		System.out.println("�ؽøʿ� �ִ� ��� ���ø� ����մϴ�.");
		while (it.hasNext()) {
			String city = it.next(); // ���� �̸� �˾Ƴ�
			Location loc = dept.get(city); // ���� �̸��� Ű���Ͽ� �ؽøʿ��� Locaiton ��ü ��

			System.out.print(loc.getCity() + "\t");
			System.out.print(loc.getLongitude() + "\t");
			System.out.println(loc.getLatitude()+ "\t");
		}
		System.out.println();		
	}
	
	// �˻�
	private void processQuery() {
		System.out.println("���ø� �˻��մϴ�.");
		while(true) {
			System.out.print("�����̸� >> ");
			String city = scanner.nextLine(); // ���� �̸� �Է�
			
			if(city.equals("����")) {
				System.out.println("�˻��� �����մϴ�.");
				return;
			}

			Location loc = dept.get(city); // �ؽøʿ��� ���ø� Ű�� �˻�
			if(loc == null) { // ���ð� �ؽøʿ� ���ٸ�
				System.out.println(city + " �����ϴ�.");
			}
			else { // �ؽøʿ��� �˻���  ��ü
				System.out.print(loc.getCity()  + "\t");
				System.out.print(loc.getLongitude() + "\t");
				System.out.println(loc.getLatitude());
			}
		}
	}
	
	// ����
	public void run() {
		read();
		printAll();
		processQuery();
	}
	
	// ���� �Լ�
	public static void main (String[] args) {
		LocationManager man = new LocationManager();
		man.run();
	}
}

