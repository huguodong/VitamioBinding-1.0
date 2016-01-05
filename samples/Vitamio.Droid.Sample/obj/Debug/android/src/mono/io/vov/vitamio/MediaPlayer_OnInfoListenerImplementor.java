package mono.io.vov.vitamio;


public class MediaPlayer_OnInfoListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.vov.vitamio.MediaPlayer.OnInfoListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onInfo:(Lio/vov/vitamio/MediaPlayer;II)Z:GetOnInfo_Lio_vov_vitamio_MediaPlayer_IIHandler:IO.Vov.Vitamio.MediaPlayer/IOnInfoListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"";
		mono.android.Runtime.register ("IO.Vov.Vitamio.MediaPlayer+IOnInfoListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlayer_OnInfoListenerImplementor.class, __md_methods);
	}


	public MediaPlayer_OnInfoListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlayer_OnInfoListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Vov.Vitamio.MediaPlayer+IOnInfoListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public boolean onInfo (io.vov.vitamio.MediaPlayer p0, int p1, int p2)
	{
		return n_onInfo (p0, p1, p2);
	}

	private native boolean n_onInfo (io.vov.vitamio.MediaPlayer p0, int p1, int p2);

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
