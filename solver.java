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
				if(line.equals("quit")) {
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
			        SolveEquation(a,b,c);
					}
			}
		}
		catch(IOException e) {
			System.out.println(e);
			}
	}
	public static void SolveEquation(double a,double b,double c) {
		if(Math.pow(b,2) - 4*a*c > 0){
			double x = (b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / 2*a;
			double y = (b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / 2*a;
			System.out.println("その二次方程式、" + a +"x^2 + " + b +"x + "+ c +" = 0の解は、x = "+ x +"," + y +" の2つだね。");
		} else if(Math.pow(b,2) - 4*a*c == 0){
			double x = (b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / 2*a;
			System.out.println("その二次方程式、" + a +"x^2 " + b +"x "+ c +"= 0の解は、x="+ x +"の1つだね。");
		} else {
			System.out.println("その二次方程式に解はありません。");
		}
	}
}
