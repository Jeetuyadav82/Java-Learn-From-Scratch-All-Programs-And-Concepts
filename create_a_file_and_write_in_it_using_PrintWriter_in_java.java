import java.io.*;
public class create_a_file_and_write_in_it_using_PrintWriter_in_java {
    public static void main(String[] args) throws IOException {
        // to  create file and write or add content in file
        try {
            File file = new File("filename.txt");
            if(!file.exists())
            {
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            pw.println("this is my file content");
            pw.println(10000000);
            pw.println("jeetu1 - /");
            pw.println("jeetu2 - /");
            pw.println("jeetu3 - /");
            pw.println("jeetu4 - /");
            pw.println("jeetu5 - /");
            pw.println("jeetu6 - /");
            pw.println("jeetu7 - /");

            pw.close();
            System.out.println("done");

        }
        catch(Exception e)
        {

        }

        // now to read file

        BufferedReader br = null;
        try{
            br = new BufferedReader( new FileReader("filename.txt")); // we can also give the path of file but / is replaced by //
            String line;

            while((line = br.readLine())!=null)
            {
                System.out.println(line);
            }

        }
        catch(Exception e)
        {

        }
        finally {
            br.close();
        }
    }
}
