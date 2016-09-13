import java.text.NumberFormat;
import java.util.Random;

public class NumberUtil {
	
	
	public static String percentage(double num){
		return NumberFormat.getPercentInstance().format(num);
	}
	
	public static String currency(double num){
		return NumberFormat.getCurrencyInstance().format(num);
	}
	
	public static String percentage(double num, int pl){
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(pl);
		return number.format(num);
	}
	
	public int random(int min,int max){
		return new Random().nextInt((max - min) + 1) + min;
	}
	
	public int max(int a, int b){
		return Math.max(a, b);
	}
	
	public int min(int a, int b){
		return Math.min(a, b);		
	}
}
