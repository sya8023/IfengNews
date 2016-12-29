package com.example.study_dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends Activity {
	private AlertDialog di;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	/** 默认提示框 */
	// protected void dialog() {
	// AlertDialog.Builder builder = new Builder(MainActivity.this);
	// builder.setMessage("确定退出啊是啊");
	// builder.setTitle("提示");
	// // 确定
	// builder.setPositiveButton("确认", new OnClickListener() {
	//
	// @Override
	// public void onClick(DialogInterface dialog, int which) {
	// dialog.dismiss();
	// MainActivity.this.finish();
	// }
	// });
	// // 否定
	// builder.setNegativeButton("取消", new OnClickListener() {
	//
	// @Override
	// public void onClick(DialogInterface dialog, int which) {
	// dialog.dismiss();
	//
	// }
	// });
	// builder.create().show();
	// }

	/** 三个按钮 */

	// public void dialog() {
	// di = new AlertDialog.Builder(this)
	// .setIcon(android.R.drawable.ic_lock_idle_charging).setTitle("喜好调查")
	// .setMessage("你喜欢李连杰的电影吗")
	// .setPositiveButton("很喜欢", new OnClickListener() {
	//
	// @SuppressLint("ShowToast")
	// @Override
	// public void onClick(DialogInterface dialog, int which) {
	// // TODO Auto-generated method stub
	// Toast.makeText(MainActivity.this, "我蛮喜欢他电影的",
	// Toast.LENGTH_LONG).show();
	// }
	// });
	// di.setNegativeButton("NONONO", new OnClickListener() {
	//
	// @Override
	// public void onClick(DialogInterface dialog, int which) {
	// // TODO Auto-generated method stub
	// Toast.makeText(MainActivity.this, "我不喜欢他电影的", Toast.LENGTH_LONG)
	// .show();
	// }
	// });
	// di.setNeutralButton("一般般吧", new OnClickListener() {
	//
	// @Override
	// public void onClick(DialogInterface dialog, int which) {
	// // TODO Auto-generated method stub
	// Toast.makeText(MainActivity.this, "谈不上喜不喜欢", Toast.LENGTH_LONG)
	// .show();
	// }
	// });
	// di.create().show();
	// }
	/** 输入框 */
	// public void dialog() {
	// di = new AlertDialog.Builder(this).setTitle("请输入")
	// .setIcon(android.R.drawable.ic_lock_idle_charging)
	// .setView(new EditText(this)).setPositiveButton("确定", null)
	// .setNegativeButton("取消", null).show();
	//
	// }
	/** 单选框 */
	// public void dialog() {
	// di = new AlertDialog.Builder(this).setTitle("单选框")
	// .setIcon(android.R.drawable.alert_dark_frame)
	// .setSingleChoiceItems(new String[]{"one","two"}, 0
	// , new DialogInterface.OnClickListener() {
	//
	// @Override
	// public void onClick(DialogInterface dialog, int which) {
	// // TODO Auto-generated method stub
	// dialog.dismiss();
	// }
	// });
	// di.setNegativeButton("取消", null).show();
	//
	// }
	/** 多选框 */
	// public void dialog() {
	// di = new AlertDialog.Builder(this).setTitle("多选框")
	// .setMultiChoiceItems(new String[]{"one","two"}, null, null)
	// .setPositiveButton("确定", null)
	// .setPositiveButton("取消", null).show();
	// }

	/** 多选框 */
	// public void dialog() {
	// di = new AlertDialog.Builder(this).setTitle("列表框")
	// .setItems(new String[]{"one","two"}, null)
	// .setNegativeButton("确定", null).show();
	//
	// }

	/** 自定义布局框 */
	public void dialog() {
		LayoutInflater inflater = getLayoutInflater();
		View layout = inflater.inflate(R.layout.activity_main,
				(ViewGroup) findViewById(R.id.dialog));
		di = new AlertDialog.Builder(this).setTitle("自定义布局").setView(layout)
				.setPositiveButton("确定", null).setNegativeButton("取消", null)
				.show();
	}

	/** onkeydown 事件会在用户按下一个键盘按键时发生 */
	public boolean onKeyDown(int KeyCode, KeyEvent event) {
		if (KeyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
			dialog();
		}
		return false;
	}
}
