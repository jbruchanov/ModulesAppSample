package com.example.dynamicfeature;

import com.example.core.Logger;
import com.example.core.SecurityCore;

public interface DynamicFeatureDependencies {
    SecurityCore provideSecurityCore();

    Logger provideLogger();
}
