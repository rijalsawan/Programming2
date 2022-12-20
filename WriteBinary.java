import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class WriteBinary {
    public static void main(String[] args) throws IOException {
        DataOutputStream os = new DataOutputStream(new FileOutputStream("myData.ser"));
        int[] data = {2, 3, 5, 7};
        for (int i = 0; i<4; i++){
            os.writeInt(data[i]);
        }
        os.close();
    }
}
