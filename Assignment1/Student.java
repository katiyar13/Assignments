import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {69,78,97};
		int b[]= {54,87,43};
		int c[]= {34,65,89};
		int s=a[0]+b[0]+c[0];
		int o=a[1]+b[1]+c[1];
		int p=a[2]+b[2]+c[2];
		System.out.println("Total scored in each subject is A:"+s+" B:"+o+" C:"+p);
		System.out.println("Average scored in each subject is A:"+(s/3)+" B:"+(o/3)+" C:"+(p/3));
		int x=a[0]+a[1]+a[2];
		int y=b[0]+b[1]+b[2];
		int z=c[0]+c[1]+c[2];
		System.out.println("Total scored in all subject is:"+x+" "+y+" "+z);
		System.out.println("Average scored in all subject is:"+(x/3)+" "+(y/3)+" "+(z/3));
	}

}
