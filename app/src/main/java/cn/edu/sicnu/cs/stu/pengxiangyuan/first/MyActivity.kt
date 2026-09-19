package cn.edu.sicnu.cs.stu.pengxiangyuan.first

import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MyActivity : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linearLayout = LinearLayout(this)
        linearLayout.orientation = LinearLayout.VERTICAL

        val tv_hello = TextView(this)
        tv_hello.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT)
        tv_hello.textSize = 30F
        tv_hello.text = getString(R.string.hello_world)
        linearLayout.addView(tv_hello)

        val button = Button(this)
        button.width = ViewGroup.LayoutParams.MATCH_PARENT
        button.height = ViewGroup.LayoutParams.WRAP_CONTENT
        button.text = getString(R.string.btn_click_me)
        linearLayout.addView(button)

        setContentView(linearLayout)
        button.setOnClickListener {
            // TODO: 点击事件逻辑
            tv_hello.text = resources.getString(R.string.clicked_text)
        }
    }
}


