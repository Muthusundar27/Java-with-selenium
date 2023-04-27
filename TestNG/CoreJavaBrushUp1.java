package Demo.FirstTestNG;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Rahul Shetty Academy";

		String[] splittedString = s.split("Shetty");
		

		System.out.println(splittedString[0]);

		System.out.println(splittedString[1]);
		
		for(int i = s.length()-1; i>=0; i--) 
		{
			System.out.println(s.charAt(i));
		}
	}

}
