package md5a719bbf5f886bab6cd8dede2a3a562b7;


public class MediaPlayerSubtitle
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer,
		android.view.SurfaceHolder.Callback,
		io.vov.vitamio.MediaPlayer.OnPreparedListener,
		io.vov.vitamio.MediaPlayer.OnTimedTextListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onPause:()V:GetOnPauseHandler\n" +
			"n_onDestroy:()V:GetOnDestroyHandler\n" +
			"n_surfaceChanged:(Landroid/view/SurfaceHolder;III)V:GetSurfaceChanged_Landroid_view_SurfaceHolder_IIIHandler:Android.Views.ISurfaceHolderCallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_surfaceCreated:(Landroid/view/SurfaceHolder;)V:GetSurfaceCreated_Landroid_view_SurfaceHolder_Handler:Android.Views.ISurfaceHolderCallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_surfaceDestroyed:(Landroid/view/SurfaceHolder;)V:GetSurfaceDestroyed_Landroid_view_SurfaceHolder_Handler:Android.Views.ISurfaceHolderCallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onPrepared:(Lio/vov/vitamio/MediaPlayer;)V:GetOnPrepared_Lio_vov_vitamio_MediaPlayer_Handler:IO.Vov.Vitamio.MediaPlayer/IOnPreparedListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"n_onTimedText:(Ljava/lang/String;)V:GetOnTimedText_Ljava_lang_String_Handler:IO.Vov.Vitamio.MediaPlayer/IOnTimedTextListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"n_onTimedTextUpdate:([BII)V:GetOnTimedTextUpdate_arrayBIIHandler:IO.Vov.Vitamio.MediaPlayer/IOnTimedTextListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"";
		mono.android.Runtime.register ("IO.Vov.Vitamio.Demo.MediaPlayerSubtitle, VitamioDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlayerSubtitle.class, __md_methods);
	}


	public MediaPlayerSubtitle () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlayerSubtitle.class)
			mono.android.TypeManager.Activate ("IO.Vov.Vitamio.Demo.MediaPlayerSubtitle, VitamioDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
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


	public void onDestroy ()
	{
		n_onDestroy ();
	}

	private native void n_onDestroy ();


	public void surfaceChanged (android.view.SurfaceHolder p0, int p1, int p2, int p3)
	{
		n_surfaceChanged (p0, p1, p2, p3);
	}

	private native void n_surfaceChanged (android.view.SurfaceHolder p0, int p1, int p2, int p3);


	public void surfaceCreated (android.view.SurfaceHolder p0)
	{
		n_surfaceCreated (p0);
	}

	private native void n_surfaceCreated (android.view.SurfaceHolder p0);


	public void surfaceDestroyed (android.view.SurfaceHolder p0)
	{
		n_surfaceDestroyed (p0);
	}

	private native void n_surfaceDestroyed (android.view.SurfaceHolder p0);


	public void onPrepared (io.vov.vitamio.MediaPlayer p0)
	{
		n_onPrepared (p0);
	}

	private native void n_onPrepared (io.vov.vitamio.MediaPlayer p0);


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
