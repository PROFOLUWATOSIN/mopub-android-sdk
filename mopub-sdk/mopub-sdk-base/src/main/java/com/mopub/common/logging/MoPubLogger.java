// Copyright 2018-2020 Twitter, Inc.
// Licensed under the MoPub SDK License Agreement
// http://www.mopub.com/legal/sdk-license-agreement/

package com.mopub.common.logging;

import androidx.annotation.Nullable;

public interface MoPubLogger {

    void log(@Nullable String className, @Nullable String methodName,
             @Nullable String identifier, @Nullable String message);
}
