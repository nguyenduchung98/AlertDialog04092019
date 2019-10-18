package nguyenduchung.ndh.alertdialog04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mBtnAlertdialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnAlertdialog = findViewById(R.id.buttonshowAlert);
        mBtnAlertdialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Ban co muon tat app ko ?");
                //alert.setMessage("Hay xac thuc ben duoi");
                alert.setIcon(R.mipmap.ic_launcher);
                alert.setCancelable(false);
                final String[] arrayAnimal = {"Cat","Dog","Lion","Bat"};
//                alert.setPositiveButton("Co", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(MainActivity.this, "Co", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                alert.setNegativeButton("Khong", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(MainActivity.this, "Khong", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                alert.setNeutralButton("Huy", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(MainActivity.this, "Huy", Toast.LENGTH_SHORT).show();
//                    }
//                });
                //mutiplechoice

//                boolean[] arrayChecked = {false,false,false,false};
//                alert.setMultiChoiceItems(arrayAnimal, arrayChecked, new DialogInterface.OnMultiChoiceClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
//                        if (isChecked){
//                            Toast.makeText(MainActivity.this, "Da chon", Toast.LENGTH_SHORT).show();
//                        }else {
//                            Toast.makeText(MainActivity.this, "Bo chon", Toast.LENGTH_SHORT).show();
//                        }
//
//                    }
//                });
                //singleChoice
                alert.setSingleChoiceItems(arrayAnimal, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String animal=arrayAnimal[which];
                        Toast.makeText(MainActivity.this, animal, Toast.LENGTH_SHORT).show();
                        dialog.cancel();

                    }
                });
                alert.show();
            }
        });
    }
}
