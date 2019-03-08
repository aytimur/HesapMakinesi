package com.aytimur.hesapmakinesi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btnSayiTik(view: View) {
        if (yeniOperator){
            sayiGoster.setText("")
        }
        yeniOperator=false
        var btnSec = view as Button
        var btnTikDeger:String = sayiGoster.text.toString()
        when(btnSec.id){
            btn0.id->{
                btnTikDeger+="0"
            }
            btn1.id->{
                btnTikDeger+="1"
            }
            btn2.id->{
                btnTikDeger+="2"
            }
            btn3.id->{
                btnTikDeger+="3"
            }
            btn4.id->{
                btnTikDeger+="4"
            }
            btn5.id->{
                btnTikDeger+="5"
            }
            btn6.id->{
                btnTikDeger+="6"
            }
            btn7.id->{
                btnTikDeger+="7"
            }
            btn8.id->{
                btnTikDeger+="8"
            }
            btn9.id->{
                btnTikDeger+="9"
            }
            btnArtiEksi.id->{
                btnTikDeger="-"+btnTikDeger
            }
        }
        sayiGoster.setText(btnTikDeger)
    }
    var operator="*"
    var eskiSayi=""
    var yeniOperator=true
    fun btnOpTik(view: View) {
        var btnSec=view as Button
        when(btnSec.id){
            btnBolme.id->{
                operator="/"
            }
            btnCarpim.id->{
                operator="x"
            }
            btnCikarma.id->{
                operator="-"
            }
            btnTopla.id->{
                operator="+"
            }
        }
        eskiSayi=sayiGoster.text.toString()
        yeniOperator=true

    }
    fun btnEsittirTik(view: View) {
        var yeniSayi=sayiGoster.text.toString()
        var sonucSayisi:Double?=null
        when(operator){
            "/"->{
                sonucSayisi=eskiSayi.toDouble()/yeniSayi.toDouble()
            }
            "x"->{
                sonucSayisi=eskiSayi.toDouble()*yeniSayi.toDouble()
            }

            "-"->{
                sonucSayisi=eskiSayi.toDouble()-yeniSayi.toDouble()
            }

            "+"->{
                sonucSayisi=eskiSayi.toDouble()+yeniSayi.toDouble()
            }
        }
        sayiGoster.setText(sonucSayisi.toString())
        yeniOperator=true
    }
    fun btnSilTik(view: View) {
        sayiGoster.setText("0")
        yeniOperator=true
    }

    fun btnYuzdeTik(view: View) {
        var sayi:Double=sayiGoster.text.toString().toDouble()/100
        sayiGoster.setText(sayi.toString())
        yeniOperator=true
    }

}
