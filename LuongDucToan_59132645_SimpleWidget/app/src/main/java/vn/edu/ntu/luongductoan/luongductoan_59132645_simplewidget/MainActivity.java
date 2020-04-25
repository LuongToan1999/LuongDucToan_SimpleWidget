package vn.edu.ntu.luongductoan.luongductoan_59132645_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtTen, edtNgaySinh, edtSoThichKhac;
    RadioButton rdbNam, rdbNu;
    CheckBox cbPhim, cbNhac, cbCafe, cbHome, cbBep;
    Button btXacNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        KhaiBao();

//-------------------Set Button------------------------------------
        btXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//-------------------Set RadioGroup------------------------------------
                String gender = "";
                if (rdbNam.isChecked()) {
                    gender = gender + rdbNam.getText();
                } else {
                    gender = gender + rdbNu.getText();
                }
//-------------------Set CheckBox------------------------------------
                String sologan = "";
                if (cbPhim.isChecked()) {
                    sologan = sologan + cbPhim.getText() + " - ";
                }
                if (cbNhac.isChecked()) {
                    sologan = sologan + cbNhac.getText() + " - ";
                }
                if (cbCafe.isChecked()) {
                    sologan = sologan + cbCafe.getText() + " - ";
                }
                if (cbHome.isChecked()) {
                    sologan = sologan + cbHome.getText() + " - ";
                }
                if (cbBep.isChecked()) {
                    sologan = sologan + cbBep.getText() + " - ";
                }

                Toast.makeText(getApplicationContext(),
                            "Tên: " + edtTen.getText() + '\n'
                                + "Ngày sinh: " + edtNgaySinh.getText() + '\n'
                                + "Giới tính: " + gender + '\n'
                                + "Sở thích: "  + sologan + edtSoThichKhac.getText()
                        , Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void KhaiBao() {
        edtTen = (EditText) findViewById(R.id.edtTen);
        edtNgaySinh = (EditText) findViewById(R.id.edtNgaySinh);
        edtSoThichKhac = (EditText) findViewById(R.id.edtSoThichKhac);

        rdbNam = (RadioButton) findViewById(R.id.rdbNam);
        rdbNu = (RadioButton) findViewById(R.id.rdbNu);

        cbPhim = (CheckBox) findViewById(R.id.cbPhim);
        cbNhac = (CheckBox) findViewById(R.id.cbNhac);
        cbCafe = (CheckBox) findViewById(R.id.cbCafe);
        cbHome = (CheckBox) findViewById(R.id.cbHome);
        cbBep = (CheckBox) findViewById(R.id.cbBep);

        btXacNhan = (Button) findViewById(R.id.btXacNhan);
    }
}

