package com.mathartsoft.vtckn;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable; // for EditText event handling
import android.text.Html;
import android.text.TextWatcher; // EditText listener
import android.widget.EditText; // for bill amount input
import android.widget.ImageView;
import android.widget.TextView; // for displaying text
import com.mathartsoft.vtckn.InterfaceClass.*;


public class MainActivity extends AppCompatActivity {
    TKNCheck tknCheck=new TKNCheck();
    VKNCheck vknCheck=new VKNCheck();
    private String VKNNo=""; // VKNNo entered by the user
    private String TKNNo=""; // TKNNo entered by the user
    //private TextView VKNGirisTextView; // shows formatted VKNNo
    private TextView VKNSonucTextView; // shows VKN control result
    //private TextView TKNGirisTextView; // shows formatted TKNNo
    private TextView TKNSonucTextView; // shows TKN control result
    private ImageView VKNImageView;
    private ImageView TKNImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get references to programmatically manipulated TextViews
        //VKNGirisTextView=findViewById(R.id.VKNGirisTextView);
        VKNSonucTextView=findViewById(R.id.VKNSonucTextView);
        //TKNGirisTextView=findViewById(R.id.TKNGirisTextView);
        TKNSonucTextView=findViewById(R.id.TKNSonucTextView);
        VKNImageView=findViewById(R.id.VKNimageView);
        TKNImageView=findViewById(R.id.TKNimageView);

        //VKNGirisTextView.setText("");
        //TKNGirisTextView.setText("");
        EditText VKNGirisEditText=findViewById(R.id.VKNGirisEditText);
        VKNGirisEditText.addTextChangedListener(VKNEditTextWatcher);
        EditText TKNGirisEditText=findViewById(R.id.TKNGirisEditText);
        TKNGirisEditText.addTextChangedListener(TKNEditTextWatcher);
    }
    private void setVKNText(){
        if(!VKNNo.isEmpty()){
        if(!vknCheck.LengthCheck(VKNNo)){
            VKNSonucTextView.setText(Html.fromHtml("Vergi Kimlik No<br> 10 adet rakamdan<br> oluşmalıdır.").toString());//45
            VKNSonucTextView.setTextColor(Color.RED);
            VKNImageView.setImageResource(R.drawable.notverified);
        }
        else if (!vknCheck.AlghoritmCheck(VKNNo)){
            VKNSonucTextView.setText( "Vergi Kimlik No hatalıdır.");
            VKNSonucTextView.setTextColor(Color.RED);
            VKNImageView.setImageResource(R.drawable.notverified);
        }
        else{

            VKNSonucTextView.setText( "Vergi Kimlik No geçerlidir.");
            VKNSonucTextView.setTextColor(Color.rgb(28,139,11));
            VKNImageView.setImageResource(R.drawable.verified);
        }
        }
        else {
            VKNSonucTextView.setText("");
            VKNImageView.setImageResource(R.drawable.questionmark);
        }
    }
    private void setTKNText(){
        if(!TKNNo.isEmpty()){
        if(!tknCheck.LengthCheck(TKNNo)){
            TKNSonucTextView.setText(Html.fromHtml("TC Kimlik No<br> 11 adet rakamdan<br> oluşmalıdır.").toString());//42
            TKNSonucTextView.setTextColor(Color.RED);
            TKNImageView.setImageResource(R.drawable.notverified);
        }
        else if(!tknCheck.ZeroStartCheck(TKNNo)){
            TKNSonucTextView.setText("TC Kimlik No sıfır ile başlayamaz.");
            TKNSonucTextView.setTextColor(Color.RED);
            TKNImageView.setImageResource(R.drawable.notverified);
        }
        else if (!tknCheck.AlghoritmCheck(TKNNo)){
            TKNSonucTextView.setText( "TC Kimlik No hatalıdır.");
            TKNSonucTextView.setTextColor(Color.RED);
            TKNImageView.setImageResource(R.drawable.notverified);
        }
        else{
            TKNSonucTextView.setText( "TC Kimlik No geçerlidir.");
            TKNSonucTextView.setTextColor(Color.rgb(28,139,11));
            TKNImageView.setImageResource(R.drawable.verified);
        }
        }
        else {
            TKNSonucTextView.setText("");
            TKNImageView.setImageResource(R.drawable.questionmark);
        }
    }

    private final TextWatcher VKNEditTextWatcher = new TextWatcher() {
        // called when the user modifies the bill amount
        @Override
        public void onTextChanged(CharSequence s, int start,
                                  int before, int count) {

            try {

               VKNNo=s.toString();
               //VKNGirisTextView.setText(VKNNo);
            }
            catch (NumberFormatException e) { // if s is empty or non-numeric
                //VKNGirisTextView.setText("");

            }

            setVKNText();
        }

        @Override
        public void afterTextChanged(Editable s) { }

        @Override
        public void beforeTextChanged(
                CharSequence s, int start, int count, int after) { }
    };

    private final TextWatcher TKNEditTextWatcher = new TextWatcher() {
        // called when the user modifies the bill amount
        @Override
        public void onTextChanged(CharSequence s, int start,
                                  int before, int count) {

            try {
                TKNNo=s.toString();
                   // TKNGirisTextView.setText(TKNNo);
            }
            catch (NumberFormatException e) { // if s is empty or non-numeric
                //TKNGirisTextView.setText("");

            }

            setTKNText();
        }

        @Override
        public void afterTextChanged(Editable s) { }

        @Override
        public void beforeTextChanged(
                CharSequence s, int start, int count, int after) { }
    };

}
