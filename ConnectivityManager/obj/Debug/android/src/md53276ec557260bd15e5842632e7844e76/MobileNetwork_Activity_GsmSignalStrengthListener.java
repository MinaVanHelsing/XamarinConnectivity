package md53276ec557260bd15e5842632e7844e76;


public class MobileNetwork_Activity_GsmSignalStrengthListener
	extends android.telephony.PhoneStateListener
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSignalStrengthsChanged:(Landroid/telephony/SignalStrength;)V:GetOnSignalStrengthsChanged_Landroid_telephony_SignalStrength_Handler\n" +
			"";
		mono.android.Runtime.register ("ConnectivityManager.MobileNetwork_Activity+GsmSignalStrengthListener, ConnectivityManager", MobileNetwork_Activity_GsmSignalStrengthListener.class, __md_methods);
	}


	public MobileNetwork_Activity_GsmSignalStrengthListener ()
	{
		super ();
		if (getClass () == MobileNetwork_Activity_GsmSignalStrengthListener.class)
			mono.android.TypeManager.Activate ("ConnectivityManager.MobileNetwork_Activity+GsmSignalStrengthListener, ConnectivityManager", "", this, new java.lang.Object[] {  });
	}


	public void onSignalStrengthsChanged (android.telephony.SignalStrength p0)
	{
		n_onSignalStrengthsChanged (p0);
	}

	private native void n_onSignalStrengthsChanged (android.telephony.SignalStrength p0);

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
