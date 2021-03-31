
public class Calci {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		allop sum=(a,b)->(a+b);
		allop diff=(a,b)->(a-b);
		allop mul=(a,b)->a*b;
		allop div=(a,b)->a/b;
		System.out.println("Addition:"+sum.operation(34, 60));
		System.out.println("Subtraction:"+diff.operation(65, 40));
		System.out.println("Multiply:"+mul.operation(12,50));
		System.out.println("Divide:"+div.operation(40, 12));
	}
}
@FunctionalInterface
interface allop{
	int operation(int a,int b);
}
