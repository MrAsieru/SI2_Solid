package lsk;

import ocp.Circle;
import ocp.Diamond;
import ocp.Sheet;
import ocp.Square;

public class main {
	public static void main(String[] args) {
		System.out.print("Hasieratzen...");
		Project project = new Project();
		FileSaveable fileSaveable = new SaveFile();
		project.addProjectSaveAble(fileSaveable);
	
		project.storeAllFiles();
	}
}
