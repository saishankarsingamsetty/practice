package fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationAndDeserialization  {
	public static void main(String[] args)throws Exception {
		FileOutputStream fos=new FileOutputStream("src/objects.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(new Cat());
		oos.writeObject(new Cat(20,200));
		
		
		FileInputStream fis=new FileInputStream("src/objects.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Cat cat=(Cat)ois.readObject();
		
		System.out.println(cat.a+"     "+cat.b);
		
		cat=(Cat)ois.readObject();
		System.out.println(cat.a+"     "+cat.b);
		
		
	}
}

class Cat implements Serializable{
	int a=10;
	int b=100;
	Cat(){
		
	}
	
	Cat(int a,int b){
		this.a=a;
		this.b=b;
	}
}
