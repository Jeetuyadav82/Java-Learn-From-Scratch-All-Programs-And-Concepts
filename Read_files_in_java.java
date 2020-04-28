import java.io.*;

public class Read_files_in_java {
    public static void main(String[] sfg) throws IOException {
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
