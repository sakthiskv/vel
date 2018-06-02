import java.util.Scanner;
public class Mainclass {
	public  static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Studentdetails stu=new Studentdetails();
		
		System.out.println("Enter no of Student");
		int i=sc.nextInt();
		int a[]=new int[i];
		for(int g=0;g<a.length;i++)
		{
		stu.setId(sc.nextInt());
		stu.setFname(sc.next());
		stu.setLname(sc.next());
		stu.setGender(sc.next());
		stu.setBranch(sc.next());
		stu.setDept(sc.next());
		}
	System.out.println(stu.toString());
}
	
}