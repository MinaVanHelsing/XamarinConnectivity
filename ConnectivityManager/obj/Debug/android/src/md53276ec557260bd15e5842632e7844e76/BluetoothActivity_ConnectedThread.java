package md53276ec557260bd15e5842632e7844e76;


public class BluetoothActivity_ConnectedThread
	extends java.lang.Thread
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_run:()V:GetRunHandler\n" +
			"";
		mono.android.Runtime.register ("ConnectivityManager.BluetoothActivity+ConnectedThread, ConnectivityManager", BluetoothActivity_ConnectedThread.class, __md_methods);
	}


	public BluetoothActivity_ConnectedThread ()
	{
		super ();
		if (getClass () == BluetoothActivity_ConnectedThread.class)
			mono.android.TypeManager.Activate ("ConnectivityManager.BluetoothActivity+ConnectedThread, ConnectivityManager", "", this, new java.lang.Object[] {  });
	}


	public BluetoothActivity_ConnectedThread (java.lang.Runnable p0)
	{
		super (p0);
		if (getClass () == BluetoothActivity_ConnectedThread.class)
			mono.android.TypeManager.Activate ("ConnectivityManager.BluetoothActivity+ConnectedThread, ConnectivityManager", "Java.Lang.IRunnable, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public BluetoothActivity_ConnectedThread (java.lang.Runnable p0, java.lang.String p1)
	{
		super (p0, p1);
		if (getClass () == BluetoothActivity_ConnectedThread.class)
			mono.android.TypeManager.Activate ("ConnectivityManager.BluetoothActivity+ConnectedThread, ConnectivityManager", "Java.Lang.IRunnable, Mono.Android:System.String, mscorlib", this, new java.lang.Object[] { p0, p1 });
	}


	public BluetoothActivity_ConnectedThread (java.lang.String p0)
	{
		super (p0);
		if (getClass () == BluetoothActivity_ConnectedThread.class)
			mono.android.TypeManager.Activate ("ConnectivityManager.BluetoothActivity+ConnectedThread, ConnectivityManager", "System.String, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public BluetoothActivity_ConnectedThread (java.lang.ThreadGroup p0, java.lang.Runnable p1)
	{
		super (p0, p1);
		if (getClass () == BluetoothActivity_ConnectedThread.class)
			mono.android.TypeManager.Activate ("ConnectivityManager.BluetoothActivity+ConnectedThread, ConnectivityManager", "Java.Lang.ThreadGroup, Mono.Android:Java.Lang.IRunnable, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public BluetoothActivity_ConnectedThread (java.lang.ThreadGroup p0, java.lang.Runnable p1, java.lang.String p2)
	{
		super (p0, p1, p2);
		if (getClass () == BluetoothActivity_ConnectedThread.class)
			mono.android.TypeManager.Activate ("ConnectivityManager.BluetoothActivity+ConnectedThread, ConnectivityManager", "Java.Lang.ThreadGroup, Mono.Android:Java.Lang.IRunnable, Mono.Android:System.String, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public BluetoothActivity_ConnectedThread (java.lang.ThreadGroup p0, java.lang.Runnable p1, java.lang.String p2, long p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == BluetoothActivity_ConnectedThread.class)
			mono.android.TypeManager.Activate ("ConnectivityManager.BluetoothActivity+ConnectedThread, ConnectivityManager", "Java.Lang.ThreadGroup, Mono.Android:Java.Lang.IRunnable, Mono.Android:System.String, mscorlib:System.Int64, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public BluetoothActivity_ConnectedThread (java.lang.ThreadGroup p0, java.lang.String p1)
	{
		super (p0, p1);
		if (getClass () == BluetoothActivity_ConnectedThread.class)
			mono.android.TypeManager.Activate ("ConnectivityManager.BluetoothActivity+ConnectedThread, ConnectivityManager", "Java.Lang.ThreadGroup, Mono.Android:System.String, mscorlib", this, new java.lang.Object[] { p0, p1 });
	}

	public BluetoothActivity_ConnectedThread (android.bluetooth.BluetoothSocket p0)
	{
		super ();
		if (getClass () == BluetoothActivity_ConnectedThread.class)
			mono.android.TypeManager.Activate ("ConnectivityManager.BluetoothActivity+ConnectedThread, ConnectivityManager", "Android.Bluetooth.BluetoothSocket, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public void run ()
	{
		n_run ();
	}

	private native void n_run ();

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
