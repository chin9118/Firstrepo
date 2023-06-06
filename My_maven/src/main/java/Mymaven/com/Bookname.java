package Mymaven.com;

public class Bookname extends Book{

	void show2()
	{
		System.out.println("second class");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bookname obj=new Bookname();
		obj.show2();
		obj.show();
	}

}
