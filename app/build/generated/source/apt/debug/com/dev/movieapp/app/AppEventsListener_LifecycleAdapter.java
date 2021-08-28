package com.dev.movieapp.app;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;
import java.lang.Override;

public class AppEventsListener_LifecycleAdapter implements GeneratedAdapter {
  final AppEventsListener mReceiver;

  AppEventsListener_LifecycleAdapter(AppEventsListener receiver) {
    this.mReceiver = receiver;
  }

  @Override
  public void callMethods(LifecycleOwner owner, Lifecycle.Event event, boolean onAny,
      MethodCallsLogger logger) {
    boolean hasLogger = logger != null;
    if (onAny) {
      return;
    }
    if (event == Lifecycle.Event.ON_CREATE) {
      if (!hasLogger || logger.approveCall("gotCreated", 1)) {
        mReceiver.gotCreated();
      }
      return;
    }
    if (event == Lifecycle.Event.ON_START) {
      if (!hasLogger || logger.approveCall("gotStarted", 1)) {
        mReceiver.gotStarted();
      }
      return;
    }
    if (event == Lifecycle.Event.ON_STOP) {
      if (!hasLogger || logger.approveCall("gotStopped", 1)) {
        mReceiver.gotStopped();
      }
      return;
    }
  }
}
