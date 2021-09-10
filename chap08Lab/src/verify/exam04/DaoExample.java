package verify.exam04;

public class DaoExample {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		//DataAccessObject dao = new OracleDao(); // �ڵ�����ȯ
		dbWork(new OracleDao()); // ������ü
		dbWork(new MySqlDao());
	}

}
