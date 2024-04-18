package com.example.assiment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private TextView txt;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Initialize TextView and Button
        txt = findViewById(R.id.textView);
        btn = findViewById(R.id.button);

        Intent intent = getIntent();
        String eventName = intent.getStringExtra("event_name");
        String s1 = "الانتفاضة الكبرى (الثورة الفلسطينية) - 1936-1939:\n" +
                "بدأت هذه الانتفاضة كاستجابة للاستيطان اليهودي والممارسات الاستعمارية البريطانية.\n" +
                "شهدت المظاهرات السلمية وأعمال العصيان المدني إلى جانب العنف المتزايد.\n" +
                "انتهت باتفاقية الفداء بين القادة الفلسطينيين والبريطانيين، والتي أدت إلى إنهاء الانتفاضة.";
        String s2 = "الانتفاضة الثانية (انتفاضة الأقصى) - 2000-2005:\n" +
                "بدأت بزيارة أرييل شارون إلى المسجد الأقصى في سبتمبر 2000.\n" +
                "شهدت اندلاع العنف والاشتباكات بين الفلسطينيين والإسرائيليين في الضفة الغربية وقطاع غزة والقدس الشرقية.\n" +
                "انتهت بخطة الانسحاب الإسرائيلي من قطاع غزة في عام 2005.";
        String s3 = "الانتفاضة الثالثة (انتفاضة السكاكين) - منذ 2015:\n" +
                "بدأت بعد تصاعد التوترات في المسجد الأقصى والمعابر الإسرائيلية.\n" +
                "شهدت زيادة في عمليات الطعن والهجمات على الإسرائيليين من قبل الفلسطينيين.\n" +
                "تواصلت بشكل متقطع ومستمر حتى الآن، وتعتبر واحدة من الفعاليات الرئيسية في الصراع الإسرائيلي الفلسطيني.";

        // Set the text based on the selected event
        if(eventName.equals("Event 1")) {
            txt.setText(s1);
        } else if(eventName.equals("Event 2")) {
            txt.setText(s2);
        } else if(eventName.equals("Event 3")) {
            txt.setText(s3);
        }

        // Set onClickListener for the button to go back to MainActivity
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
