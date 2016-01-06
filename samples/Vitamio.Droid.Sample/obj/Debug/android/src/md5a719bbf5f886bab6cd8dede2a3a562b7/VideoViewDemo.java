package md5a719bbf5f886bab6cd8dede2a3a562b7;


public class VideoViewDemo
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_startPlay:(Landroid/view/View;)V:__export__\n" +
			"n_openVideo:(Landroid/view/View;)V:__export__\n" +
			"";
		mono.android.Runtime.register ("IO.Vov.Vitamio.Demo.VideoViewDemo, VitamioDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", VideoViewDemo.class, __md_methods);
	}


	public VideoViewDemo () throws java.lang.Throwable
	{
		super ();
		if (getClass () == VideoViewDemo.class)
			mono.android.TypeManager.Activate ("IO.Vov.Vitamio.Demo.VideoViewDemo, VitamioDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void startPlay (android.view.View p0)
	{
		n_startPlay (p0);
	}

	private native void n_startPlay (android.view.View p0);


	public void openVideo (android.view.View p0)
	{
		n_openVideo (p0);
	}

	private native void n_openVideo (android.view.View p0);

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
