package verify.exam04;

//DAO(Data Access Object): java class -> db(Oracle DB, MySQL)
public interface DataAccessObject {
	//�������̽� �������
	//���
	//�߻�޼ҵ�
	public abstract void select();
	public abstract void insert();
	public abstract void update();
	public abstract void delete();
	//����Ʈ �޼ҵ�
	//���� �޼ҵ�
}
