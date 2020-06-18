ckage com.tutorialspoint.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UnitTestActivity extends AppCompatActivity {
   TextView TextView;
   @Override

   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      TextView = findViewById(R.id.textview);
      testing()
   }

   

   @Test
    public void testScan() {
         ScanActity scan = new ScanActity();
         boolean actual = scan.signUp(id,pwd);

        // expected value is true
        boolean expected = true;
   
        assertEquals("Scan test", expected, actual, 0.001);
    }

    @Test
    public void testZip() {
         TransferActity zip = new TransferActity();
         boolean actual = scan.Zip(id,pwd);

        // expected value is true
        boolean expected = true;
   
        assertEquals("Scan test", expected, actual, 0.001);
    }

    @Test
    public void testScan() {
         ScanActity scan = new ScanActity();
         boolean actual = scan.signUp(id,pwd);

        // expected value is true
        boolean expected = true;
   
        assertEquals("Scan test", expected, actual, 0.20);
    }

    @Test
    public void testUpload() {
         UploadActity scan = new UplaodActity();
         boolean actual = scan.signUp(id,pwd);

        // expected value is true
        boolean expected = true;
   
        assertEquals("Scan test", expected, actual, 0.021);
    }


    
}