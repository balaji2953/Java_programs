/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class SecondLargerInArray
{
  public static void main (String[]args)
  {
    int size = 8;
    int arr[] = { 2, 5, 4,10, 1, 10, 7, 3, 6 };
    int maxIndex, secIndex = 0;

    for (int i = 0; i < size - 1; i++)
      {
	maxIndex = i;
	for (int j = i + 1; j < size; j++)
	  {
	    if (arr[maxIndex] < arr[j])
	      {
		maxIndex = j;
	      }
	  }
	if (secIndex > arr[maxIndex])
	  {
	    System.out.println(arr[maxIndex]);
	    break;
	  }
	secIndex = arr[maxIndex];

	int temp = arr[maxIndex];
	arr[maxIndex] = arr[i];
	arr[i] = temp;

      }

  }
}

