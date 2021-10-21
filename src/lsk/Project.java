package lsk;

import java.util.Vector;

public class Project {
	public Vector<FileSaveable> filesSaveable=new Vector<FileSaveable>();
	public Vector<FileReadable> filesReadable=new Vector<FileReadable>();

	public void addProjectSaveAble(FileSaveable p){
		filesSaveable.add(p);
	}
	
	public void addProjectReadAble(FileReadable p){
		filesReadable.add(p);
	}
	
	public void loadAllFiles(){
		for (FileReadable f: filesReadable)
		f.loadFile();
	}
	public void storeAllFiles(){
		for (FileSaveable f:filesSaveable)
		f.storeFile();
	}
}