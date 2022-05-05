public class MyClass
{
	int num;
	static int a=143;
	MyClass(int num)
	{
		this.num=num;
	}
	public static void main(String args[])
	{
		MyClass m1=new MyClass(1432);
		MyClass m2=new MyClass(14322);
		
		System.out.println(m1.num);
		System.out.println(MyClass.a);
		System.out.println(m2.num);
		System.out.println(MyClass.a);
		
	}
}