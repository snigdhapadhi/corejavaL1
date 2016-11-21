
class Trainee extends Assignment15
{
	double egpa;
	public Trainee(int empId,String ename,int eday,int emonth,int eyear,double sal,double gpa)
	{
		super(empId,ename,eday,emonth,eyear,sal);
		egpa=gpa;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Employee GPA :"+egpa);
	}

}

public class Assignment16
{
	public static void main(String[] args)
	{
		Person personReference;
		System.out.println("---------Employee Details-------");
		Assignment15 newEmployee=new Assignment15(328094,"snigdha",16,03,2015,84000);
		personReference=newEmployee;
		personReference.displayDetails();
		System.out.println("---------Trainee Details--------");
		Trainee tra=new Trainee(122,"Xyz",21,05,2014,43232,8.12);
		personReference=tra;
		personReference.displayDetails();
		
		
	}
}
