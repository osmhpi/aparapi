package com.amd.aparapi.internal.kernel;

import com.amd.aparapi.Kernel;
import com.amd.aparapi.internal.kernel.KernelPreferences;

public class PreferencesWrapper {
  
  private Kernel kernel;
  private KernelPreferences preferences;
  
  public PreferencesWrapper(Kernel kernel, KernelPreferences preferences) {
    super();
    this.kernel = kernel;
    this.preferences = preferences;
  }

  public Kernel getKernel() {
    return kernel;
  }

  public KernelPreferences getPreferences() {
    return preferences;
  }
  
  
}

