package msl.stat;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import msl.szkolenie.Point;

public class Test {
//	Point point=new Point(10, 10);
//	Point point2;
//	Point point3;
//	{
//		point2=new Point(5,5);		
//	}

	public static void crawlThrough(String path) {
		File pathHandle = new File(path);
		if ((!pathHandle.exists()) || (!pathHandle.isDirectory())) {
			System.out.println("Not found dir:" + path);
			return;
		}
		try {
			if (pathHandle.list() == null) {
				return;
			}

			//List<File> filesInList = pathHandle.listFiles());
			for (File fileHndl : pathHandle.listFiles()) {
				if (fileHndl.isDirectory()) {
					crawlThrough(fileHndl.getAbsolutePath());
				} else {
					System.out.printf("%s dir content:file %s\n", path, fileHndl.getName());
				}
			}
		} catch (SecurityException e) {
			System.out.println("Can not read:" + path);
			e.printStackTrace();
		} catch (NullPointerException f) {
			f.printStackTrace();
		}
	}

	public Test() {
//		point3=new Point(1, 1);
	}

	public static void main(String[] args) {
		System.out.println("Podaj sciezke:");
		String path = "";
		try (Scanner scan = new Scanner(System.in);

		) {
			path = scan.nextLine();
		}
		crawlThrough(path);

	}

//		File pathHandle=new File(path);
//		if (! pathHandle.exists()) {
//			System.out.printf("Path %s does not exist\n",pathHandle);
//			return;
//		};
//		//StringBuilder builder=new StringBuilder();
//		if(pathHandle.isDirectory()) {
//	
//		}
//		
//		System.out.println(test.point.toString());
//		System.out.println(test.point2.toString());
//		System.out.println(test.point2.toString());
}
