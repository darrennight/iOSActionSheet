package com.itau.actionsheet;

import com.itau.actionsheet.ActionSheet.OnActionSheetSelected;

import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends Activity implements OnActionSheetSelected, OnCancelListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.show).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ActionSheet.showSheet(MainActivity.this, MainActivity.this, MainActivity.this);
			}
		});
	}

	@Override
	public void onClick(int whichButton) {
		// TODO Auto-generated method stub
		switch (whichButton) {
			case 0:
				showToast("点击了清除");
				break;

			case 1:
				showToast("点击了取消");
				break;

			default:
				break;
		}

	}

	@Override
	public void onCancel(DialogInterface dialog) {
		// TODO Auto-generated method stub
		showToast("取消");
	}

	private void showToast(CharSequence charSequence) {
		Toast.makeText(this, charSequence, Toast.LENGTH_SHORT).show();
	}
}
