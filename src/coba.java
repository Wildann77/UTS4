import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class coba {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input Tiga Angka Dengan Spasi =  ");
        String[] p_ = reader.readLine().split( "");
        int _c = Integer.parseInt(p_[0]);
        int _n = Integer.parseInt(p_[1]);
        int _z = Integer.parseInt(p_[2]);
        boolean _bool;
        if (_c + _n + _z > 100) {
            _bool = false;
            if (_bool = true){
                System.out.println("You are not authorized...");
        } else if (_bool = false) {
            int h_ = 0;
            for (int index = 0; index < 5; index++) {
                h_ = _c + _n - _z + h_;

            }
            System.out.println("Total Number is = " + h_);
        }
    }else{
        System.out.println("Conctact yor administartor.....");
    }
   }
}
