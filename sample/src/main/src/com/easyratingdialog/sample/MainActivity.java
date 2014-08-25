package com.easyratingdialog.sample;

 import com.easyratingdialog.sample.R;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

  EasyRatingDialog easyRatingDialog;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    easyRatingDialog = new EasyRatingDialog(this);
  }

  @Override
  protected void onStart() {
    super.onStart();
    easyRatingDialog.onStart();
  }

  @Override
  protected void onResume() {
    super.onResume();
    easyRatingDialog.showIfNeeded(this);
    
    EasyRatingDialog.ConditionTrigger conditionTrigger = new EasyRatingDialog.ConditionTrigger() {
    	  @Override
    	  public boolean shouldShow() {
    	    //Your custom condition here
    		 
    	    return false;
    	  }
    	};

    	easyRatingDialog.setConditionTrigger(conditionTrigger);
    	
  }
}
