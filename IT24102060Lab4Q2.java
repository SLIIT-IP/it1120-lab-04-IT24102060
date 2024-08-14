import java.util.Scanner;
public class IT24102060Lab4Q2{
	public static void main(String[] args)
	{
	int exMark, labMark, exPercent, labPercent;
	double finalExmark;
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter exam marks (out of 100):");
	exMark = input.nextInt();
	if(exMark>100 || exMark<0)
	{
	System.out.println("Invalid input for exam marks. Terminating program");
	return;
	}

	System.out.println("Please enter lab submission marks (out of 100)");
	labMark = input.nextInt();
	if(labMark>100 || labMark<0)
	{
	System.out.println("Invalid input for lab marks. Terminating program");
	return;
	}
	
	System.out.println("Please enter the percentage given for the exam:");
	exPercent = input.nextInt();
	System.out.println("Please enter the percentage given for the lab submission:");
	labPercent = input.nextInt();
	if(exPercent + labPercent != 100)
	{
	System.out.println("The percentage must add upto 100. Terminating program");
	return;
	}

	finalExmark = ((exMark * exPercent)+(labMark * labPercent))/100;
	System.out.println("Final Exam Mark is :" +finalExmark);
	}
}