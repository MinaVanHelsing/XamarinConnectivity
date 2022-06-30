using System;
using Android.App;
using Android.Content;
using Android.OS;
using Android.Telephony;
using Android.Widget;

namespace ConnectivityManager
{
    [Activity(Label = "Mobile Network Signal Strength", ScreenOrientation = Android.Content.PM.ScreenOrientation.Portrait, Theme = "@android:style/Theme.Holo.NoActionBar")]

    public class MobileNetwork_Activity : Activity
    {
        private TelephonyManager telephonyManager;
        private GsmSignalStrengthListener signalStrengthListener;
        private Button btnGetSignalStrength;
        private TextView gsmStrengthTextView;
        private ImageView gsmStrengthImageView;         

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            SetContentView(Resource.Layout.NetworkSignal);

            // Get a reference to the TelephonyManager and instantiate the GsmSignalStrengthListener.
            // These will be used by the Button's OnClick event handler.
            telephonyManager = (TelephonyManager)GetSystemService(Context.TelephonyService);
            signalStrengthListener = new GsmSignalStrengthListener();

            gsmStrengthTextView = FindViewById<TextView>(Resource.Id.textViewMN);
            gsmStrengthImageView = FindViewById<ImageView>(Resource.Id.imageViewMN);
            btnGetSignalStrength = FindViewById<Button>(Resource.Id.btnGetSignalStrength);

            btnGetSignalStrength.Click += DisplaySignalStrength;
        }

        void DisplaySignalStrength(object sender, EventArgs e)
        {
            telephonyManager.Listen(signalStrengthListener, PhoneStateListenerFlags.SignalStrengths);
            signalStrengthListener.SignalStrengthChanged += HandleSignalStrengthChanged;
        }

        void HandleSignalStrengthChanged(int strength)
        {
            // We want this to be a one-shot thing when the button is pushed. Make sure to unhook everything
            signalStrengthListener.SignalStrengthChanged -= HandleSignalStrengthChanged;
            telephonyManager.Listen(signalStrengthListener, PhoneStateListenerFlags.None);

            // Update the UI with text and an image.
            gsmStrengthImageView.SetImageLevel(strength);
            gsmStrengthTextView.Text = string.Format("Network Signal Strength ({0}):", strength);
        }
        public class GsmSignalStrengthListener : PhoneStateListener
        {
            public delegate void SignalStrengthChangedDelegate(int strength);

            public event SignalStrengthChangedDelegate SignalStrengthChanged;

            public override void OnSignalStrengthsChanged(SignalStrength newSignalStrength)
            {
                if (newSignalStrength.IsGsm)
                {
                    if (SignalStrengthChanged != null)
                    {
                        SignalStrengthChanged(newSignalStrength.GsmSignalStrength);
                    }
                }
            }
        }
    }
}