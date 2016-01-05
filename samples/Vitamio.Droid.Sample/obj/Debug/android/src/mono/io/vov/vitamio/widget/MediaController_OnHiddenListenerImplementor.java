package mono.io.vov.vitamio.widget;


public class MediaController_OnHiddenListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.vov.vitamio.widget.MediaController.OnHiddenListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onHidden:()V:GetOnHiddenHandler:IO.Vov.Vitamio.Widget.MediaController/IOnHiddenListenerInvoker, Xamarin.Vitamio.Android.Binding\n" +
			"";
		mono.android.Runtime.register ("IO.Vov.Vitamio.Widget.MediaController+IOnHiddenListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaController_OnHiddenListenerImplementor.class, __md_methods);
	}


	public MediaController_OnHiddenListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaController_OnHiddenListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Vov.Vitamio.Widget.MediaController+IOnHiddenListenerImplementor, Xamarin.Vitamio.Android.Binding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onHidden ()
	{
		n_onHidden ();
	}

	private native void n_onHidden ();

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
