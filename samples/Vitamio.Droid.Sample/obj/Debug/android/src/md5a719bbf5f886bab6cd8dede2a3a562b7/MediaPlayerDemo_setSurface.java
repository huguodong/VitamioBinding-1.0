package md5a719bbf5f886bab6cd8dede2a3a562b7;


public class MediaPlayerDemo_setSurface
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer,
		io.vov.vitamio.MediaPlayer.OnBufferingUpdateListener,
		io.vov.vitamio.MediaPlayer.OnCompletionListener,
		io.vov.vitamio.MediaPlayer.OnPreparedListener,
		android.view.TextureView.SurfaceTextureListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onPause:()V:GetOnPauseHandler\n" +
			"n_onDestroy:()V:GetOnDestroyHandler\n" +
			"n_onBufferingUpdate:(Lio/vov/vitamio/MediaPlayer;I)V:GetOnBufferingUpdate_Lio_vov_vitamio_MediaPlayer_IHandler:IO.Vov.Vitamio.MediaPlayer/IOnBufferingUpdateListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"n_onCompletion:(Lio/vov/vitamio/MediaPlayer;)V:GetOnCompletion_Lio_vov_vitamio_MediaPlayer_Handler:IO.Vov.Vitamio.MediaPlayer/IOnCompletionListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"n_onPrepared:(Lio/vov/vitamio/MediaPlayer;)V:GetOnPrepared_Lio_vov_vitamio_MediaPlayer_Handler:IO.Vov.Vitamio.MediaPlayer/IOnPreparedListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"n_onSurfaceTextureAvailable:(Landroid/graphics/SurfaceTexture;II)V:GetOnSurfaceTextureAvailable_Landroid_graphics_SurfaceTexture_IIHandler:Android.Views.TextureView/ISurfaceTextureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onSurfaceTextureDestroyed:(Landroid/graphics/SurfaceTexture;)Z:GetOnSurfaceTextureDestroyed_Landroid_graphics_SurfaceTexture_Handler:Android.Views.TextureView/ISurfaceTextureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onSurfaceTextureSizeChanged:(Landroid/graphics/SurfaceTexture;II)V:GetOnSurfaceTextureSizeChanged_Landroid_graphics_SurfaceTexture_IIHandler:Android.Views.TextureView/ISurfaceTextureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onSurfaceTextureUpdated:(Landroid/graphics/SurfaceTexture;)V:GetOnSurfaceTextureUpdated_Landroid_graphics_SurfaceTexture_Handler:Android.Views.TextureView/ISurfaceTextureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("IO.Vov.Vitamio.Demo.MediaPlayerDemo_setSurface, VitamioDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlayerDemo_setSurface.class, __md_methods);
	}


	public MediaPlayerDemo_setSurface () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlayerDemo_setSurface.class)
			mono.android.TypeManager.Activate ("IO.Vov.Vitamio.Demo.MediaPlayerDemo_setSurface, VitamioDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
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


	public void onBufferingUpdate (io.vov.vitamio.MediaPlayer p0, int p1)
	{
		n_onBufferingUpdate (p0, p1);
	}

	private native void n_onBufferingUpdate (io.vov.vitamio.MediaPlayer p0, int p1);


	public void onCompletion (io.vov.vitamio.MediaPlayer p0)
	{
		n_onCompletion (p0);
	}

	private native void n_onCompletion (io.vov.vitamio.MediaPlayer p0);


	public void onPrepared (io.vov.vitamio.MediaPlayer p0)
	{
		n_onPrepared (p0);
	}

	private native void n_onPrepared (io.vov.vitamio.MediaPlayer p0);


	public void onSurfaceTextureAvailable (android.graphics.SurfaceTexture p0, int p1, int p2)
	{
		n_onSurfaceTextureAvailable (p0, p1, p2);
	}

	private native void n_onSurfaceTextureAvailable (android.graphics.SurfaceTexture p0, int p1, int p2);


	public boolean onSurfaceTextureDestroyed (android.graphics.SurfaceTexture p0)
	{
		return n_onSurfaceTextureDestroyed (p0);
	}

	private native boolean n_onSurfaceTextureDestroyed (android.graphics.SurfaceTexture p0);


	public void onSurfaceTextureSizeChanged (android.graphics.SurfaceTexture p0, int p1, int p2)
	{
		n_onSurfaceTextureSizeChanged (p0, p1, p2);
	}

	private native void n_onSurfaceTextureSizeChanged (android.graphics.SurfaceTexture p0, int p1, int p2);


	public void onSurfaceTextureUpdated (android.graphics.SurfaceTexture p0)
	{
		n_onSurfaceTextureUpdated (p0);
	}

	private native void n_onSurfaceTextureUpdated (android.graphics.SurfaceTexture p0);

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
