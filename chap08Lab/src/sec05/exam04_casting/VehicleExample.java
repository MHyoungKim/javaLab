package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();  //Bus 구현 객체, 자동형변환
		
		vehicle.run();
		// Vehicle.CheckFare(); 참조영역의 축소로 사용불가
		
		Bus bus = (Bus) vehicle;  //강제형변환
		bus.run();
		bus.CheckFare(); //참조영역의 확대로 사용 가능
	}

}
