
public class test_p11
{
  public static void main(String[] args)
  {
	Car41 car1;
	car1 = new Car41();
	
	car1.num = 1234;
	car1.gas = 20.5;
	
	car1.show();
	car1.show();
  }
}

//Car���O
class Car41
{
  int num;
  double gas;
  
  void show()
  {
	System.out.println("�����O"+ num);
	System.out.println("�T�o�q�O"+ gas);
  }
}