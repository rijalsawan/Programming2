import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
public class WritePrimitiveDataToXMLFile {
    public static void main(String[] args) throws IOException {
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream("myData2.xml"));
        int[] data = {2,3,4,5,6,7};
        for (int i = 0; i< data.length; i++){
            encoder.writeObject(data[i]);
        }
        encoder.close();
    }
}
