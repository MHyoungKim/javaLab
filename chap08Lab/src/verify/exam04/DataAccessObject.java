package verify.exam04;

//DAO(Data Access Object): java class -> db(Oracle DB, MySQL)
public interface DataAccessObject {
	//인터페이스 구성멤버
	//상수
	//추상메소드
	public abstract void select();
	public abstract void insert();
	public abstract void update();
	public abstract void delete();
	//디폴트 메소드
	//정적 메소드
}
