package com.amd.aparapi.internal.kernel;

import com.amd.aparapi.Kernel;

public class PreferencesWrapper {

  private Class<? extends Kernel> klass;
  private KernelPreferences preferences;

  public PreferencesWrapper(Class<? extends Kernel> klass, KernelPreferences preferences) {
    super();
    this.klass = klass;
    this.preferences = preferences;
  }

  public Class<? extends Kernel> getKernelClass() {
    return klass;
  }

  public KernelPreferences getPreferences() {
    return preferences;
  }


}

