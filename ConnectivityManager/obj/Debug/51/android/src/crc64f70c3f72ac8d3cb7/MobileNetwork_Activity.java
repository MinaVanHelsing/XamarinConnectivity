package crc64f70c3f72ac8d3cb7;


public class MobileNetwork_Activity
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("ConnectivityManager.MobileNetwork_Activity, ConnectivityManager", MobileNetwork_Activity.class, __md_methods);
	}


	public MobileNetwork_Activity ()
	{
		super ();
		if (getClass () == MobileNetwork_Activity.class) {
			mono.android.TypeManager.Activate ("ConnectivityManager.MobileNetwork_Activity, ConnectivityManager", "", this, new java.lang.Object[] {  });
		}
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

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
