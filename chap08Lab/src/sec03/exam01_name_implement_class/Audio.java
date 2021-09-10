package sec03.exam01_name_implement_class;

import sec02.exam_interface_declaration.RemoteControl;

//Television ���� Ŭ����
public class Audio implements RemoteControl {
	//�ʵ�
	private int volume;
	//������
	
	//�żҵ�
	
	@Override
	public void turnOn() {
		System.out.println("������� �մϴ�.");

	}

	@Override
	public void turnOff() {
		System.out.println("������� ���ϴ�.");

	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� ����� ����: "+volume);
	}

}
