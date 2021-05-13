package func;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.IntArrayData;

public class TestFunc {

	public static void main(String[] args) {
		
		add1(1,1);//void不會有回傳值 所以不能用變數
		int sum= add(1, 1);//呼叫方法  return回來這行往下執行
		System.out.println(sum);

	}

	
	//             2  =   1     + 1
	//void:表示這個方法沒有回傳，單純只是執行方法內的程式
	public static void add1(int a ,int b) {//用static是因為上面也是這樣才可以用上面靜態方法的數值 看講義156
		int c =a +b;//c=1+1
		System.out.println(("c="+c));
		//return c;  //直接執行不會回傳
		
		
	
	}
	public static int add(int a ,int b) {
		int sum =a +b;//c=1+1
		//System.out.println(("c="+sum));//不用印
		return sum;  //在上面的方法回傳
		


}
}

