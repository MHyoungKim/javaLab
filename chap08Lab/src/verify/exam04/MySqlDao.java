package verify.exam04;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MYsql DB���� �˻�");
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("MYsql DB�� ����");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("MYsql DB�� ����");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("MYsql DB���� ����");
	}

}
