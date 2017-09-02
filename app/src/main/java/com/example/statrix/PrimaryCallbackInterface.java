package com.example.statrix;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public interface PrimaryCallbackInterface {
    void registration();
    void forgetpassword();
    void entry(@NonNull String login, @NonNull String password);
}
