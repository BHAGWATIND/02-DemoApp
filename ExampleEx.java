class MyException extends Exception{

	MyException(String s){
		super(s);
}
}

//
public class ExampleEx{
	public static void main(String [] ar)throws MyException{

		int b= Integer.parseInt(ar[0]); 
			if(b<12 || b>12){
				 			throw new MyException(" ERROR .................");
			}
			
			else{
				System.out.println("Welcome");
	//			throw new MyException("eeeee");
			}

		}
	
	}


