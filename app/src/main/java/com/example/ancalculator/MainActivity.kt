package com.example.petsecond

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button0.setOnClickListener{ userInputFun("0") }
        button1.setOnClickListener{ userInputFun("1") }
        button2.setOnClickListener{ userInputFun("2") }
        button3.setOnClickListener{ userInputFun("3") }
        button4.setOnClickListener{ userInputFun("4") }
        button5.setOnClickListener{ userInputFun("5") }
        button6.setOnClickListener{ userInputFun("6") }
        button7.setOnClickListener{ userInputFun("7") }
        button8.setOnClickListener{ userInputFun("8") }
        button9.setOnClickListener{ userInputFun("9") }


        bracketOpen.setOnClickListener{ userInputFun("5") }
        bracketClose.setOnClickListener{ userInputFun("6") }
        buttonDivide.setOnClickListener{ userInputFun("7") }
        buttonMinus.setOnClickListener{ userInputFun("8") }
        buttonPlus.setOnClickListener{ userInputFun("9") }
        buttonPlus.setOnClickListener{ userInputFun("9") }
    }

    fun userInputFun(str: String) {
        userInput.append(str)
    }

}
