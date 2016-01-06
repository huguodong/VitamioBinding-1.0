package mono.io.vov.vitamio;


public class MediaPlayer_OnBufferingUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.vov.vitamio.MediaPlayer.OnBufferingUpdateListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onBufferingUpdate:(Lio/vov/vitamio/MediaPlayer;I)V:GetOnBufferingUpdate_Lio_vov_vitamio_MediaPlayer_IHandler:IO.Vov.Vitamio.MediaPlayer/IOnBufferingUpdateListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"";
		mono.android.Runtime.register ("IO.Vov.Vitamio.MediaPlayer+IOnBufferingUpdateListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlayer_OnBufferingUpdateListenerImplementor.class, __md_methods);
	}


	public MediaPlayer_OnBufferingUpdateListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlayer_OnBufferingUpdateListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Vov.Vitamio.MediaPlayer+IOnBufferingUpdateListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onBufferingUpdate (io.vov.vitamio.MediaPlayer p0, int p1)
	{
		n_onBufferingUpdate (p0, p1);
	}

	private native void n_onBufferingUpdate (io.vov.vitamio.MediaPlayer p0, int p1);

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
