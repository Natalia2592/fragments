package natalia.example.myfirst

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import android.widget.TextView
import kotlin.random.Random

private const val LAST_ROLLED_MAGIC = "magic"

class RollFragment : Fragment() {


    lateinit var textV: TextView
    lateinit var rollButton: Button
    var magicTexts: List<String> = listOf("")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_roll, container, false)
        textV = view.findViewById(R.id.textViewRoll)
        rollButton = view.findViewById(R.id.rollButton)

        if (savedInstanceState != null)
            textV.text = savedInstanceState.getString(LAST_ROLLED_MAGIC)


        magicTexts = listOf(
            "Вам пора отдохнуть",
            "Вас ждет приятный сюрприз",
            "Если Вы проявите инициативу, успех не заставит себя ждать",
            "Вас ждет приятный сюрприз",
            "Сегодня как раз наступило то завтра, о котором Вы беспокоились вчера",
            "Ждите перемен",
            "Вас ждет встреча с важным человеком",
            "Проблема не там, где Вам кажется",
            "Не поддавайтесь эмоциям",
            "Будьте настойчивы в битве с собственным эгоизмом",
            "Подождите немножко, и следующий день принесет вам неожиданную долгожданную радость",
            "Пришло время действовать",
            "События полностью вне Вашего контроля"
        )



        rollButton.setOnClickListener {

            textV.text = magicTexts.random()
        }

        return view
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(LAST_ROLLED_MAGIC, textV.text.toString())
    }

}