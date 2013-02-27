package org.robolectric.shadows;

import android.webkit.SslErrorHandler;
import org.robolectric.internal.Implementation;
import org.robolectric.internal.Implements;

@Implements(SslErrorHandler.class)
public class ShadowSslErrorHandler extends ShadowHandler {

	private boolean cancelCalled = false;
	private boolean proceedCalled = false;
	
    @Implementation
    public void cancel() {
    	cancelCalled = true;
    }
    
    public boolean wasCancelCalled() {
    	return cancelCalled;
    }
	
    @Implementation
    public void proceed() {
    	proceedCalled = true;
    }
    
    public boolean wasProceedCalled() {
    	return proceedCalled;
    }
}
