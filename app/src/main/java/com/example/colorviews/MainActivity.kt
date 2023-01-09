package com.example.colorviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setclicklistner()
    }
    private  fun setclicklistner() {

     val ClickableViews : List<View> =
     listOf(box_one_text,box_two_text,box_three_text,box_four_text,box_five_text,constraint,Yellow_Button,Red_Button,Green_Button)
        for (item in ClickableViews){ item.setOnClickListener {makeCloered(it)}   }

    }
private fun makeCloered(view: View) {
when(view.id){
    R.id.box_one_text->view.setBackgroundColor(Color.MAGENTA)
    R.id.box_two_text->view.setBackgroundColor(Color.BLACK)
    R.id.box_three_text->view.setBackgroundResource(android.R.color.holo_blue_light)
    R.id.box_four_text->view.setBackgroundResource(android.R.color.darker_gray)
    R.id.box_five_text->view.setBackgroundResource(android.R.color.holo_green_dark)
    R.id.Green_Button->box_three_text.setBackgroundResource(R.color.My_GREEN)
    R.id.Red_Button->box_four_text.setBackgroundResource(R.color.My_red)
    R.id.Yellow_Button->box_five_text.setBackgroundResource(R.color.My_YELLOW)
    else -> view.setBackgroundColor(Color.YELLOW)

}

}
}