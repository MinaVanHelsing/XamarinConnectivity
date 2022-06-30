package crc64f70c3f72ac8d3cb7;


public class NFC_Handler
	extends android.os.Handler
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_handleMessage:(Landroid/os/Message;)V:GetHandleMessage_Landroid_os_Message_Handler\n" +
			"";
		mono.android.Runtime.register ("ConnectivityManager.NFC_Handler, ConnectivityManager", NFC_Handler.class, __md_methods);
	}


	public NFC_Handler ()
	{
		super ();
		if (getClass () == NFC_Handler.class) {
			mono.android.TypeManager.Activate ("ConnectivityManager.NFC_Handler, ConnectivityManager", "", this, new java.lang.Object[] {  });
		}
	}


	public NFC_Handler (android.os.Handler.Callback p0)
	{
		super (p0);
		if (getClass () == NFC_Handler.class) {
			mono.android.TypeManager.Activate ("ConnectivityManager.NFC_Handler, ConnectivityManager", "Android.OS.Handler+ICallback, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}


	public NFC_Handler (android.os.Looper p0)
	{
		super (p0);
		if (getClass () == NFC_Handler.class) {
			mono.android.TypeManager.Activate ("ConnectivityManager.NFC_Handler, ConnectivityManager", "Android.OS.Looper, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}


	public NFC_Handler (android.os.Looper p0, android.os.Handler.Callback p1)
	{
		super (p0, p1);
		if (getClass () == NFC_Handler.class) {
			mono.android.TypeManager.Activate ("ConnectivityManager.NFC_Handler, ConnectivityManager", "Android.OS.Looper, Mono.Android:Android.OS.Handler+ICallback, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}


	public void handleMessage (android.os.Message p0)
	{
		n_handleMessage (p0);
	}

	private native void n_handleMessage (android.os.Message p0);

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
