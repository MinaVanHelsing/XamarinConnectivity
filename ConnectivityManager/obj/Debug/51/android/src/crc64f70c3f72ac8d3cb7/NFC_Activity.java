package crc64f70c3f72ac8d3cb7;


public class NFC_Activity
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer,
		android.nfc.NfcAdapter.CreateNdefMessageCallback,
		android.nfc.NfcAdapter.OnNdefPushCompleteCallback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onResume:()V:GetOnResumeHandler\n" +
			"n_onNewIntent:(Landroid/content/Intent;)V:GetOnNewIntent_Landroid_content_Intent_Handler\n" +
			"n_onPause:()V:GetOnPauseHandler\n" +
			"n_onDestroy:()V:GetOnDestroyHandler\n" +
			"n_createNdefMessage:(Landroid/nfc/NfcEvent;)Landroid/nfc/NdefMessage;:GetCreateNdefMessage_Landroid_nfc_NfcEvent_Handler:Android.Nfc.NfcAdapter/ICreateNdefMessageCallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onNdefPushComplete:(Landroid/nfc/NfcEvent;)V:GetOnNdefPushComplete_Landroid_nfc_NfcEvent_Handler:Android.Nfc.NfcAdapter/IOnNdefPushCompleteCallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("ConnectivityManager.NFC_Activity, ConnectivityManager", NFC_Activity.class, __md_methods);
	}


	public NFC_Activity ()
	{
		super ();
		if (getClass () == NFC_Activity.class) {
			mono.android.TypeManager.Activate ("ConnectivityManager.NFC_Activity, ConnectivityManager", "", this, new java.lang.Object[] {  });
		}
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();


	public void onNewIntent (android.content.Intent p0)
	{
		n_onNewIntent (p0);
	}

	private native void n_onNewIntent (android.content.Intent p0);


	public void onPause ()
	{
		n_onPause ();
	}

	private native void n_onPause ();


	public void onDestroy ()
	{
		n_onDestroy ();
	}

	private native void n_onDestroy ();


	public android.nfc.NdefMessage createNdefMessage (android.nfc.NfcEvent p0)
	{
		return n_createNdefMessage (p0);
	}

	private native android.nfc.NdefMessage n_createNdefMessage (android.nfc.NfcEvent p0);


	public void onNdefPushComplete (android.nfc.NfcEvent p0)
	{
		n_onNdefPushComplete (p0);
	}

	private native void n_onNdefPushComplete (android.nfc.NfcEvent p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
