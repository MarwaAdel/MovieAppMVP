// Generated code from Butter Knife. Do not modify!
package com.dev.movieapp.ui.activities.landing;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dev.movieapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ResultListActivity_ViewBinding implements Unbinder {
  private ResultListActivity target;

  @UiThread
  public ResultListActivity_ViewBinding(ResultListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ResultListActivity_ViewBinding(ResultListActivity target, View source) {
    this.target = target;

    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ResultListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mToolbar = null;
  }
}
