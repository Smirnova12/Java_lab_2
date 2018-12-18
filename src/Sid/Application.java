package Sid;
import java.util.ArrayList;
public class Application {
	public static void main(String[] args) {
		Generator random1 = new Generator(true);
		Handler1 random2= new Handler1();
		random1.Gen(random1.getN());
		random1.Start();
		
	}
} 
