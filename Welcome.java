public class Welcome
{
	public static void main(String[] args)
	{
	String greeting = "Welcome to Core Java!";
	System.out.println(greeting);
	for (int i = 0; i < greeting.length(); i++) //length() digunakan untuk menghitung tiap karakter (include spasi) pada sebuah variabel, dalam kasus ini berupa variabel greeting
		System.out.print("=");
	System.out.println();
	}
}