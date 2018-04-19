import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {
	public static void main(String[] args) {
		
		final String FILE_NAME = "testFile.txt";
		String[] words = null;
		int numberOfSignsWithSpaces = 0;
		int numberOfSignsNoSpaces = 0;
		int numberOfSpaces = 0;
		
		try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAME)))
		{	
			
			String nextLine = null;
			while((nextLine =br.readLine())!=null) {
				numberOfSignsWithSpaces = nextLine.length();
				for(int i =0; i<nextLine.length(); i++) {
					if (nextLine.charAt(i)==' ') {
						numberOfSpaces ++;
					}
				}
				words = nextLine.split(" ");
			}
		}
		catch(IOException e) {
			System.out.println("Otwarcie pliku się nie powiodlo.");
		}
		numberOfSignsNoSpaces = numberOfSignsWithSpaces - numberOfSpaces;
		System.out.println("W pliku znajduje się: " + words.length + " słów.");
		System.out.println("Ilość znaków(ze spacjami): " + numberOfSignsWithSpaces);
		System.out.println("Ilość znaków(ze spacjami): " + numberOfSignsNoSpaces);
	}
}