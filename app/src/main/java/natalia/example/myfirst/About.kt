package natalia.example.myfirst

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class About : Fragment() {
    lateinit var developersRecyclerView: RecyclerView
    lateinit var showWebSiteButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about, container, false)

        val developersNames: List<String> = listOf(
            "Наталья Мягкова",
            "г. Москва",
            "г. Зеленоград",
            "2021"
        )

        showWebSiteButton=view.findViewById(R.id.show_web_site_button)
        developersRecyclerView = view.findViewById(R.id.developers_recycler_view)
        developersRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        developersRecyclerView.adapter = DeveloperAdapter(developersNames)

        showWebSiteButton.setOnClickListener {
            val link = Uri.parse("https://www.instagram.com/natalia.myagkova/")
            val intent = Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }
        return view
    }

}