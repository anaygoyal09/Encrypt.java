// Anay Goyal
// 1/10/25
// Encrypt.java
/*
 * getString for getting the user input,
   encryptString for encrypting the user input,
   printString for printing the line, and
   rotateTimes that would contain a loop and call the other methods. 
 */
import java.util.Scanner;
public class Encrypt
{
	private String Message;
	private String EncryptedMessage;
	private int EncryptNumber;
	private int increment;
	private String InitialMessage;


	public Encrypt ()
	{
		Message = new String("");
		EncryptedMessage = new String("");
		EncryptNumber = 1;


	}
	public static void main(String [] args)
	{
		Encrypt et = new Encrypt();
		et.rotateTimes();
		System.out.print("\n\n\n");
	}
	public void getString()
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("\n\n\nWelcome to Encrypt.java. Please enter a word, phrase, or sentence.\n\n->  ");
		Message = reader.nextLine();
		InitialMessage = Message;
		System.out.print("\n\n\nWhat increment?\n\n->  ");
		increment = reader.nextInt();
		//increment = 2;
		

	}
	public void encryptString()
	{
		int tempPlace;
		if (increment<0)
			increment = increment%26+26;
		else
			increment = increment%26;
		
		for(int i = 1; i < Message.length()+1; i++)
		{
			
			if((int)Message.charAt(i-1)>=65&&(int)Message.charAt(i-1)<=90)
			{
					
				tempPlace = (int)Message.charAt(i-1)+ increment;
				if (tempPlace > 90)
				{
					EncryptedMessage += (char)((int)Message.charAt(i-1)+increment-26);
				}
				else
					EncryptedMessage += (char)((int)Message.charAt(i-1)+increment);
			}
			else if((int)Message.charAt(i-1)>=97&&(int)Message.charAt(i-1)<=122)
			{
				tempPlace = (int)Message.charAt(i-1)+ increment;
				if (tempPlace > 122)
				{
					EncryptedMessage +=(char)((int)Message.charAt(i-1)+increment-26);
				}
				else
					EncryptedMessage += (char)((int)Message.charAt(i-1)+increment);
			}
			else
			{
				EncryptedMessage += Message.charAt(i-1);

			}
		}		
		
	}
	public void printString()
	{
		System.out.println("Encrypt " + EncryptNumber +":");
		System.out.println(EncryptedMessage +"\n");
	}
	public void rotateTimes()
	{			
		getString();

		//for (EncryptNumber = 1; EncryptNumber <= 13; EncryptNumber++)
		do 
		{
			encryptString();
			printString();
			Message = EncryptedMessage;
			EncryptedMessage="";
			EncryptNumber++;
		}while(!Message.equals(InitialMessage));

	}

}
