package com.example.todolist_ver1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvCongViec;
    ArrayList<String> listCV;
    ArrayAdapter<String> adapterCV; // Specify the generic type
    Button btnThoat;
    EditText edtCongViec, edtTimKiem;
    Button btnThemCV, btnLuuCV;
    TextView tvCongViecChon;
    int selectedIndex = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCongViec = findViewById(R.id.lvCongViec);
        btnThoat = findViewById(R.id.btnThoat);

        listCV = new ArrayList<>();
        listCV.add("Rửa bát");
        listCV.add("Học lập trình di động");
        listCV.add("Ôn thi Tiếng Anh VSTEP");

        edtCongViec = findViewById(R.id.edtCongViec);
        edtTimKiem = findViewById(R.id.edtTimKiem);
        btnThemCV = findViewById(R.id.btnThemCV);
        btnLuuCV = findViewById(R.id.btnLuuCV);
        tvCongViecChon = findViewById(R.id.tvCongViecChon);

        adapterCV = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, listCV);
        lvCongViec.setAdapter(adapterCV);

        lvCongViec.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Bạn vừa chọn '" + listCV.get(position) + "'", Toast.LENGTH_SHORT).show();
                selectedIndex = position;
                String congViec = listCV.get(selectedIndex);
                tvCongViecChon.setText("Đang chọn: " + congViec + " - index = " + selectedIndex);
                edtCongViec.setText(congViec);
            }
        });

        lvCongViec.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String xoaCV = listCV.get(position);
                AlertDialog.Builder dialogXoa = new AlertDialog.Builder(MainActivity.this);
                dialogXoa.setTitle("Xóa phần tử");
                dialogXoa.setMessage("Bạn muốn xóa công việc: '" + xoaCV + "'?");
                dialogXoa.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        listCV.remove(position); // Xóa dữ liệu trong ArrayList
                        adapterCV.notifyDataSetChanged(); // Thông báo sự thay đổi về dữ liệu
                        Toast.makeText(MainActivity.this, "Đã xóa '" + xoaCV + "'", Toast.LENGTH_SHORT).show();
                    }
                });
                dialogXoa.setNegativeButton("Hủy", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogXoa.create().show();
                return true; // Return true to indicate that the event is consumed
            }
        });

        edtTimKiem.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                adapterCV.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        btnLuuCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedIndex >= 0 && selectedIndex < listCV.size()) { // Add boundary check
                    String congViecCu = listCV.get(selectedIndex);
                    String congViecMoi = edtCongViec.getText().toString().trim();
                    if (!congViecMoi.isEmpty()) {
                        listCV.set(selectedIndex, congViecMoi);
                        adapterCV.notifyDataSetChanged();
                        Toast.makeText(MainActivity.this, "Đã sửa '" + congViecCu + "' thành '" + congViecMoi + "'", Toast.LENGTH_SHORT).show();
                        selectedIndex = -1;
                        edtCongViec.setText("");
                        tvCongViecChon.setText("");
                    } else {
                        Toast.makeText(MainActivity.this, "Công việc mới không được để trống", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Chọn 1 công việc để sửa", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnThemCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String congViecMoi = edtCongViec.getText().toString().trim();
                if (!congViecMoi.isEmpty()) {
                    listCV.add(congViecMoi);
                    adapterCV.notifyDataSetChanged();
                    edtCongViec.setText("");
                } else {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập công việc mới", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogThoat = new AlertDialog.Builder(MainActivity.this);
                dialogThoat.setTitle("Thoát ứng dụng");
                dialogThoat.setMessage("Bạn thực sự muốn thoát?");
                dialogThoat.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                dialogThoat.setNegativeButton("Hủy", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogThoat.create().show();
            }
        });
    }
}
