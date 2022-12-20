import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadPrimitiveDataFromXML {
    public static void main(String[] args) throws IOException {
        XMLDecoder decoder = new XMLDecoder(new FileInputStream("myData2.xml"));
        int[] data = new int[5];
        for (int i = 0; i< data.length; i++){
            data[i] = (int)decoder.readObject();
        }
        for (int x:data
             ) {
            System.out.println(x);
        }
    }
}
