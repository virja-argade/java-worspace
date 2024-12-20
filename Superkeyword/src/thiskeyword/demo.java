package thiskeyword ;
public class demo {
		int a;
		demo(int a)
		{
			this.a=a;
		}
		
		void show()
		{
			System.out.println(a);
		}
		
		public static void main(String args[])
		{
			demo r=new demo(150);
			
			r.show();
		}
		

	}
	

	public class demo2 {
		
		demo2()
		{
			System.out.println("default constroctor");
		}
		demo2(int a)
		{
			this();
			System.out.println(a);
		}
		public static void main(String args[])
		{
			demo2 a=new demo2(100);
			
		}

	}

