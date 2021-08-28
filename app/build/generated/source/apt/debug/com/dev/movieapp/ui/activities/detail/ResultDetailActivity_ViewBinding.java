// Generated code from Butter Knife. Do not modify!
package com.dev.movieapp.ui.activities.detail;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dev.movieapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ResultDetailActivity_ViewBinding implements Unbinder {
  private ResultDetailActivity target;

  @UiThread
  public ResultDetailActivity_ViewBinding(ResultDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ResultDetailActivity_ViewBinding(ResultDetailActivity target, View source) {
    this.target = target;

    target.mImageParallax = Utils.findRequiredViewAsType(source, R.id.ivParallax, "field 'mImageParallax'", ImageView.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.detail_toolbar, "field 'toolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ResultDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mImageParallax = null;
    target.toolbar = null;
  }
}
