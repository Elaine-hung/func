package func;

public class People {
//static都不需要物件,也無法用物件的屬性
	//定義常數表示過重 (定義表示數值不會變 所以就用static去改善記憶體空間的浪費
	static double overWeightBMI=24.0;
	
	public static double BMI(double h,double w){//不會使用到double height weight
		return w/ (h*h);
		
		
	}
	
	
//下方都是物件屬性跟方法,都需要new才能使用	
	double height;
	double weight;
	public double getBMI() {
//		double BMI =weight /(height *height);
		double BMI =People.BMI(height,weight);//可以呼叫上面的double h,w跟計算式 因為物件可以用靜態方法 但靜態方法不能用物件的值
		return BMI;
		
	}
	
	
	

}
