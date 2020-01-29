/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import com.microsoft.azure.management.applicationinsights.v2015_05_01.ApplicationInsightsComponentAvailableFeatures;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ApplicationInsightsComponentFeature;

class ApplicationInsightsComponentAvailableFeaturesImpl extends WrapperImpl<ApplicationInsightsComponentAvailableFeaturesInner> implements ApplicationInsightsComponentAvailableFeatures {
    private final InsightsManager manager;
    ApplicationInsightsComponentAvailableFeaturesImpl(ApplicationInsightsComponentAvailableFeaturesInner inner, InsightsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public InsightsManager manager() {
        return this.manager;
    }

    @Override
    public List<ApplicationInsightsComponentFeature> result() {
        return this.inner().result();
    }

}