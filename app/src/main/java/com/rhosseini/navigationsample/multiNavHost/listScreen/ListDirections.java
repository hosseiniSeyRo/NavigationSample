package com.rhosseini.navigationsample.multiNavHost.listScreen;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

import com.rhosseini.navigationsample.R;

public class ListDirections {
  private ListDirections() {
  }

  @NonNull
  public static NavDirections actionGlobalSettingFragment() {
    return new ActionOnlyNavDirections(R.id.action_global_settingFragment);
  }
}
