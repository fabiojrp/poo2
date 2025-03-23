package folders;


import java.util.Arrays;
import folders.model.FileSystemItem;
import folders.model.Folder;
import folders.model.File;

public class Client {
	
	public static void main(String[] args) {
		FileSystemItem file1 = new File("File1.txt");
		FileSystemItem file2 = new File("File2.txt");
		FileSystemItem file3 = new File("File3.txt");
		FileSystemItem file4 = new File("File4.txt");
		FileSystemItem folder1 = new Folder("folder1", Arrays.asList(file1));
		FileSystemItem folder2 = new Folder("folder2", Arrays.asList(file2, folder1));
		FileSystemItem folder0 = new Folder("folder0", Arrays.asList(folder2, file3, file4));
		
		folder0.print("");		
	}
}
