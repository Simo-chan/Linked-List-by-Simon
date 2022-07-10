package com.example.linkedlistbysimon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
fun main(){
    val list=LinkedList()
    list.addNode(1)
    list.addNode(2)
    list.addNode(4)
    list.removeLastNode()
}