import javax.xml.crypto.Data;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadBinary {
    public static void main(String[] args) throws IOException {
        DataInputStream os = new DataInputStream(new FileInputStream("myData.ser"));
        int[] data = new int[4];
        for (int i = 0; i< data.length; i++){
            data[i] = os.readInt();
        }
        os.close();
        for (int x :data) {
            System.out.println(x);
        }
    }
}
