package mono.io.vov.vitamio;


public class MediaPlayer_OnHWRenderFailedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.vov.vitamio.MediaPlayer.OnHWRenderFailedListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onFailed:()V:GetOnFailedHandler:IO.Vov.Vitamio.MediaPlayer/IOnHWRenderFailedListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"";
		mono.android.Runtime.register ("IO.Vov.Vitamio.MediaPlayer+IOnHWRenderFailedListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlayer_OnHWRenderFailedListenerImplementor.class, __md_methods);
	}


	public MediaPlayer_OnHWRenderFailedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlayer_OnHWRenderFailedListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Vov.Vitamio.MediaPlayer+IOnHWRenderFailedListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onFailed ()
	{
		n_onFailed ();
	}

	private native void n_onFailed ();

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
