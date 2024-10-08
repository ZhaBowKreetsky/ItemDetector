package detector.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import detector.adapter.HomeAdapter
import idetector.model.PojoApi
import detector.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private val apiList by lazy {
        ArrayList<PojoApi>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        add(PojoApi(R.drawable.image_labelling, getString(R.string.title_labelling), getString(R.string.desc_labelling), 0))


        rvHome.layoutManager = LinearLayoutManager(this)
        rvHome.adapter = HomeAdapter(apiList)
    }
}
