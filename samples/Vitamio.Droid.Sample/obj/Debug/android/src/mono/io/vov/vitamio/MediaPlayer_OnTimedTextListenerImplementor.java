package mono.io.vov.vitamio;


public class MediaPlayer_OnTimedTextListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.vov.vitamio.MediaPlayer.OnTimedTextListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onTimedText:(Ljava/lang/String;)V:GetOnTimedText_Ljava_lang_String_Handler:IO.Vov.Vitamio.MediaPlayer/IOnTimedTextListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"n_onTimedTextUpdate:([BII)V:GetOnTimedTextUpdate_arrayBIIHandler:IO.Vov.Vitamio.MediaPlayer/IOnTimedTextListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"";
		mono.android.Runtime.register ("IO.Vov.Vitamio.MediaPlayer+IOnTimedTextListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlayer_OnTimedTextListenerImplementor.class, __md_methods);
	}


	public MediaPlayer_OnTimedTextListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlayer_OnTimedTextListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Vov.Vitamio.MediaPlayer+IOnTimedTextListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onTimedText (java.lang.String p0)
	{
		n_onTimedText (p0);
	}

	private native void n_onTimedText (java.lang.String p0);


	public void onTimedTextUpdate (byte[] p0, int p1, int p2)
	{
		n_onTimedTextUpdate (p0, p1, p2);
	}

	private native void n_onTimedTextUpdate (byte[] p0, int p1, int p2);

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
