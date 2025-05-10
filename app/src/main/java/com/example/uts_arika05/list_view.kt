package com.example.uts_arika05

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class list_view : AppCompatActivity() {

    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_view)

        listView = findViewById(R.id.listView)

        val menuItems = arrayListOf(
            MenuItem("Soto Spesial", "25.000", R.drawable.soto_spesial), // Ganti dengan nama gambar Anda
            MenuItem("Soto Ayam", "20.000", R.drawable.soto_ayam),      // Ganti dengan nama gambar Anda
            MenuItem("Soto", "15.000", R.drawable.soto)                 // Ganti dengan nama gambar Anda
        )

        val adapter = MenuAdapter(this, menuItems)
        listView.adapter = adapter
    }

    private class MenuAdapter(
        private val context: list_view,
        private val menuItems: List<MenuItem>
    ) : ArrayAdapter<MenuItem>(context, 0, menuItems) {

        override fun getView(position: Int, convertView: android.view.View?, parent: android.view.ViewGroup): android.view.View {
            val itemView = convertView ?: android.view.LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)

            val menuItem = menuItems[position]
            val menuName: TextView = itemView.findViewById(R.id.menuName)
            val menuPrice: TextView = itemView.findViewById(R.id.menuPrice)
            val imageView: ImageView = itemView.findViewById(R.id.imageView)

            menuName.text = menuItem.name
            menuPrice.text = menuItem.price
            imageView.setImageResource(menuItem.imageResId)

            return itemView
        }
    }

    data class MenuItem(val name: String, val price: String, val imageResId: Int)
}