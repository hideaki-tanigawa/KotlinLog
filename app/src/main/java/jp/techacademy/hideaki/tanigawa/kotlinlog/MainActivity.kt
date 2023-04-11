package jp.techacademy.hideaki.tanigawa.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    // 1つめのインデントで半角スペース4つ
    override fun onCreate(savedInstanceState: Bundle?) {
        // 2つめのインデントで半角スペース8つ
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("kotlintest", "ログへの出力テスト")

        // 整数型の変数をnumという名前で作成して、10を代入する
        // 演算子
        val num1 = 10 + 5 - 2 * 4 / 2
        Log.d("kotlintest", "10 + 5 - 2 * 4 / 2 = " + num1)

        val flag1 = true
        val flag2 = false
        Log.d("kotlintest", "flag1 && flag2 = " + (flag1 && flag2))
        Log.d("kotlintest", "flag1 || flag2 = " + (flag1 || flag2))

        val num2 = 10
        val num3 = 20
        Log.d("kotlintest", "num2 < num3 = " + (num2 < num3))

        // 条件分岐（if）
        var num = 60

        if (num >= 90) {
            Log.d("kotlintest", "優")
        } else if (num >= 75) {
            Log.d("kotlintest", "良")
        } else if (num >= 60) {
            Log.d("kotlintest", "可")
        } else {
            Log.d("kotlintest", "不可")
        }

        // 条件分岐（when）
        val drink = 1

        when (drink) {
            0 -> {
                Log.d("kotlintest", "コーヒーを注文しました")
            }
            1 -> Log.d("kotlintest", "紅茶を注文しました")
            2 -> Log.d("kotlintest", "ミルクを注文しました")
            else -> Log.d("kotlintest", "オーダーミスです")
        }

        // 繰り返し処理
        for (i in 1 until 6) {
            Log.d("kotlintest", "for文の " + i + "回目")
        }

        var num10 = 1 //事前にvar num の定義が残っている場合は、エラーがでるので、var を削除しましょう。

        while (num10 < 6) {
            Log.d("kotlintest", "while文の " + num10 + "回目")
            num10++
        }

        // 6から2飛ばしずつ0まで
        for (i in 6 downTo 0 step 2) {
            Log.d("kotlintest", "downTo関数の" + i + "の回")
        }

        // 配列
        // Array<Int>型の配列が作成される
        val points = arrayOf(10, 6, 15, 23, 17)

        for (i in points.indices) {
            Log.d("kotlintest", points[i].toString())
        }

        // 例外処理
        val numA = 100
        val numB = 0
        var ans = 0

        try{
            ans = numA / numB
        } catch (e : Exception) {
            Log.d("kotlintest", "0で割ろうとしました")
            // 例外情報から、メッセージを表示
            Log.d("kotlintest", e.message.toString())
        } finally {
            Log.d("kotlintest", "ans = " + ans.toString())
        }

        val t = total(50, 1000)   // ここでtotalからsumを返してもらう
        Log.d("kotlintest", t.toString())

        /**
         * Chapter 7,8
         */
        // クラス
        val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.say()
        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")

        val bigdog = BigDog("ヨーゼフ", 15)     // 名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る

        bigdog.say()
        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")

        /**
         * Chapter 9
         */
        val dog1 = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog1.move()

        /**
         * 課題
         */
        val human1 = Human("ケン",22,"Kotlin")
        val human2 = Human("ボブ", 23, "Java")

        human1.say()
        human1.think()
        human2.say()
        human2.think()
    }

    private fun total(first: Int, last: Int): Int {
        var sum = 0
        for (i in first..last)  {
            sum += i
        }

        return sum
    }
}