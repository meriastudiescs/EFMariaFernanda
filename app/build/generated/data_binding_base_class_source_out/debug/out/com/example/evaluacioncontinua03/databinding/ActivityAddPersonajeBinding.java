// Generated by view binder compiler. Do not edit!
package com.example.evaluacioncontinua03.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.evaluacioncontinua03.R;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddPersonajeBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnRegisterPersonaje;

  @NonNull
  public final Button btnTakePhoto;

  @NonNull
  public final ImageView imgPhoto;

  @NonNull
  public final SwitchMaterial switchFavorite;

  @NonNull
  public final TextInputLayout tilFrasePersonaje;

  @NonNull
  public final TextInputLayout tilImagenPersonaje;

  @NonNull
  public final TextInputLayout tilNombrePersonaje;

  @NonNull
  public final TextInputLayout tilPorPersonaje;

  private ActivityAddPersonajeBinding(@NonNull LinearLayout rootView,
      @NonNull Button btnRegisterPersonaje, @NonNull Button btnTakePhoto,
      @NonNull ImageView imgPhoto, @NonNull SwitchMaterial switchFavorite,
      @NonNull TextInputLayout tilFrasePersonaje, @NonNull TextInputLayout tilImagenPersonaje,
      @NonNull TextInputLayout tilNombrePersonaje, @NonNull TextInputLayout tilPorPersonaje) {
    this.rootView = rootView;
    this.btnRegisterPersonaje = btnRegisterPersonaje;
    this.btnTakePhoto = btnTakePhoto;
    this.imgPhoto = imgPhoto;
    this.switchFavorite = switchFavorite;
    this.tilFrasePersonaje = tilFrasePersonaje;
    this.tilImagenPersonaje = tilImagenPersonaje;
    this.tilNombrePersonaje = tilNombrePersonaje;
    this.tilPorPersonaje = tilPorPersonaje;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddPersonajeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddPersonajeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_personaje, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddPersonajeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_register_personaje;
      Button btnRegisterPersonaje = ViewBindings.findChildViewById(rootView, id);
      if (btnRegisterPersonaje == null) {
        break missingId;
      }

      id = R.id.btn_take_photo;
      Button btnTakePhoto = ViewBindings.findChildViewById(rootView, id);
      if (btnTakePhoto == null) {
        break missingId;
      }

      id = R.id.img_photo;
      ImageView imgPhoto = ViewBindings.findChildViewById(rootView, id);
      if (imgPhoto == null) {
        break missingId;
      }

      id = R.id.switch_favorite;
      SwitchMaterial switchFavorite = ViewBindings.findChildViewById(rootView, id);
      if (switchFavorite == null) {
        break missingId;
      }

      id = R.id.til_frase_personaje;
      TextInputLayout tilFrasePersonaje = ViewBindings.findChildViewById(rootView, id);
      if (tilFrasePersonaje == null) {
        break missingId;
      }

      id = R.id.til_imagen_personaje;
      TextInputLayout tilImagenPersonaje = ViewBindings.findChildViewById(rootView, id);
      if (tilImagenPersonaje == null) {
        break missingId;
      }

      id = R.id.til_nombre_personaje;
      TextInputLayout tilNombrePersonaje = ViewBindings.findChildViewById(rootView, id);
      if (tilNombrePersonaje == null) {
        break missingId;
      }

      id = R.id.til_por_personaje;
      TextInputLayout tilPorPersonaje = ViewBindings.findChildViewById(rootView, id);
      if (tilPorPersonaje == null) {
        break missingId;
      }

      return new ActivityAddPersonajeBinding((LinearLayout) rootView, btnRegisterPersonaje,
          btnTakePhoto, imgPhoto, switchFavorite, tilFrasePersonaje, tilImagenPersonaje,
          tilNombrePersonaje, tilPorPersonaje);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
