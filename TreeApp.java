import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TreeApp 
{
	public static void main(String[] args) throws IOException 
	{
		int value;
		Tree theTree = new Tree();
		
		theTree.insert(50);
		theTree.insert(25);
		theTree.insert(75);
		theTree.insert(12);
		theTree.insert(37);
		theTree.insert(43);
		theTree.insert(30);
		theTree.insert(33);
		theTree.insert(87);
		theTree.insert(13);
		theTree.insert(17);
		
		while(true)
		{
			putText("Enter first letter of ");
			putText("show, insert, find, delete, or traverse: ");
			int choice = getChar();
			switch(choice)
			{
			case 's':
				theTree.displayTree();
				break;
			case 'i':
				putText("Enter value to insert: ");
				value = getInt();
				theTree.insert(value);
				break;
			case 'f':
				putText("Enter value to find: ");
				value = getInt();
				Node found = theTree.find(value);
				if(found != null)
				{
					putText("Found: ");
					found.displayNode();
					putText("\n");
				}
				else
					putText("Could not find " + value + '\n');
				break;
			case 'd':
				putText("Enter value to delete: ");
				value = getInt();
				boolean didDelete = theTree.delete(value);
				if(didDelete)
					putText("Deleted " + value + '\n');
				else
					putText("Could not delete " + value + '\n');
				break;
			case 't':
				putText("Enter type 1, 2 or 3:for Pre, In and Post Order");
				value = getInt();
				theTree.traverse(value);
				break;
			default:
				putText("Invalid entry\n");
			}
		}
	}
//--------------------------------------------------------------------------------------
	public static void putText(String s)
	{
		System.out.print(s);
		System.out.flush();
	}
//-----------------------------------------------------------------------------------------
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
//------------------------------------------------------------------------------------------
	public static char getChar() throws IOException
	{
		String s = getString();
		return s.charAt(0);
	}
//---------------------------------------------------------------------------------------------
	public static int getInt() throws IOException
	{
		String s = getString();
		return Integer.parseInt(s);
	}
}

/*
Output:
Enter first letter of show, insert, find, delete, or traverse: s
....................................................................
                                50                                                              
                25                              75                              
        12              37              --              87              
    --      13      30      43      --      --      --      --      
  --  --  --  17  --  33  --  --  --  --  --  --  --  --  --  --  
....................................................................
Enter first letter of show, insert, find, delete, or traverse: i
Enter value to insert: 39
Enter first letter of show, insert, find, delete, or traverse: i
Enter value to insert: 65
Enter first letter of show, insert, find, delete, or traverse: i
Enter value to insert: 67
Enter first letter of show, insert, find, delete, or traverse: i
Enter value to insert: 63
Enter first letter of show, insert, find, delete, or traverse: s
....................................................................
                                50                                                              
                25                              75                              
        12              37              65              87              
    --      13      30      43      63      67      --      --      
  --  --  --  17  --  33  39  --  --  --  --  --  --  --  --  --  
....................................................................
Enter first letter of show, insert, find, delete, or traverse: d
Enter value to delete: 37
Deleted 37
Enter first letter of show, insert, find, delete, or traverse: s
....................................................................
                                50                                                              
                25                              75                              
        12              33              65              87              
    --      13      30      --      63      67      --      --      
  --  --  --  17  --  --  --  --  --  --  --  --  --  --  --  --  
....................................................................
*/
