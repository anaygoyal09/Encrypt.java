// Anay Goyal
// 1/10/25
// Encrypt.java
/*
 * getString for getting the user input,
   encryptString for encrypting the user input,
   printString for printing the line, and
   rotate13Times that would contain a loop and call the other methods. 
 */
import java.util.Scanner;
public class Encrypt
{
	private String Message;
	private String EncryptedMessage;
	private int EncryptNumber;
	
	public Encrypt ()
	{
		Message = new String("");
		EncryptedMessage = new String("");
		
	}
	public static void main(String [] args)
	{
		Encrypt et = new Encrypt();
		et.rotate13Times();
	}
	public void getString()
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Welcome to Encrypt.java. Please enter a word, phrase, or sentence.\n\n->  ");
		
		Message = reader.nextLine();
	}
	
	public void encryptString()
	{
		for(int i = 1; i < Message.length(); i++)
		{
			if((int)Message.charAt(i-1)>=32&&(int)Message.charAt(i-1)<=64||(int)Message.charAt(i-1)>=91&&(int)Message.charAt(i-1)<=96 ||(int)Message.charAt(i-1)>=123&&(int)Message.charAt(i-1)<=126)
			{
				EncryptedMessage += Message.charAt(i-1);
			}
			else
			{
				if((Message.charAt(i-1)+2)=='Y')
					EncryptedMessage += 'A';
				else if((Message.charAt(i-1)+2)=='Z')
					EncryptedMessage += 'B';
				else if((Message.charAt(i-1)+2)=='z')
					EncryptedMessage += 'b';
				else if((Message.charAt(i-1)+2)=='y')
					EncryptedMessage += 'A';
				else
				{
					EncryptedMessage += (char)((int)Message.charAt(i-1)+2);
				}
			
			}
		}
	}
	public void printString()
	{
		System.out.print("Encrypt " + EncryptNumber +":");
		System.out.print(EncryptedMessage);
	}
	public void rotate13Times()
	{			
		getString();
		//for (EncryptNumber = 1; EncryptNumber < 13; EncryptNumber++)
		//{
			encryptString();
			printString();
		//}
		
	}
	
}
