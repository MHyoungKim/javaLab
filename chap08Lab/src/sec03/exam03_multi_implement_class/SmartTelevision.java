package sec03.exam03_multi_implement_class;

//���� �������̽� ���� Ŭ����
public class SmartTelevision implements RemoteControl, Searchable {

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url+"�� �˻��մϴ�.");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println(volume+"������ �����մϴ�.");
	}
	
}
