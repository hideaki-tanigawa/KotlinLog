package jp.techacademy.hideaki.tanigawa.kotlinlog

import android.util.Log

open class Human:Animal,Thinkable {
    // プロパティ
    var hobby: String

    // コンストラクタ
    constructor(name: String, age: Int, hobby: String):super(name, age){
        this.hobby = hobby
    }

    // メソッド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

    // Humanインターフェイスのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", "「私は" + this.hobby + "について考える。」")
    }
}