package com.android.negativeb.ontime;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AlarmsControlFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_alarms_control, container, false);



		return rootView;
	}
}
