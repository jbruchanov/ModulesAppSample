package com.example.ui_dynamic_feature_deps;

import com.example.core.Logger;
import com.example.core.SecurityCore;

public interface DynamicFeatureDependencies {
    SecurityCore provideSecurityCore();

    Logger provideLogger();
}
