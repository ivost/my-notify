# my-notify
testing ms app center with push notifications on android / FCM

# android notifications
InstallId: faaeb0b5-6fd8-4451-8794-0eacbcf02ea1

---
https://console.firebase.google.com/u/0/project/mynotificationsapp-e3a8c/notification

Server key
AAAAjVD7CXM:APA91bHPy3-a7LZrnewyVzsH4veeHbwLZ6nBih1_3dVAlGHX_8La0iq7Mp1XCNaIM5P9oCfx4MTSIBhgP0--hAfk5uu03Bz8bU-tWmwfD1tBw9vRuJryE-CBexpe6FKpmia-drR5UM6b

onTokenRefresh: fnH8hlm6Z1Q:APA91bEWMwpduvZgDWMl3ItJxfUrvYkNvixrxGrcco7WM370nA2KXxUKmF9i8PspyaZG6gz3ir5M02XrtjNQcWnPbqi2yo_GfNf8Dy1AQPraAeGc9l6h0qi-BqkETr4PpnLvaR9aCBnv

AAAAjVD7CXM:APA91bHPy3-a7LZrnewyVzsH4veeHbwLZ6nBih1_3dVAlGHX_8La0iq7Mp1XCNaIM5P9oCfx4MTSIBhgP0--hAfk5uu03Bz8bU-tWmwfD1tBw9vRuJryE-CBexpe6FKpmia-drR5UM6b

curl -X POST \
  https://fcm.googleapis.com/fcm/send \
  -H 'Authorization: key=AAAAjVD7CXM:APA91bHPy3-a7LZrnewyVzsH4veeHbwLZ6nBih1_3dVAlGHX_8La0iq7Mp1XCNaIM5P9oCfx4MTSIBhgP0--hAfk5uu03Bz8bU-tWmwfD1tBw9vRuJryE-CBexpe6FKpmia-drR5UM6b' \
  -H 'Cache-Control: no-cache' \
  -H 'Content-Type: application/json' \
  -H 'Postman-Token: 7991a47c-8300-4dc8-a923-3f123a200df2' \
  -d '{
	"to" : "fnH8hlm6Z1Q:APA91bEWMwpduvZgDWMl3ItJxfUrvYkNvixrxGrcco7WM370nA2KXxUKmF9i8PspyaZG6gz3ir5M02XrtjNQcWnPbqi2yo_GfNf8Dy1AQPraAeGc9l6h0qi-BqkETr4PpnLvaR9aCBnv",
	"collapse_key" : "type_a",
	"data" : {
		"body" : "Another",
		"title": "ALT App Testing",
		"key_1" : "Data for key one",
		"key_2" : "Hello WORLD"
	}
}'


---
[About FCM Messages  |  Firebase](https://firebase.google.com/docs/cloud-messaging/concept-options?authuser=0#notifications_and_data_messages

[Firebase Android Codelab](https://codelabs.developers.google.com/codelabs/firebase-android/?authuser=0#0

git clone https://github.com/firebase/friendlychat-android

keytool -exportcert -alias androiddebugkey -keystore ~/.android/debug.keystore -list -v -storepass android

Certificate fingerprints:
	 MD5:  18:68:9A:06:EC:45:F2:F8:17:41:B9:30:54:3B:19:8B
	 SHA1: AB:02:64:C0:60:71:A3:BC:CC:2E:37:CC:B8:A1:05:EE:14:3E:04:2C
	 SHA256: 60:95:71:69:F2:F2:2E:4A:FD:B9:05:56:D5:DB:D8:39:1B:68:2B:F0:B6:0E:BC:37:9B:54:73:3B:55:6A:D4:82


Server key
AAAAB2-vmfs:APA91bFnvYHUc3pvyjZPDGdG3wal866a8pXCIq93j5ugVrAk0l_K4u_96rALcr8DR4tkWBv1319_5Oq_9W4GapxMZ4LYI8sgc2Pv5MfuM1N0f-B_7CYt0mZDRbiYpctTkKfqJAndIEjM

Legacy server key
AIzaSyAA6l8-_dm0WRn-H1CR2TRXy5twrF9Z8Wo

Sender id
31938550267



[Notifications - Patterns - Material Design](https://material.io/guidelines/patterns/notifications.html

[Start an Activity from a Notification  |  Android Developers](https://developer.android.com/training/notify-user/navigation

---
[How to add Push Notification capability to your Android app](https://medium.com/@nileshsingh/how-to-add-push-notification-capability-to-your-android-app-a3cac745e56e

[Context Neutral | Home](https://contextneutral.com/?utm_medium=notification&utm_source=medium

https://developer.android.com/reference/android/content/Context

---
[How to handle FCM notification in backgrounded Android applications](https://medium.com/@shayan.ta69/how-to-handle-fcm-notification-in-backgrounded-android-applications-29229c4f9975

[GitHub - shayantabatabaee/Espionage](https://github.com/shayantabatabaee/Espionage


[Firebase Cloud Messaging: Handling tokens and notifications with Node.js](https://medium.com/@nileshsingh/firebase-cloud-messaging-handling-tokens-and-notifications-with-node-js-32d64c83fd57

[Test FCM Notification with POSTMAN like PRO! – Android School – Medium](https://medium.com/android-school/test-fcm-notification-with-postman-f91ba08aacc3

[Sign in - Google Accounts](https://console.firebase.google.com/u/0/project/_/notification/compose


[Send your First Message to a Backgrounded App  |  Firebase](https://firebase.google.com/docs/cloud-messaging/android/first-message?authuser=0#access_the_registration_token

[How To Send Firebase Push Notification From App Server Tutorial](http://developine.com/how-to-send-firebase-push-notifications-from-app-server-tutorial/

