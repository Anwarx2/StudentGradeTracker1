package codeAlpha;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al1 = new ArrayList<>();
		System.out.println("Enter number of students: ");
		int n = sc.nextInt();
		System.out.println("Enter names of students: ");
		for(int i=0;i<n;i++) {
			al1.add(sc.next());
		}
		System.out.println("Enter student  grade marks: ");
		ArrayList<Double> al = new ArrayList<>();
		for(int i=0;i<n;i++) {
			al.add(sc.nextDouble());
		}
		double  max = al.get(0);
		for(int i=1;i<al.size();i++) {
			 
			if(al.get(i) > max) {
				max = al.get(i);
			}
		}
 
		
		double min = al.get(0);;
		for(int i=1;i<al.size();i++) {
			if(al.get(i) < min) {
				min = al.get(i);
			}
		}
	 
		
		int indexMax = al.indexOf(max);
		int indexMin = al.indexOf(min);
		
		System.out.println("--student grade report--");
		System.out.println("Total students: " + n);
		System.out.println("Top Scorer with " + max + " marks is " +  al1.get(indexMax));
		System.out.println("Least Scorer with " + min + " marks is " +  al1.get(indexMin));

		
		System.out.print("Average score: ");
		double sum = 0;
		for(int i=0;i<al.size();i++) {
		 
			sum = sum + al.get(i);
		}
		double avg = (sum/al.size());
		System.out.println(avg);
	}

}
