package msl.serializacja;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import msl.stat.Pracownik;

public class Company {
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		String filePath = "D:/objectsComp.bin";
		Path path = Paths.get(filePath);
		if (Files.notExists(path)) {
			Files.createFile(path);
		}	
		ArrayList<Pracownik> pracownicy=new ArrayList<Pracownik>();
//		serialize(filePath, pracownicy);
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filePath))){
			Pracownik prac=null;
			while((prac=(Pracownik)in.readObject()) !=null){
				pracownicy.add(prac);
			}
		}
		catch(EOFException e) {}
		
		for(Pracownik prac:pracownicy){
			System.out.println(prac);
		}
		
	}

	private static void serialize(String filePath, ArrayList<Pracownik> pracownicy)
			throws IOException, FileNotFoundException {
		pracownicy.add(new Pracownik.PracownikBuilder().withImie("Jan").withNazwisko("Kowalski").withPesel(123456789).build());
		pracownicy.add(new Pracownik.PracownikBuilder().withImie("Jan").withNazwisko("Nowak").withPesel(323456789).build());
		pracownicy.add(new Pracownik.PracownikBuilder().withImie("Stanislaw").withNazwisko("Poniatowski").withPesel(987654321).build());
		
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filePath))){
			for(Pracownik prac:pracownicy) {
				out.writeObject(prac);
			}
		}
	}
}
