package mono.io.vov.vitamio;


public class MediaPlayer_OnCachingUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.vov.vitamio.MediaPlayer.OnCachingUpdateListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCachingComplete:(Lio/vov/vitamio/MediaPlayer;)V:GetOnCachingComplete_Lio_vov_vitamio_MediaPlayer_Handler:IO.Vov.Vitamio.MediaPlayer/IOnCachingUpdateListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"n_onCachingNotAvailable:(Lio/vov/vitamio/MediaPlayer;I)V:GetOnCachingNotAvailable_Lio_vov_vitamio_MediaPlayer_IHandler:IO.Vov.Vitamio.MediaPlayer/IOnCachingUpdateListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"n_onCachingSpeed:(Lio/vov/vitamio/MediaPlayer;I)V:GetOnCachingSpeed_Lio_vov_vitamio_MediaPlayer_IHandler:IO.Vov.Vitamio.MediaPlayer/IOnCachingUpdateListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"n_onCachingStart:(Lio/vov/vitamio/MediaPlayer;)V:GetOnCachingStart_Lio_vov_vitamio_MediaPlayer_Handler:IO.Vov.Vitamio.MediaPlayer/IOnCachingUpdateListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"n_onCachingUpdate:(Lio/vov/vitamio/MediaPlayer;[J)V:GetOnCachingUpdate_Lio_vov_vitamio_MediaPlayer_arrayJHandler:IO.Vov.Vitamio.MediaPlayer/IOnCachingUpdateListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"";
		mono.android.Runtime.register ("IO.Vov.Vitamio.MediaPlayer+IOnCachingUpdateListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlayer_OnCachingUpdateListenerImplementor.class, __md_methods);
	}


	public MediaPlayer_OnCachingUpdateListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlayer_OnCachingUpdateListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Vov.Vitamio.MediaPlayer+IOnCachingUpdateListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCachingComplete (io.vov.vitamio.MediaPlayer p0)
	{
		n_onCachingComplete (p0);
	}

	private native void n_onCachingComplete (io.vov.vitamio.MediaPlayer p0);


	public void onCachingNotAvailable (io.vov.vitamio.MediaPlayer p0, int p1)
	{
		n_onCachingNotAvailable (p0, p1);
	}

	private native void n_onCachingNotAvailable (io.vov.vitamio.MediaPlayer p0, int p1);


	public void onCachingSpeed (io.vov.vitamio.MediaPlayer p0, int p1)
	{
		n_onCachingSpeed (p0, p1);
	}

	private native void n_onCachingSpeed (io.vov.vitamio.MediaPlayer p0, int p1);


	public void onCachingStart (io.vov.vitamio.MediaPlayer p0)
	{
		n_onCachingStart (p0);
	}

	private native void n_onCachingStart (io.vov.vitamio.MediaPlayer p0);


	public void onCachingUpdate (io.vov.vitamio.MediaPlayer p0, long[] p1)
	{
		n_onCachingUpdate (p0, p1);
	}

	private native void n_onCachingUpdate (io.vov.vitamio.MediaPlayer p0, long[] p1);

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
