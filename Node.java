import java.io.*;
import java.util.*;
import java.lang.Integer;


class Node 
{
	public int iData;
	public Node leftChild;
	public Node rightChild;
	
	public void displayNode()
	{
		System.out.print("{");
		System.out.print(iData);
		System.out.print("} ");
	}
}
