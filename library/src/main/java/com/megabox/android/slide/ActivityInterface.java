package com.megabox.android.slide;

import android.app.Application;

/**
 * @author lihong
 * @since 2016/10/28
 */
interface ActivityInterface {
    void setActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks callbacks);
}
