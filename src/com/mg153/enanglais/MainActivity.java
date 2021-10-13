package com.mg153.enanglais;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;


import android.text.method.ScrollingMovementMethod;


public class MainActivity extends Activity {

    TextView mText;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	    mText = (TextView)findViewById(R.id.text);
	    mText.setMovementMethod(new ScrollingMovementMethod());
	    mText.setText(getResources().getText(R.string.CAT1_content));
	}
	
	
   @Override
   public boolean onCreateOptionsMenu(Menu menu) 
   { 
       MenuInflater inflater=getMenuInflater();
       inflater.inflate(R.menu.main, menu);
	   	   return true;

   } 
   
   @Override
   public boolean onOptionsItemSelected(MenuItem item) 
   { 
         
       switch (item.getItemId()) 
       { 
   
       case R.id.menu_cat1: 
      
    	    mText = (TextView)findViewById(R.id.text);
    	    mText.setText(getResources().getText(R.string.CAT1_content));
    	    mText.scrollTo(0, 0);
       	    return true;
     	        	        	
       case R.id.menu_cat2:
       
    	   	mText = (TextView)findViewById(R.id.text);
    	   	mText.setText(getResources().getText(R.string.CAT2_content));
    	   	mText.scrollTo(0, 0);
            return true;
            
       case R.id.menu_cat3:
           
   	   	mText = (TextView)findViewById(R.id.text);
   	   	mText.setText(getResources().getText(R.string.CAT3_content));
   	   	mText.scrollTo(0, 0);
           return true;
           
      case R.id.menu_cat4:
          
  	   	mText = (TextView)findViewById(R.id.text);
  	   	mText.setText(getResources().getText(R.string.CAT4_content));
  	   	mText.scrollTo(0, 0);
          return true;
          
     case R.id.menu_cat5:
         
 	   	mText = (TextView)findViewById(R.id.text);
 	   	mText.setText(getResources().getText(R.string.CAT5_content));
 	   	mText.scrollTo(0, 0);
         return true;
         
    case R.id.menu_cat6:
        
	   	mText = (TextView)findViewById(R.id.text);
	   	mText.setText(getResources().getText(R.string.CAT6_content));
	   	mText.scrollTo(0, 0);
        return true;
        
   case R.id.menu_cat7:
       
	   	mText = (TextView)findViewById(R.id.text);
	   	mText.setText(getResources().getText(R.string.CAT7_content));
	   	mText.scrollTo(0, 0);
       return true;
       
  case R.id.menu_cat8:
      
	   	mText = (TextView)findViewById(R.id.text);
	   	mText.setText(getResources().getText(R.string.CAT8_content));
	   	mText.scrollTo(0, 0);
      return true;
      
 case R.id.menu_cat9:
     
	   	mText = (TextView)findViewById(R.id.text);
	   	mText.setText(getResources().getText(R.string.CAT9_content));
	   	mText.scrollTo(0, 0);
     return true;
     
case R.id.menu_cat10:
    
   	mText = (TextView)findViewById(R.id.text);
   	mText.setText(getResources().getText(R.string.CAT10_content));
   	mText.scrollTo(0, 0);
    return true;
    
case R.id.menu_cat11:
   
  	mText = (TextView)findViewById(R.id.text);
  	mText.setText(getResources().getText(R.string.CAT11_content));
  	mText.scrollTo(0, 0);
   return true;
   
case R.id.menu_cat12:
  
 	mText = (TextView)findViewById(R.id.text);
 	mText.setText(getResources().getText(R.string.CAT12_content));
 	mText.scrollTo(0, 0);
  return true;
  
case R.id.menu_cat13:
 
	mText = (TextView)findViewById(R.id.text);
	mText.setText(getResources().getText(R.string.CAT13_content));
	mText.scrollTo(0, 0);
 return true;
 
case R.id.menu_cat14:

	mText = (TextView)findViewById(R.id.text);
	mText.setText(getResources().getText(R.string.CAT14_content));
	mText.scrollTo(0, 0);
return true;

case R.id.menu_cat15:

	mText = (TextView)findViewById(R.id.text);
	mText.setText(getResources().getText(R.string.CAT15_content));
	mText.scrollTo(0, 0);
return true;

case R.id.menu_cat16:

	mText = (TextView)findViewById(R.id.text);
	mText.setText(getResources().getText(R.string.CAT16_content));
	mText.scrollTo(0, 0);
return true;

case R.id.menu_cat17:

	mText = (TextView)findViewById(R.id.text);
	mText.setText(getResources().getText(R.string.CAT17_content));
	mText.scrollTo(0, 0);
return true;

case R.id.menu_cat18:

	mText = (TextView)findViewById(R.id.text);
	mText.setText(getResources().getText(R.string.CAT18_content));
	mText.scrollTo(0, 0);
return true;

case R.id.menu_cat19:

	mText = (TextView)findViewById(R.id.text);
	mText.setText(getResources().getText(R.string.CAT19_content));
	mText.scrollTo(0, 0);
return true;

case R.id.menu_cat20:

	mText = (TextView)findViewById(R.id.text);
	mText.setText(getResources().getText(R.string.CAT20_content));
	mText.scrollTo(0, 0);
return true;

case R.id.menu_cat21:

	mText = (TextView)findViewById(R.id.text);
	mText.setText(getResources().getText(R.string.CAT21_content));
	mText.scrollTo(0, 0);
return true;

case R.id.menu_cat22:

	mText = (TextView)findViewById(R.id.text);
	mText.setText(getResources().getText(R.string.CAT22_content));
	mText.scrollTo(0, 0);
return true;

case R.id.menu_cat23:

	mText = (TextView)findViewById(R.id.text);
	mText.setText(getResources().getText(R.string.CAT23_content));
	mText.scrollTo(0, 0);
return true;

case R.id.menu_cat24:

	mText = (TextView)findViewById(R.id.text);
	mText.setText(getResources().getText(R.string.CAT24_content));
	mText.scrollTo(0, 0);
return true;

case R.id.menu_cat25:

	mText = (TextView)findViewById(R.id.text);
	mText.setText(getResources().getText(R.string.CAT25_content));
	mText.scrollTo(0, 0);
return true;

case R.id.menu_cat26:

	mText = (TextView)findViewById(R.id.text);
	mText.setText(getResources().getText(R.string.CAT26_content));
	mText.scrollTo(0, 0);
return true;

case R.id.menu_cat27:

	mText = (TextView)findViewById(R.id.text);
	mText.setText(getResources().getText(R.string.CAT27_content));
	mText.scrollTo(0, 0);
return true;

case R.id.menu_cat28:

	mText = (TextView)findViewById(R.id.text);
	mText.setText(getResources().getText(R.string.CAT28_content));
	mText.scrollTo(0, 0);
return true;

case R.id.menu_cat29:

	mText = (TextView)findViewById(R.id.text);
	mText.setText(getResources().getText(R.string.CAT29_content));
	mText.scrollTo(0, 0);
return true;

case R.id.menu_cat30:

	mText = (TextView)findViewById(R.id.text);
	mText.setText(getResources().getText(R.string.CAT30_content));
	mText.scrollTo(0, 0);
return true;

case R.id.menu_cat31:

	mText = (TextView)findViewById(R.id.text);
	mText.setText(getResources().getText(R.string.CAT31_content));
	mText.scrollTo(0, 0);
return true;

       default: 
           return super.onOptionsItemSelected(item); 
       } 
   } 
   
	  
	}