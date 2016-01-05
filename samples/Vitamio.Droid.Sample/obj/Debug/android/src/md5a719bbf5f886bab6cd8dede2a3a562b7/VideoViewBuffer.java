package md5a719bbf5f886bab6cd8dede2a3a562b7;


public class VideoViewBuffer
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer,
		io.vov.vitamio.MediaPlayer.OnInfoListener,
		io.vov.vitamio.MediaPlayer.OnBufferingUpdateListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onInfo:(Lio/vov/vitamio/MediaPlayer;II)Z:GetOnInfo_Lio_vov_vitamio_MediaPlayer_IIHandler:IO.Vov.Vitamio.MediaPlayer/IOnInfoListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"n_onBufferingUpdate:(Lio/vov/vitamio/MediaPlayer;I)V:GetOnBufferingUpdate_Lio_vov_vitamio_MediaPlayer_IHandler:IO.Vov.Vitamio.MediaPlayer/IOnBufferingUpdateListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"";
		mono.android.Runtime.register ("IO.Vov.Vitamio.Demo.VideoViewBuffer, VitamioDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", VideoViewBuffer.class, __md_methods);
	}


	public VideoViewBuffer () throws java.lang.Throwable
	{
		super ();
		if (getClass () == VideoViewBuffer.class)
			mono.android.TypeManager.Activate ("IO.Vov.Vitamio.Demo.VideoViewBuffer, VitamioDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public boolean onInfo (io.vov.vitamio.MediaPlayer p0, int p1, int p2)
	{
		return n_onInfo (p0, p1, p2);
	}

	private native boolean n_onInfo (io.vov.vitamio.MediaPlayer p0, int p1, int p2);


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
