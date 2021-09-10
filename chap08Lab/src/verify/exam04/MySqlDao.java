package verify.exam04;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MYsql DB에서 검색");
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("MYsql DB에 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("MYsql DB를 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("MYsql DB에서 삭제");
	}

}
