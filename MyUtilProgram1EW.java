//Evan White
 
     public class MyUtilProgram1EW
	{
		public static void bubbleSort(String[] list)
		{
			String temp;
			int len = list.length;

			for (int p = 1; p < len; p++)
			{
				for (int q = 0; q < len-p; q++)
				{
					if (list[q].compareTo(list[q+1]) > 0) 
					{
						temp = list[q];
						list[q] = list[q+1];          
						list[q+1] = temp;                             
					}
				}
			}
		}
	  //===========================
		public static void bubbleSort(int[] list)
		{
			
			int temp;
			int len = list.length;

			for (int p = 1; p < len; p++)
			{
				for (int q = 0; q < len-p; q++)
				{
					if (list[q] > list[q + 1] ) 
					{
						temp = list[q];
						list[q] = list[q+1];          
						list[q+1] = temp;                             
					}
				}
			}
		}
		//===========================
		public static void bubbleSort(double[] list)
		{
			double temp;
			int len = list.length;

			for (int p = 1; p < len; p++)
			{
				for (int q = 0; q < len-p; q++)
				{
					if (list[q] > list[q + 1]) 
					{
						temp = list[q];
						list[q] = list[q+1];          
						list[q+1] = temp;                             
					}
				}
			}
	//========================
			
		}
		  public static int linearSearch (int[] list, int item)
		 	{
		 		int pos = 0;
		 		while (pos < list.length)
		 		{
		 			if (list[pos] == item)
		 			{
		 				System.out.print(" --> searches: " + (pos+1) + " ");
		 				return pos;
		 			}
		 			else
		 			{
		 				pos++;
		 			}
		 			
		 		}
		 		System.out.print(" --> searches: " + list.length + " ");		return -1;	
		 	}
    //===========================
		  
		  public static int linearSearch (double[] list, double item)
		 	{
		 		int pos = 0;
		 		while (pos < list.length)
		 		{
		 			if (list[pos] == item)
		 			{
		 				System.out.print(" --> searches: " + (pos+1) + " ");
		 				return pos;
		 			}
		 			else
		 			{
		 				pos++;
		 			}
		 			
		 		}
		 		System.out.print(" --> searches: " + list.length + " ");		
		 		return -1;	
		 	}
		//===========================
		  public static int linearSearch (String[] list, String item)
		 	{
		 		int pos = 0;
		 		while (pos < list.length)
		 		{
		 			if (list[pos].equals(item))  
		 			{
		 				System.out.print(" --> searches: " + (pos+1) + " ");
		 				return pos;
		 			}
		 			else
		 			{
		 				pos++;
		 			}
		 			
		 		}
		 		System.out.print(" --> searches: " + list.length + " ");		return -1;	
		 	} 
		//===========================
		  public static boolean binarySearch (int[] list, int item)
			{
				boolean found = false;
				int lo = 0;
				int hi= list.length - 1;
				int counter = 0;
				while(lo <= hi && !found)
				{
					counter++;
					int mid = (lo + hi)/2;
					if (item == list[mid])
					{
						found = true;
					}
					else
					{
						if (item > list[mid])
							lo = mid + 1;
						else
							hi = mid - 1;
					}
				}
				System.out.print("numSearches: " + counter + " ");
				return found;
			}
		//===========================
		  public static boolean binarySearch (double[] list, double item)
			{
				boolean found = false;
				int lo = 0;
				int hi= list.length - 1;
				int counter = 0;
				while(lo <= hi && !found)
				{
					counter++;
					int mid = (lo + hi)/2;
					if (item == list[mid])
					{
						found = true;
					}
					else
					{
						if (item > list[mid])
							lo = mid + 1;
						else
							hi = mid - 1;
					}
				}
				System.out.print("numSearches: " + counter + " ");
				return found;
			}
		//===========================
		  public static boolean binarySearch (String[] list, String item)
			{
				boolean found = false;
				int lo = 0;
				int hi= list.length - 1;
				int counter = 0;
				while(lo <= hi && !found)
				{
					counter++;
					int mid = (lo + hi)/2;
					if (item.equals(list[mid]))
					{
						found = true;
					}
					else
					{
						if   (item.compareTo(list[mid]) > 0) 
							lo = mid + 1;
						else
							hi = mid - 1;
					}
				}
				System.out.print("numSearches: " + counter + " ");
				return found;
			}

	}

     
   