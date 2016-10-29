package com.megabox.android.slide;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/**
 * @author lihong
 * @since 2016/10/28
 */
class ActivityStackImpl extends Activity implements ActivityInterface {

    private Application.ActivityLifecycleCallbacks mActivityLifecycleCallbacks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityStackManager.addToStack(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        ActivityStackManager.removeFromStack(this);

        if (mActivityLifecycleCallbacks != null) {
            mActivityLifecycleCallbacks.onActivityDestroyed(this);
        }
    }

    @Override
    public void setActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks callbacks) {
        mActivityLifecycleCallbacks = callbacks;
    }
}
