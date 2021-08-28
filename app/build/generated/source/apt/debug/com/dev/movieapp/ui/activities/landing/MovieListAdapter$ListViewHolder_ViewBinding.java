// Generated code from Butter Knife. Do not modify!
package com.dev.movieapp.ui.activities.landing;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dev.movieapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MovieListAdapter$ListViewHolder_ViewBinding implements Unbinder {
  private MovieListAdapter.ListViewHolder target;

  @UiThread
  public MovieListAdapter$ListViewHolder_ViewBinding(MovieListAdapter.ListViewHolder target,
      View source) {
    this.target = target;

    target.title = Utils.findRequiredViewAsType(source, R.id.id_text, "field 'title'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MovieListAdapter.ListViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.title = null;
  }
}
