package Tourism;
import java.util.*;
import java.io.*;

public class Kerala
{
	Scanner sc=new Scanner(System.in);
	int option,n,i,option1;
	double sum=0;
	public double ChoosePackage()
	{
		try
		{
		option=0;
		System.out.println("1.Alleppey\n2.Wayanad\n3.Munnar\n4.Vagamon\n5.Cochin\n6.Kovalam\n7.Kumarakom");
		System.out.println("How many places you want to visit : ");
		n=sc.nextInt();
		double [] bill=new double[n];
		for(i=0;i<n;i++)
		{
			option1=option;
			System.out.println("Choose the places you want to visit (One at a time!!!): ");
			option=sc.nextInt();
			if(option!=option1)
			{
			switch(option)
			{
				case 1:
						bill[i]=400;
						break;
				case 2:
						bill[i]=200;
						break;
				case 3:
						bill[i]=300;
						break;
				case 4:
						bill[i]=450;
						break;
				case 5:
						bill[i]=550;
						break;
				case 6:
						bill[i]=650;
						break;
				case 7:
						bill[i]=750;
						break;
				default:System.out.println("Choose Valid Option");
			}
			sum=sum+bill[i];
			}	
			else
			{
				System.out.println("ALready Choosen!!!");
				i--;
			}
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	return sum;
	}
}