// Generated by Dagger (https://google.github.io/dagger).
package com.dev.movieapp.ui.fragments.splash;

import com.dev.movieapp.utils.AppUtils;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class SplashFragment_MembersInjector implements MembersInjector<SplashFragment> {
  private final Provider<AppUtils> mAppUtilsProvider;

  public SplashFragment_MembersInjector(Provider<AppUtils> mAppUtilsProvider) {
    this.mAppUtilsProvider = mAppUtilsProvider;
  }

  public static MembersInjector<SplashFragment> create(Provider<AppUtils> mAppUtilsProvider) {
    return new SplashFragment_MembersInjector(mAppUtilsProvider);
  }

  @Override
  public void injectMembers(SplashFragment instance) {
    injectMAppUtils(instance, mAppUtilsProvider.get());
  }

  public static void injectMAppUtils(SplashFragment instance, AppUtils mAppUtils) {
    instance.mAppUtils = mAppUtils;
  }
}
