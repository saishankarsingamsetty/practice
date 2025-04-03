package fileIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInput {
	public static void main(String[] args) throws Exception {
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("src/datastreamsfile.txt"));
		DataInputStream dis=new DataInputStream(new FileInputStream("src/datastreamsfile.txt"));
		
		dos.writeInt(100);
		dos.writeBoolean(true);
		dos.writeUTF("hello java");
		System.out.println("data writen to the file successfully");
		dos.flush();
		
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readUTF());
		
		dos.close();
		dis.close();
		
	}
}
