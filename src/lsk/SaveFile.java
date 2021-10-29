package lsk;

public class SaveFile implements FileSaveable {
	public String filePath;

	public SaveFile(String filePath){
		this.filePath=filePath;
	}

	public void storeFile() {
		System.out.println("file saved.");
	}
}
