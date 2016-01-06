package md5a719bbf5f886bab6cd8dede2a3a562b7;


public class VideoViewSubtitle
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer,
		io.vov.vitamio.MediaPlayer.OnTimedTextListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onPause:()V:GetOnPauseHandler\n" +
			"n_onResume:()V:GetOnResumeHandler\n" +
			"n_changeLayout:(Landroid/view/View;)V:__export__\n" +
			"n_onTimedText:(Ljava/lang/String;)V:GetOnTimedText_Ljava_lang_String_Handler:IO.Vov.Vitamio.MediaPlayer/IOnTimedTextListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"n_onTimedTextUpdate:([BII)V:GetOnTimedTextUpdate_arrayBIIHandler:IO.Vov.Vitamio.MediaPlayer/IOnTimedTextListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"";
		mono.android.Runtime.register ("IO.Vov.Vitamio.Demo.VideoViewSubtitle, VitamioDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", VideoViewSubtitle.class, __md_methods);
	}


	public VideoViewSubtitle () throws java.lang.Throwable
	{
		super ();
		if (getClass () == VideoViewSubtitle.class)
			mono.android.TypeManager.Activate ("IO.Vov.Vitamio.Demo.VideoViewSubtitle, VitamioDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onPause ()
	{
		n_onPause ();
	}

	private native void n_onPause ();


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();


	public void changeLayout (android.view.View p0)
	{
		n_changeLayout (p0);
	}

	private native void n_changeLayout (android.view.View p0);


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
