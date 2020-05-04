/* Report3_3
 * 
 * 	도시 이름, 위도, 경도 정보를 가진 Location 클래스를 작성하고, 도시이름을 ‘키’로 하는 HashMap<String,Location> 켈랙션을 만드시오. 사용자로부터 입력 받아 4개의 도시를 아래 실행 결과를 참고하여 실행하라. 그리고 도시의 이름으로 검색하는 프로그램을 작성하라. 
 *  실행결과:
 *  도시, 경도, 위도를 입력하세요.
 *  >> 서울, 37, 126
 *  >> LA, 34, -118
 *  >> 파리, 2, 48
 *  >> 시드니, 151, -33
 *  
 *  해시맵에 있는 모든 도시를 출력합니다.
 *  서울, 37, 126
 *  LA, 34, -118
 *  파리, 2, 48
 *  시드니, 151, -33
 *  
 *  도시를 검색합니다.
 *  도시이름 >> 부산
 *  부산 없습니다. 
 *  도시이름 >> 파리
 *  파리 2 48
 *  도시이름 >> 종료
 *  검색을 종료합니다.
 *  
 *  작성일 :2019년 5월 12일
 *  작성자: 양명철
 */
import java.util.*;

// 도시 이름, 위도, 경도 정보를 가진 Location 클래스
class Location {
	private String city; // 도시 이름
	private double longitude; // 경도
	private double latitude; // 위도
	
	public Location(String city, double longitude, double latitude) { // 도시 , 경도, 위도 설정
		this.city = city;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public void setCity(String city) {  // 도시 설정
		this.city = city;
	}
	public String getCity() { // 도시 반환
		return city;
	}
	public void setLogitude(double longitude) { // 경도 설정
		this.longitude = longitude;
	}
	public double getLongitude() { // 경도 반환
		return longitude;
	}
	public void setLatitude(double latitude) { // 위도 설정
		this.latitude = latitude;
	}
	public double getLatitude() { // 위도 반환
		return latitude;
	}
}



public class LocationManager {
	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Location> dept = new HashMap<String, Location>(); //HashMap<String,Location> 켈랙션
	
	// 정보 입력
	private void read() {
		System.out.println("도시,경도,위도를 입력하세요.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ","); // ','로 토큰화
			String city = st.nextToken().trim();
			double longitude = Double.parseDouble(st.nextToken().trim());
			double latitude = Double.parseDouble(st.nextToken().trim());
			
			Location loc = new Location(city, longitude, latitude); // 도시, 경도
			dept.put(city, loc); //해시맵에 저장
		}			
	}
	
	// 출력
	private void printAll() {
		Set<String> key = dept.keySet();
		Iterator<String> it = key.iterator();
		System.out.println();		
		System.out.println("해시맵에 있는 모든 도시를 출력합니다.");
		while (it.hasNext()) {
			String city = it.next(); // 도시 이름 알아냄
			Location loc = dept.get(city); // 도시 이름을 키로하여 해시맵에서 Locaiton 객체 얻어냄

			System.out.print(loc.getCity() + "\t");
			System.out.print(loc.getLongitude() + "\t");
			System.out.println(loc.getLatitude()+ "\t");
		}
		System.out.println();		
	}
	
	// 검색
	private void processQuery() {
		System.out.println("도시를 검색합니다.");
		while(true) {
			System.out.print("도시이름 >> ");
			String city = scanner.nextLine(); // 도시 이름 입력
			
			if(city.equals("종료")) {
				System.out.println("검색을 종료합니다.");
				return;
			}

			Location loc = dept.get(city); // 해시맵에서 도시를 키로 검색
			if(loc == null) { // 도시가 해시맵에 없다면
				System.out.println(city + " 없습니다.");
			}
			else { // 해시맵에서 검색된  객체
				System.out.print(loc.getCity()  + "\t");
				System.out.print(loc.getLongitude() + "\t");
				System.out.println(loc.getLatitude());
			}
		}
	}
	
	// 실행
	public void run() {
		read();
		printAll();
		processQuery();
	}
	
	// 메인 함수
	public static void main (String[] args) {
		LocationManager man = new LocationManager();
		man.run();
	}
}

