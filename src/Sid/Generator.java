package Sid;

import java.util.ArrayList;
import java.util.Random;

public class Generator {
	private boolean typeGeneration; //тут у нас значение которое определяет тип генератора 
	public ArrayList<Integer> intList;
	public ArrayList<String> stringList;
	public Random random;
	
	public int n = 7;
	public int k = 5;
	//Handler1 handler1 ;
	public int getN() {
		return n;
	}

	public Generator(boolean typeGeneration) {	//Конструктор true - Int ; false - String
		this.typeGeneration = typeGeneration; //присваеваем глобальной переменной typeGeneration значение из локальной typeGeneration
		if(typeGeneration) intList = new ArrayList<Integer>();
		else stringList = new ArrayList<String>();
		random = new Random();
	}
	
	public void Gen (int n) {
		if(typeGeneration) {
			if(n > 0) {    
				for(int i = 0; i < n; i++) {
					intList.add(random.nextInt(101)); 
					System.out.println(intList.get(i));
				}
			}
			else {
				System.out.println("Ошибка");
			}
		}
		else {
			//Генератор для строк
			if(n > 0) {
				String str;
				String str1;
				int n1;
				int n2;
				for(int i = 0; i < n; i++) { // генирируем число cлов
					n2 = random.nextInt(3)+1;
					str1 = "";
					for(int l = 0; l < n2; l++) {		
						str = "";
						n1 = random.nextInt(10) + 1; // генерируем число символов в слове(до 10)
						for(int k = 0; k < n1; k++) {
							int a = random.nextInt(26) + 97; // генерируем символ
							char b = (char) a; 
							str = str + b;
						}
						str1 = str1 + " " + str;
					}
					str1 = str1.substring(1);
					stringList.add(str1);
				}
			}
			else {
				System.out.println("Ошибка");
			}
		}
	}

	public void Start() {
		for (int i=0; i < n/k; i++) {
			Thread th = new Thread(new Handler(i,k,new Handler1()));
			th.setName("name"+i);
			th.start();
		}
	}
	public ArrayList<Integer> getIntList() {
		return intList;
	}

	public ArrayList<String> getStringList() {
		return stringList;
	}
}

