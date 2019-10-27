package com.rhosseini.navigationsample.dialogWithCallback;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavDirections;

import com.rhosseini.navigationsample.R;
import com.rhosseini.navigationsample.dialogWithCallback.CostumeDialog;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DialogWithCallbackGraphDirections {
  private DialogWithCallbackGraphDirections() {
  }

  @NonNull
  public static ActionGlobalCostumeDialog actionGlobalCostumeDialog(int icon,
      @Nullable String title, @Nullable String message, @Nullable String positiveBtnText,
      @Nullable String negativeBtnText, @Nullable String neutralBtnText,
      @Nullable CostumeDialog.MyOnBtnClickListener listener) {
    return new ActionGlobalCostumeDialog(icon, title, message, positiveBtnText, negativeBtnText, neutralBtnText, listener);
  }

  public static class ActionGlobalCostumeDialog implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionGlobalCostumeDialog(int icon, @Nullable String title, @Nullable String message,
        @Nullable String positiveBtnText, @Nullable String negativeBtnText,
        @Nullable String neutralBtnText, @Nullable CostumeDialog.MyOnBtnClickListener listener) {
      this.arguments.put("icon", icon);
      this.arguments.put("title", title);
      this.arguments.put("message", message);
      this.arguments.put("positiveBtnText", positiveBtnText);
      this.arguments.put("negativeBtnText", negativeBtnText);
      this.arguments.put("neutralBtnText", neutralBtnText);
      this.arguments.put("listener", listener);
    }

    @NonNull
    public ActionGlobalCostumeDialog setIcon(int icon) {
      this.arguments.put("icon", icon);
      return this;
    }

    @NonNull
    public ActionGlobalCostumeDialog setTitle(@Nullable String title) {
      this.arguments.put("title", title);
      return this;
    }

    @NonNull
    public ActionGlobalCostumeDialog setMessage(@Nullable String message) {
      this.arguments.put("message", message);
      return this;
    }

    @NonNull
    public ActionGlobalCostumeDialog setPositiveBtnText(@Nullable String positiveBtnText) {
      this.arguments.put("positiveBtnText", positiveBtnText);
      return this;
    }

    @NonNull
    public ActionGlobalCostumeDialog setNegativeBtnText(@Nullable String negativeBtnText) {
      this.arguments.put("negativeBtnText", negativeBtnText);
      return this;
    }

    @NonNull
    public ActionGlobalCostumeDialog setNeutralBtnText(@Nullable String neutralBtnText) {
      this.arguments.put("neutralBtnText", neutralBtnText);
      return this;
    }

    @NonNull
    public ActionGlobalCostumeDialog setListener(@Nullable CostumeDialog.MyOnBtnClickListener listener) {
      this.arguments.put("listener", listener);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("icon")) {
        int icon = (int) arguments.get("icon");
        __result.putInt("icon", icon);
      }
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
      if (arguments.containsKey("neutralBtnText")) {
        String neutralBtnText = (String) arguments.get("neutralBtnText");
        __result.putString("neutralBtnText", neutralBtnText);
      }
      if (arguments.containsKey("listener")) {
        CostumeDialog.MyOnBtnClickListener listener = (CostumeDialog.MyOnBtnClickListener) arguments.get("listener");
        if (Parcelable.class.isAssignableFrom(CostumeDialog.MyOnBtnClickListener.class) || listener == null) {
          __result.putParcelable("listener", Parcelable.class.cast(listener));
        } else if (Serializable.class.isAssignableFrom(CostumeDialog.MyOnBtnClickListener.class)) {
          __result.putSerializable("listener", Serializable.class.cast(listener));
        } else {
          throw new UnsupportedOperationException(CostumeDialog.MyOnBtnClickListener.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.actionGlobalCostumeDialog;
    }

    @SuppressWarnings("unchecked")
    public int getIcon() {
      return (int) arguments.get("icon");
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
    @Nullable
    public String getNeutralBtnText() {
      return (String) arguments.get("neutralBtnText");
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public CostumeDialog.MyOnBtnClickListener getListener() {
      return (CostumeDialog.MyOnBtnClickListener) arguments.get("listener");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionGlobalCostumeDialog that = (ActionGlobalCostumeDialog) object;
      if (arguments.containsKey("icon") != that.arguments.containsKey("icon")) {
        return false;
      }
      if (getIcon() != that.getIcon()) {
        return false;
      }
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
      if (arguments.containsKey("neutralBtnText") != that.arguments.containsKey("neutralBtnText")) {
        return false;
      }
      if (getNeutralBtnText() != null ? !getNeutralBtnText().equals(that.getNeutralBtnText()) : that.getNeutralBtnText() != null) {
        return false;
      }
      if (arguments.containsKey("listener") != that.arguments.containsKey("listener")) {
        return false;
      }
      if (getListener() != null ? !getListener().equals(that.getListener()) : that.getListener() != null) {
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
      result = 31 * result + getIcon();
      result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
      result = 31 * result + (getMessage() != null ? getMessage().hashCode() : 0);
      result = 31 * result + (getPositiveBtnText() != null ? getPositiveBtnText().hashCode() : 0);
      result = 31 * result + (getNegativeBtnText() != null ? getNegativeBtnText().hashCode() : 0);
      result = 31 * result + (getNeutralBtnText() != null ? getNeutralBtnText().hashCode() : 0);
      result = 31 * result + (getListener() != null ? getListener().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionGlobalCostumeDialog(actionId=" + getActionId() + "){"
          + "icon=" + getIcon()
          + ", title=" + getTitle()
          + ", message=" + getMessage()
          + ", positiveBtnText=" + getPositiveBtnText()
          + ", negativeBtnText=" + getNegativeBtnText()
          + ", neutralBtnText=" + getNeutralBtnText()
          + ", listener=" + getListener()
          + "}";
    }
  }
}
