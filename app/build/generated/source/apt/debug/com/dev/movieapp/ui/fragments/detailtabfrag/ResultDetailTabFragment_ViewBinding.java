// Generated code from Butter Knife. Do not modify!
package com.dev.movieapp.ui.fragments.detailtabfrag;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dev.movieapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ResultDetailTabFragment_ViewBinding implements Unbinder {
  private ResultDetailTabFragment target;

  @UiThread
  public ResultDetailTabFragment_ViewBinding(ResultDetailTabFragment target, View source) {
    this.target = target;

    target.mTitle = Utils.findRequiredViewAsType(source, R.id.title, "field 'mTitle'", TextView.class);
    target.mVotes = Utils.findRequiredViewAsType(source, R.id.votes, "field 'mVotes'", TextView.class);
    target.mReleaseDate = Utils.findRequiredViewAsType(source, R.id.releaseDate, "field 'mReleaseDate'", TextView.class);
    target.mTotalVotes = Utils.findRequiredViewAsType(source, R.id.totalVotes, "field 'mTotalVotes'", TextView.class);
    target.mDescription = Utils.findRequiredViewAsType(source, R.id.result_detail, "field 'mDescription'", TextView.class);
    target.mImgMovie = Utils.findRequiredViewAsType(source, R.id.img_movie, "field 'mImgMovie'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ResultDetailTabFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTitle = null;
    target.mVotes = null;
    target.mReleaseDate = null;
    target.mTotalVotes = null;
    target.mDescription = null;
    target.mImgMovie = null;
  }
}
