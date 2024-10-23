package com.likobehruz.viewpager2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.likobehruz.viewpager2.adapter.MyINfoAdapter
import com.likobehruz.viewpager2.databinding.ActivityMainBinding
import com.likobehruz.viewpager2.models.MyInfo

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    lateinit var list : ArrayList<MyInfo>
    lateinit var myINfoAdapter: MyINfoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        list= ArrayList()
        list.add(MyInfo("Xush kelibsiz", "Now i am creating codes in Android studio", R.drawable.rect ))
        list.add(MyInfo("Xikoyalar Dunyosi", "Now i am creating codes in Android studio", R.drawable.rect1 ))
        list.add(MyInfo("Kitob ortidan", "Now i am creating codes in Android studio", R.drawable.rect3 ))
        list.add(MyInfo("Bizga qoshiling", "Now i am creating codes in Android studio", R.drawable.rect2 ))

        myINfoAdapter=MyINfoAdapter(list)
        binding.viewPager.adapter = myINfoAdapter

    }
}