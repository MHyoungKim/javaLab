package verify;

public class ArrayEx {

	public static void main(String[] args) {
		int[][] s = new int[8][9]; // 8�� 9��
		// ������ ���η� ���ٷ� ���
		for (int dan = 0; dan <= 7; dan++) { // ��
		System.out.println("[" + (dan + 2) + "��]");
		for (int i = 0; i <= 8; i++) { // ��
		s[dan][i] = (dan + 2) * (i + 1);
		System.out.println((dan + 2) + "*" + (i + 1) + "=" + s[dan][i]);
		}
		System.out.println("");
		}
		// Ȯ�� for���� �̿�
		System.out.println("*** ���� for���� �̿� ***");
		int dan = 2;
		int num;
		for (int[] i: s) {
		System.out.println("[" + dan + "��]");
		num = 1;
		 // �ۼ� ��ġ
		for(int j : i ) {  //i���� ���� �����ͼ� j�� ��´� 
			System.out.println(dan+"*"+num+"="+j);
			num++;
		}
		System.out.println("");
		dan++;
		}

	}/// main

}/// class
