package kg.dzaparovap.myscrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
  private lateinit var toolbar:Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
    }




    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId==R.id.item1){
            val tr=supportFragmentManager.beginTransaction()
            val obj=FragmentOne()

            tr.replace(R.id.container,obj)
            tr.commit()
        }

        if (item.itemId==R.id.item2){
            val tr=supportFragmentManager.beginTransaction()
            val obj=FragmentTwo()
            tr.replace(R.id.container,obj)
            tr.commit()
        }
        return super.onOptionsItemSelected(item)
    }
}


