package com.example.viewsport;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Mcu extends Activity {
    private TextView txtShow;
 /** Called when the activity is first created. */
 @Override
 public void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.mcu);
  Button button = (Button)findViewById(R.id.btnhome);
  Button btnvb=(Button)findViewById(R.id.btnvb);
  Button btnbb=(Button)findViewById(R.id.btnbb);
  Button btnbm=(Button)findViewById(R.id.btnbm);
  Button btntt=(Button)findViewById(R.id.btntt);
  Button btnpg=(Button)findViewById(R.id.btnpg);
/*
  Button btnvbl=(Button)findViewById(R.id.btnvbl);
  Button btnbbl=(Button)findViewById(R.id.btnbbl);
  Button btnbml=(Button)findViewById(R.id.btnbml);
  Button btnttl=(Button)findViewById(R.id.btnttl);
  Button btnpgl=(Button)findViewById(R.id.btnpgl);
*/
  txtShow=(TextView)findViewById(R.id.txtSp);

  button.setOnClickListener(btnhomeListener);
  btnvb.setOnClickListener(myListner);
  btnbb.setOnClickListener(myListner);
  btnbm.setOnClickListener(myListner);
  btntt.setOnClickListener(myListner);
  btnpg.setOnClickListener(myListner);
/*
  btnbbl.setOnClickListener(myListner);
  btnvbl.setOnClickListener(myListner);
  btnttl.setOnClickListener(myListner);
  btnbml.setOnClickListener(myListner);
  btnpgl.setOnClickListener(myListner);
  */

   }
    public int count;
 private Button.OnClickListener myListner=new Button.OnClickListener(){

 	public void onClick(View v){
        count++;

        switch (v.getId()){
	    case R.id.btnvb:{
	    	Uri uri=Uri.parse("https://cacoo.com/diagrams/JenG6SojJhan9bzT?_cacooStatus=");
	    	Intent intent=new Intent(Intent.ACTION_VIEW,uri);
			startActivity(intent);
            break;
   			}
        }

 		switch (v.getId()){
		case R.id.btnbb:{
			Uri uri=Uri.parse("https://cacoo.com/diagrams/By2L0huz7BRgY2T3");
			Intent intent=new Intent(Intent.ACTION_VIEW,uri);
			startActivity(intent);
			break;
				}
 			}
 		switch (v.getId()){
		case R.id.btnbm:{
			Uri uri=Uri.parse("https://cacoo.com/diagrams/k9NIgNKlA3htHTCf");
			Intent intent=new Intent(Intent.ACTION_VIEW,uri);
			startActivity(intent);
			break;
		}
	}
        switch (v.getId()){
            case R.id.btntt:{
                Uri uri=Uri.parse("https://cacoo.com/diagrams/QWxeBr0roXqMASQy");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
                break;
            }
        }
        switch (v.getId()){
            case R.id.btnpg:{
                Uri uri=Uri.parse("https://cacoo.com/diagrams/Rl5kyLIAkiH0rHKs");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
                break;
            }
        }
        txtShow.setText("SP值="+count);
    }
 };


private OnClickListener btnhomeListener = new OnClickListener()
{
  @Override
  public void onClick(View v) {
      // TODO Auto-generated method stub
      //Switch to config page
      Intent intent = new Intent();
      intent.setClass(Mcu.this, MainActivity.class);
      startActivity(intent);
  		}
	};
}

