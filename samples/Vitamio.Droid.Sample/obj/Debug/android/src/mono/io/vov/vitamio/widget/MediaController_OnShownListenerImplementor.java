package mono.io.vov.vitamio.widget;


public class MediaController_OnShownListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.vov.vitamio.widget.MediaController.OnShownListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onShown:()V:GetOnShownHandler:IO.Vov.Vitamio.Widget.MediaController/IOnShownListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"";
		mono.android.Runtime.register ("IO.Vov.Vitamio.Widget.MediaController+IOnShownListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaController_OnShownListenerImplementor.class, __md_methods);
	}


	public MediaController_OnShownListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaController_OnShownListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Vov.Vitamio.Widget.MediaController+IOnShownListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onShown ()
	{
		n_onShown ();
	}

	private native void n_onShown ();

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
