package mono.io.vov.vitamio;


public class MediaPlayer_OnPreparedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.vov.vitamio.MediaPlayer.OnPreparedListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onPrepared:(Lio/vov/vitamio/MediaPlayer;)V:GetOnPrepared_Lio_vov_vitamio_MediaPlayer_Handler:IO.Vov.Vitamio.MediaPlayer/IOnPreparedListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"";
		mono.android.Runtime.register ("IO.Vov.Vitamio.MediaPlayer+IOnPreparedListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlayer_OnPreparedListenerImplementor.class, __md_methods);
	}


	public MediaPlayer_OnPreparedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlayer_OnPreparedListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Vov.Vitamio.MediaPlayer+IOnPreparedListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onPrepared (io.vov.vitamio.MediaPlayer p0)
	{
		n_onPrepared (p0);
	}

	private native void n_onPrepared (io.vov.vitamio.MediaPlayer p0);

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
