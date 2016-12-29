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

	/** Ĭ����ʾ�� */
	// protected void dialog() {
	// AlertDialog.Builder builder = new Builder(MainActivity.this);
	// builder.setMessage("ȷ���˳����ǰ�");
	// builder.setTitle("��ʾ");
	// // ȷ��
	// builder.setPositiveButton("ȷ��", new OnClickListener() {
	//
	// @Override
	// public void onClick(DialogInterface dialog, int which) {
	// dialog.dismiss();
	// MainActivity.this.finish();
	// }
	// });
	// // ��
	// builder.setNegativeButton("ȡ��", new OnClickListener() {
	//
	// @Override
	// public void onClick(DialogInterface dialog, int which) {
	// dialog.dismiss();
	//
	// }
	// });
	// builder.create().show();
	// }

	/** ������ť */

	// public void dialog() {
	// di = new AlertDialog.Builder(this)
	// .setIcon(android.R.drawable.ic_lock_idle_charging).setTitle("ϲ�õ���")
	// .setMessage("��ϲ�������ܵĵ�Ӱ��")
	// .setPositiveButton("��ϲ��", new OnClickListener() {
	//
	// @SuppressLint("ShowToast")
	// @Override
	// public void onClick(DialogInterface dialog, int which) {
	// // TODO Auto-generated method stub
	// Toast.makeText(MainActivity.this, "����ϲ������Ӱ��",
	// Toast.LENGTH_LONG).show();
	// }
	// });
	// di.setNegativeButton("NONONO", new OnClickListener() {
	//
	// @Override
	// public void onClick(DialogInterface dialog, int which) {
	// // TODO Auto-generated method stub
	// Toast.makeText(MainActivity.this, "�Ҳ�ϲ������Ӱ��", Toast.LENGTH_LONG)
	// .show();
	// }
	// });
	// di.setNeutralButton("һ����", new OnClickListener() {
	//
	// @Override
	// public void onClick(DialogInterface dialog, int which) {
	// // TODO Auto-generated method stub
	// Toast.makeText(MainActivity.this, "̸����ϲ��ϲ��", Toast.LENGTH_LONG)
	// .show();
	// }
	// });
	// di.create().show();
	// }
	/** ����� */
	// public void dialog() {
	// di = new AlertDialog.Builder(this).setTitle("������")
	// .setIcon(android.R.drawable.ic_lock_idle_charging)
	// .setView(new EditText(this)).setPositiveButton("ȷ��", null)
	// .setNegativeButton("ȡ��", null).show();
	//
	// }
	/** ��ѡ�� */
	// public void dialog() {
	// di = new AlertDialog.Builder(this).setTitle("��ѡ��")
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
	// di.setNegativeButton("ȡ��", null).show();
	//
	// }
	/** ��ѡ�� */
	// public void dialog() {
	// di = new AlertDialog.Builder(this).setTitle("��ѡ��")
	// .setMultiChoiceItems(new String[]{"one","two"}, null, null)
	// .setPositiveButton("ȷ��", null)
	// .setPositiveButton("ȡ��", null).show();
	// }

	/** ��ѡ�� */
	// public void dialog() {
	// di = new AlertDialog.Builder(this).setTitle("�б��")
	// .setItems(new String[]{"one","two"}, null)
	// .setNegativeButton("ȷ��", null).show();
	//
	// }

	/** �Զ��岼�ֿ� */
	public void dialog() {
		LayoutInflater inflater = getLayoutInflater();
		View layout = inflater.inflate(R.layout.activity_main,
				(ViewGroup) findViewById(R.id.dialog));
		di = new AlertDialog.Builder(this).setTitle("�Զ��岼��").setView(layout)
				.setPositiveButton("ȷ��", null).setNegativeButton("ȡ��", null)
				.show();
	}

	/** onkeydown �¼������û�����һ�����̰���ʱ���� */
	public boolean onKeyDown(int KeyCode, KeyEvent event) {
		if (KeyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
			dialog();
		}
		return false;
	}
}
