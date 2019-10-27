package com.rhosseini.navigationsample.bottomSheet;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavDirections;

import com.rhosseini.navigationsample.R;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class BottomSheetGraphDirections {
  private BottomSheetGraphDirections() {
  }

  @NonNull
  public static ActionGlobalSimpleDialog actionGlobalSimpleDialog(@Nullable String title,
      @Nullable String message, @Nullable String positiveBtnText, @Nullable String negativeBtnText,
      int requestCode) {
    return new ActionGlobalSimpleDialog(title, message, positiveBtnText, negativeBtnText, requestCode);
  }

  public static class ActionGlobalSimpleDialog implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionGlobalSimpleDialog(@Nullable String title, @Nullable String message,
        @Nullable String positiveBtnText, @Nullable String negativeBtnText, int requestCode) {
      this.arguments.put("title", title);
      this.arguments.put("message", message);
      this.arguments.put("positiveBtnText", positiveBtnText);
      this.arguments.put("negativeBtnText", negativeBtnText);
      this.arguments.put("requestCode", requestCode);
    }

    @NonNull
    public ActionGlobalSimpleDialog setTitle(@Nullable String title) {
      this.arguments.put("title", title);
      return this;
    }

    @NonNull
    public ActionGlobalSimpleDialog setMessage(@Nullable String message) {
      this.arguments.put("message", message);
      return this;
    }

    @NonNull
    public ActionGlobalSimpleDialog setPositiveBtnText(@Nullable String positiveBtnText) {
      this.arguments.put("positiveBtnText", positiveBtnText);
      return this;
    }

    @NonNull
    public ActionGlobalSimpleDialog setNegativeBtnText(@Nullable String negativeBtnText) {
      this.arguments.put("negativeBtnText", negativeBtnText);
      return this;
    }

    @NonNull
    public ActionGlobalSimpleDialog setRequestCode(int requestCode) {
      this.arguments.put("requestCode", requestCode);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("title")) {
        String title = (String) arguments.get("title");
        __result.putString("title", title);
      }
      if (arguments.containsKey("message")) {
        String message = (String) arguments.get("message");
        __result.putString("message", message);
      }
      if (arguments.containsKey("positiveBtnText")) {
        String positiveBtnText = (String) arguments.get("positiveBtnText");
        __result.putString("positiveBtnText", positiveBtnText);
      }
      if (arguments.containsKey("negativeBtnText")) {
        String negativeBtnText = (String) arguments.get("negativeBtnText");
        __result.putString("negativeBtnText", negativeBtnText);
      }
      if (arguments.containsKey("requestCode")) {
        int requestCode = (int) arguments.get("requestCode");
        __result.putInt("requestCode", requestCode);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_global_simpleDialog;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public String getTitle() {
      return (String) arguments.get("title");
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public String getMessage() {
      return (String) arguments.get("message");
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public String getPositiveBtnText() {
      return (String) arguments.get("positiveBtnText");
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public String getNegativeBtnText() {
      return (String) arguments.get("negativeBtnText");
    }

    @SuppressWarnings("unchecked")
    public int getRequestCode() {
      return (int) arguments.get("requestCode");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionGlobalSimpleDialog that = (ActionGlobalSimpleDialog) object;
      if (arguments.containsKey("title") != that.arguments.containsKey("title")) {
        return false;
      }
      if (getTitle() != null ? !getTitle().equals(that.getTitle()) : that.getTitle() != null) {
        return false;
      }
      if (arguments.containsKey("message") != that.arguments.containsKey("message")) {
        return false;
      }
      if (getMessage() != null ? !getMessage().equals(that.getMessage()) : that.getMessage() != null) {
        return false;
      }
      if (arguments.containsKey("positiveBtnText") != that.arguments.containsKey("positiveBtnText")) {
        return false;
      }
      if (getPositiveBtnText() != null ? !getPositiveBtnText().equals(that.getPositiveBtnText()) : that.getPositiveBtnText() != null) {
        return false;
      }
      if (arguments.containsKey("negativeBtnText") != that.arguments.containsKey("negativeBtnText")) {
        return false;
      }
      if (getNegativeBtnText() != null ? !getNegativeBtnText().equals(that.getNegativeBtnText()) : that.getNegativeBtnText() != null) {
        return false;
      }
      if (arguments.containsKey("requestCode") != that.arguments.containsKey("requestCode")) {
        return false;
      }
      if (getRequestCode() != that.getRequestCode()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
      result = 31 * result + (getMessage() != null ? getMessage().hashCode() : 0);
      result = 31 * result + (getPositiveBtnText() != null ? getPositiveBtnText().hashCode() : 0);
      result = 31 * result + (getNegativeBtnText() != null ? getNegativeBtnText().hashCode() : 0);
      result = 31 * result + getRequestCode();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionGlobalSimpleDialog(actionId=" + getActionId() + "){"
          + "title=" + getTitle()
          + ", message=" + getMessage()
          + ", positiveBtnText=" + getPositiveBtnText()
          + ", negativeBtnText=" + getNegativeBtnText()
          + ", requestCode=" + getRequestCode()
          + "}";
    }
  }
}
