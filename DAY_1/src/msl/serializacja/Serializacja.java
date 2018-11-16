package msl.serializacja;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Serializacja {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String filePath = "D:/objects.bin";
		Path path = Paths.get(filePath);
		if (Files.notExists(path)) {
			Files.createFile(path);
		}
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath));
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath));
		) {
			out.writeObject(Integer.valueOf(10));
			Integer num1=(Integer)in.readObject();
			out.writeObject(Integer.valueOf(20));
			Integer num2=(Integer)in.readObject();
			System.out.printf("%d %d", num1, num2);
		}
	}
}
