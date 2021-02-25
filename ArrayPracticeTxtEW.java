//Evan White
import java.util.Scanner;
import java.io.*;
public class ArrayPracticeTxtEW {
	
	public static void main(String[] args) throws IOException {
		
Scanner input = new Scanner(new File("wordList.txt"));
    
	String[] list = new String[50];
	int i = 0;
	double counter = 0;
	double accum = 0;
		
		 while(input.hasNext())
		{
			String word = input.nextLine();
		    list[i] = word;
			accum = accum + word.length();
		    i++;
		}
		
		double all = accum / list.length;
		
		System.out.println("Average : " + all);
			
			
			for(int y = 0; y < list.length; y++)
			{
				if(list[y].length() < all)
				{
					counter++;
				}
			}
			System.out.println(counter);
			
			System.out.println("Found: " + MyUtilProgram1EW.binarySearch(list , 79.135 ));  
			//MyUtilProgram1EW.bubbleSort(list);
			
			//for(int g = 0; g < list.length; g++)
				//System.out.println(list[g]);
	}

}

/*
Average : 7.04
37.0
 
 */
