package com.example.lightdance.appointment.activities;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lightdance.appointment.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PersonalInformationActivity extends AppCompatActivity {

    //利用黄油刀完成的FindViewById
    @BindView(R.id.toolbar_userinfor)
    Toolbar toolbar;
    @BindView(R.id.tv_userinfor_nickname)
    TextView tvUserinforNickname;
    @BindView(R.id.img_userinfor_avatar)
    ImageView imgUserinforAvatar;
    @BindView(R.id.editText_userinfor_introduction)
    EditText editTextUserinforIntroduction;
    @BindView(R.id.tv_userinfor_name)
    TextView tvUserinforName;
    @BindView(R.id.tv_userinfor_sex)
    TextView tvUserinforSex;
    @BindView(R.id.tv_userinfor_college)
    TextView tvUserinforCollege;
    @BindView(R.id.tv_userinfor_studentnumb)
    TextView tvUserinforStudentnumb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_information);
        ButterKnife.bind(this);

        toolbar.setTitle("个人信息");
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        toolbar.setNavigationIcon(R.mipmap.ic_back_white);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        initInformation();

    }

    private void initInformation() {
        SharedPreferences p = getSharedPreferences("loginData",MODE_PRIVATE);
        tvUserinforNickname.setText(p.getString("nickName","无"));
        imgUserinforAvatar.setImageResource(p.getInt("userAvatar",0));
        editTextUserinforIntroduction.setText(p.getString("userIntroduction","空"));
        tvUserinforName.setText(p.getString("userName","无"));
        tvUserinforSex.setText(p.getString("userSex","无"));
        tvUserinforCollege.setText(p.getString("userCollege","无"));
        tvUserinforStudentnumb.setText(p.getString("userStudentNumber","无"));
    }

    //XML中控件的点击监听
    @OnClick({ R.id.tv_userinfor_nickname, R.id.img_userinfor_avatar, R.id.tv_userinfor_name, R.id.tv_userinfor_sex, R.id.tv_userinfor_college, R.id.tv_userinfor_studentnumb})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_userinfor_nickname:
                break;
            case R.id.img_userinfor_avatar:
                break;
            case R.id.tv_userinfor_name:
                break;
            case R.id.tv_userinfor_sex:
                break;
            case R.id.tv_userinfor_college:
                break;
            case R.id.tv_userinfor_studentnumb:
                break;
        }
    }
}
