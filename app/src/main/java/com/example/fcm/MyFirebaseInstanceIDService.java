package com.example.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
	private static final String TAG = "MyFirebaseIIDService";

	@Override
	public void onTokenRefresh() {
		super.onTokenRefresh();

		String refreshedToken = FirebaseInstanceId.getInstance().getToken();
		Log.d(TAG, "Refreshed token: " + refreshedToken);

		sendRegistrationToServer(refreshedToken);
	}

	private void sendRegistrationToServer(String token) {
		// Add custom implementation, as needed.
	}

	/*
	The token may be rotated whenever:
	1. The app deletes Instance ID
	2. The app is restored on a new device
	3. The user uninstalls/reinstall the app
	4. The user clears app data.
	*/
}