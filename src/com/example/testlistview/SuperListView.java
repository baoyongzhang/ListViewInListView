package com.example.testlistview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;

/**
 * 
 * 
 * @author Baoyz
 * 
 * @date 2014-6-20 ÏÂÎç6:29:09
 */
public class SuperListView extends ListView {

	private int mTouchDownY;
	private int headerHeight;

	public SuperListView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public SuperListView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public SuperListView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		View header = getChildAt(0);
		switch (ev.getAction()) {
		case MotionEvent.ACTION_DOWN:
			mTouchDownY = (int) ev.getY();
			headerHeight = header.getHeight() + header.getTop();
			break;
		}
		if (mTouchDownY < headerHeight) {
			header.onTouchEvent(ev);
			return true;
		}
		return super.dispatchTouchEvent(ev);
	}
}
