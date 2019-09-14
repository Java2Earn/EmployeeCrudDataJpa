package io.task;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
public class DAO 
{
ArrayList<Emp> al=new ArrayList<Emp>();

	public void fetchData() throws IOException, ClassNotFoundException
	{
		try (
                ObjectInputStream objectInput
                    = new ObjectInputStream(new FileInputStream("empData.txt"));
            ){
            while (true) {
                Emp student = (Emp) objectInput.readObject();
                System.out.print(student.getName() + "\t");
            }
        } catch (EOFException eof) {
            System.out.println("Reached end of file");
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
	
	}

