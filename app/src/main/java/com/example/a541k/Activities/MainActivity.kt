package com.example.a541k.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a541k.Adapters.ChatAdapter
import com.example.a541k.Adapters.RoomAdapter
import com.example.a541k.Models.Chat
import com.example.a541k.Models.Message
import com.example.a541k.Models.Room
import com.example.a541k.R

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews(){
        recyclerView = findViewById(R.id.rv)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        refreshAdapter(getAllChats())
    }

    private fun refreshAdapter(chats: ArrayList<Chat>){
        val adapter = ChatAdapter(this, chats)
        recyclerView.adapter = adapter
    }

    private fun getAllChats(): ArrayList<Chat> {
        val chats: ArrayList<Chat> = ArrayList()

        val rooms: ArrayList<Room> = ArrayList()

        rooms.add(Room(R.drawable.create, "Create room"))
        rooms.add(Room(R.drawable.volkswagen, "Muslim Saidov"))
        rooms.add(Room(R.drawable.mbw, "Oybek Abdumannobov"))
        rooms.add(Room(R.drawable.mercedes, "Doston Ibroximov"))
        rooms.add(Room(R.drawable.nissan, "Abbosbek Abduvoxobov"))
        rooms.add(Room(R.drawable.volkswagen, "Muslim Saidov"))
        rooms.add(Room(R.drawable.mbw, "Oybek Abdumannobov"))
        rooms.add(Room(R.drawable.mercedes, "Doston Ibroximov"))
        rooms.add(Room(R.drawable.nissan, "Abbosbek Abduvoxobov"))
        rooms.add(Room(R.drawable.volkswagen, "Muslim Saidov"))
        rooms.add(Room(R.drawable.mbw, "Oybek Abdumannobov"))
        rooms.add(Room(R.drawable.mercedes, "Doston Ibroximov"))

        chats.add(Chat(rooms))

        chats.add(Chat(Message(R.drawable.mbw,"Doston Ibroximov", false )))
        chats.add(Chat(Message(R.drawable.volkswagen,"Abbosbek Abduvoxobov", false )))
        chats.add(Chat(Message(R.drawable.nissan,"Muslim Saidov", true )))
        chats.add(Chat(Message(R.drawable.mbw,"Doston Ibroximov", false )))
        chats.add(Chat(Message(R.drawable.volkswagen,"Abbosbek Abduvoxobov", false )))
        chats.add(Chat(Message(R.drawable.nissan,"Muslim Saidov", true )))
        chats.add(Chat(Message(R.drawable.mbw,"Doston Ibroximov", false )))
        chats.add(Chat(Message(R.drawable.volkswagen,"Abbosbek Abduvoxobov", false )))
        chats.add(Chat(Message(R.drawable.nissan,"Muslim Saidov", true )))
        chats.add(Chat(Message(R.drawable.mbw,"Doston Ibroximov", false )))
        chats.add(Chat(Message(R.drawable.volkswagen,"Abbosbek Abduvoxobov", false )))
        chats.add(Chat(Message(R.drawable.nissan,"Muslim Saidov", true )))
        chats.add(Chat(Message(R.drawable.mbw,"Doston Ibroximov", false )))
        chats.add(Chat(Message(R.drawable.volkswagen,"Abbosbek Abduvoxobov", false )))
        chats.add(Chat(Message(R.drawable.nissan,"Muslim Saidov", true )))
        chats.add(Chat(Message(R.drawable.mbw,"Doston Ibroximov", true )))
        chats.add(Chat(Message(R.drawable.volkswagen,"Abbosbek Abduvoxobov", false )))
        chats.add(Chat(Message(R.drawable.nissan,"Muslim Saidov", true )))
        chats.add(Chat(Message(R.drawable.mbw,"Doston Ibroximov", false )))
        chats.add(Chat(Message(R.drawable.volkswagen,"Abbosbek Abduvoxobov", false )))
        chats.add(Chat(Message(R.drawable.nissan,"Muslim Saidov", true )))

        return chats
    }
}