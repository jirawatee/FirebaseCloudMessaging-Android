# FCM (Firebase Cloud Messaging)
FCM is just a demo of Android Application which implement Firebase Cloud Messaging. It made for Google I/O Extended 2016 Bangkok 

## Prerequisites
* Supported Android 2.3 (Gingerbread) and newer
* Google Play services 9.0.2 or newer
* Android Studio 1.5 or higher

## Features
* Subscribe to topics
* Get token
* Send message with payload both **notification** and **data**
* Send message with **a token**, **token group**, **a topic**, **condition**
* Handle message both **foreground** and **background**
* Customize notification

## Limitation in the message payload
* Notification : 2KB limit and a predefined set of user-visible keys
* Data : 4KB of custom key-value pairs

## Screenshots
<table>
	<tr>
	  <th><img src="https://cloud.githubusercontent.com/assets/1763410/16266043/04752642-38ad-11e6-9b2b-31a07c3e4cf7.png" width="50%"></th>
	  <th><img src="https://cloud.githubusercontent.com/assets/1763410/16266186/af018506-38ad-11e6-9976-352a50026874.png" width="50%"></th>
	</tr>
</table>

## Downstream message syntax
```
https://firebase.google.com/docs/cloud-messaging/http-server-ref#notification-payload-support
```
