package func;

public class TestPeople {

	public static void main(String[] args) {
		People p=new People();//32 每new一次就會有一個記憶體位置出來
		p.height=1.7;
		p.weight=70;
		System.out.printf("BMI=%.2f\r\n",p.getBMI());//format 格式化
		System.out.println("過重的BMI="+People.overWeightBMI);//不需要去new物件 只需要: 類別名稱 . 屬性
		//建議不要用p.overWeightBMI 因為靜態就用靜態若用物件會讓閱讀上混亂
//		double bmi=People.BMI(1.7, 70);
//		System.out.println("Static BMI="+bmi);
		System.out.println("Static BMI="+People.BMI(1.7, 70));
		
		System.out.println(Math.pow(2,5));//pow會出現綠色跟s代表可以直接透過參數帶入不需要物件
		//String static method
		System.out.println(String.join("-", "a","b","Hello","World"));
		

		
	}

}
