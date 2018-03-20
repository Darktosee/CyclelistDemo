package com.example.darktosee.cyclelistdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by HJUser on 2016/12/01.
 */
public class Student extends AppCompatActivity {

    private EditText name;
    private TextView sex;
    private  EditText interest;
    private  TextView  age;
    private EditText phone;

    public TextView getSex() {
        return sex;
    }

    public EditText getName() {
        return name;
    }

    public TextView getAge() {
        return age;
    }

    public EditText getInterest() {
        return interest;
    }

    public void setAge(TextView age) {
        this.age = age;
    }

    public void setInterest(EditText interest) {
        this.interest = interest;
    }

    public void setName(EditText name) {
        this.name = name;
    }

    public void setSex(TextView sex) {
        this.sex = sex;
    }

    public EditText getPhone() {
        return phone;
    }

    public void setPhone(EditText phone) {
        this.phone = phone;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ctivity_student);
    }
     private void findView(){
         name = (EditText)findViewById(R.id.name);
         sex = (TextView) findViewById(R.id.sex);
         age =(TextView)findViewById(R.id.age);
         phone =(EditText)findViewById(R.id.phone);

     }
}
