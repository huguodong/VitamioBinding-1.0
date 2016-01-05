package mono.io.vov.vitamio;


public class MediaPlayer_OnSeekCompleteListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.vov.vitamio.MediaPlayer.OnSeekCompleteListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onSeekComplete:(Lio/vov/vitamio/MediaPlayer;)V:GetOnSeekComplete_Lio_vov_vitamio_MediaPlayer_Handler:IO.Vov.Vitamio.MediaPlayer/IOnSeekCompleteListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"";
		mono.android.Runtime.register ("IO.Vov.Vitamio.MediaPlayer+IOnSeekCompleteListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlayer_OnSeekCompleteListenerImplementor.class, __md_methods);
	}


	public MediaPlayer_OnSeekCompleteListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlayer_OnSeekCompleteListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Vov.Vitamio.MediaPlayer+IOnSeekCompleteListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onSeekComplete (io.vov.vitamio.MediaPlayer p0)
	{
		n_onSeekComplete (p0);
	}

	private native void n_onSeekComplete (io.vov.vitamio.MediaPlayer p0);

	java.util.ArrayList refList;
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
