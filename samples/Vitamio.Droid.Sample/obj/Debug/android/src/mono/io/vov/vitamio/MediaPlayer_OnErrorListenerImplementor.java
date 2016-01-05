package mono.io.vov.vitamio;


public class MediaPlayer_OnErrorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.vov.vitamio.MediaPlayer.OnErrorListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onError:(Lio/vov/vitamio/MediaPlayer;II)Z:GetOnError_Lio_vov_vitamio_MediaPlayer_IIHandler:IO.Vov.Vitamio.MediaPlayer/IOnErrorListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"";
		mono.android.Runtime.register ("IO.Vov.Vitamio.MediaPlayer+IOnErrorListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlayer_OnErrorListenerImplementor.class, __md_methods);
	}


	public MediaPlayer_OnErrorListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlayer_OnErrorListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Vov.Vitamio.MediaPlayer+IOnErrorListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public boolean onError (io.vov.vitamio.MediaPlayer p0, int p1, int p2)
	{
		return n_onError (p0, p1, p2);
	}

	private native boolean n_onError (io.vov.vitamio.MediaPlayer p0, int p1, int p2);

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
