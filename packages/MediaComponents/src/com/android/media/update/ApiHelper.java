/*
 * Copyright 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.media.update;

import android.content.res.Resources;
import android.content.res.Resources.Theme;

public class ApiHelper {
    private static ApiHelper sInstance;
    private final Resources mLibResources;
    private final Theme mLibTheme;

    public static ApiHelper getInstance() {
        return sInstance;
    }

    static void initialize(Resources libResources, Theme libTheme) {
        if (sInstance == null) {
            sInstance = new ApiHelper(libResources, libTheme);
        }
    }

    private ApiHelper(Resources libResources, Theme libTheme) {
        mLibResources = libResources;
        mLibTheme = libTheme;
    }

    public Resources getLibResources() {
        return mLibResources;
    }

    public Resources.Theme getLibTheme() {
        return mLibTheme;
    }
}
