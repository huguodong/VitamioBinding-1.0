package mono.io.vov.vitamio;


public class MediaPlayer_OnVideoSizeChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.vov.vitamio.MediaPlayer.OnVideoSizeChangedListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onVideoSizeChanged:(Lio/vov/vitamio/MediaPlayer;II)V:GetOnVideoSizeChanged_Lio_vov_vitamio_MediaPlayer_IIHandler:IO.Vov.Vitamio.MediaPlayer/IOnVideoSizeChangedListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"";
		mono.android.Runtime.register ("IO.Vov.Vitamio.MediaPlayer+IOnVideoSizeChangedListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlayer_OnVideoSizeChangedListenerImplementor.class, __md_methods);
	}


	public MediaPlayer_OnVideoSizeChangedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlayer_OnVideoSizeChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Vov.Vitamio.MediaPlayer+IOnVideoSizeChangedListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onVideoSizeChanged (io.vov.vitamio.MediaPlayer p0, int p1, int p2)
	{
		n_onVideoSizeChanged (p0, p1, p2);
	}

	private native void n_onVideoSizeChanged (io.vov.vitamio.MediaPlayer p0, int p1, int p2);

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
