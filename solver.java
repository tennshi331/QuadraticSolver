package hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadraticEquationContinue {

	public static void main(String[] args) {
		try {
			//繰り返しする。
			while(true) {
				System.out.println("二次方程式を解きます。変数a,b,cを入力してください。");
				BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
				//入力させる
				String line = reader.readLine();
				//まずは、入力が正しいものか判定
				if(line == "quit") {
					System.out.println("またよろしくね！");
					break;
				}
				//ここからが本番
				else { 
					//まずは入力された文字を配列に格納する。
					String colum[] = line.split(",");
					//String型からdouble型への変換
			        double a = Double.parseDouble(colum[0]);
			        double b = Double.parseDouble(colum[1]);
			        double c = Double.parseDouble(colum[2]);
			        
					}
			}
		}
		catch(IOException e) { 
			System.out.println(e);  
			}
		catch(NumberFormatException e) {
		System.out.println("すみません。数字でないと、理解できません。");
		}
	}

}
