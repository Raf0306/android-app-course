package cn.edu.sicnu.cs.stu.pengxiangyuan.first

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MyActivity : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            // TODO: 点击事件逻辑
            val textView = findViewById<TextView>(R.id.tv_hello)
            textView.text = resources.getString(R.string.clicked_text)
        }
    }
}


