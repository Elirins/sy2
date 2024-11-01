package com.example.sy2

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        // 获取按钮和布局的引用
        val buttonA = findViewById<Button>(R.id.buttonA)
        val buttonB = findViewById<Button>(R.id.buttonB)
        val buttonC = findViewById<Button>(R.id.buttonC)
        val buttonD = findViewById<Button>(R.id.buttonD)

        val linearLayout = findViewById<View>(R.id.linear_layout)
        val labelLayout = findViewById<View>(R.id.label_layout)
        val conLayout = findViewById<View>(R.id.con_layout)
        val otherLayout = findViewById<View>(R.id.other_layout)

        // 设置按钮点击事件
        buttonA.setOnClickListener {
            linearLayout.visibility = View.VISIBLE
            labelLayout.visibility = View.INVISIBLE
            conLayout.visibility = View.INVISIBLE
            otherLayout.visibility = View.INVISIBLE
        }

        buttonB.setOnClickListener {
            linearLayout.visibility = View.INVISIBLE
            labelLayout.visibility = View.VISIBLE
            conLayout.visibility = View.INVISIBLE
            otherLayout.visibility = View.INVISIBLE
        }

        buttonC.setOnClickListener {
            linearLayout.visibility = View.INVISIBLE
            labelLayout.visibility = View.INVISIBLE
            conLayout.visibility = View.VISIBLE
            otherLayout.visibility = View.INVISIBLE
        }

        buttonD.setOnClickListener {
            linearLayout.visibility = View.INVISIBLE
            labelLayout.visibility = View.INVISIBLE
            conLayout.visibility = View.INVISIBLE
            otherLayout.visibility = View.VISIBLE
        }
    }
}
