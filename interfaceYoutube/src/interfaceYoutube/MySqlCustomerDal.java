package interfaceYoutube;

public class MySqlCustomerDal implements ICustomerDal{
	@Override
	public void add() {
		System.out.println("MySql eklendi");
	}

}


/*
public class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal, IRepository{
//this showing for syntax
@Override
public void add() {
	System.out.println("MySql eklendi");
}

}
*/