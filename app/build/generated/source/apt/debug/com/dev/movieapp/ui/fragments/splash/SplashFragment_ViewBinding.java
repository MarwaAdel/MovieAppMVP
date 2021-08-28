// Generated code from Butter Knife. Do not modify!
package com.dev.movieapp.ui.fragments.splash;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.core.widget.ContentLoadingProgressBar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dev.movieapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SplashFragment_ViewBinding implements Unbinder {
  private SplashFragment target;

  @UiThread
  public SplashFragment_ViewBinding(SplashFragment target, View source) {
    this.target = target;

    target.mProgressBar = Utils.findRequiredViewAsType(source, R.id.waitingLoader, "field 'mProgressBar'", ContentLoadingProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SplashFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mProgressBar = null;
  }
}
