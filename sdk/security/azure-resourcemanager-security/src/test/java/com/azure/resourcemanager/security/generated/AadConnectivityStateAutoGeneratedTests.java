// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AadConnectivityState;
import com.azure.resourcemanager.security.models.AadConnectivityStateAutoGenerated;
import org.junit.jupiter.api.Assertions;

public final class AadConnectivityStateAutoGeneratedTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AadConnectivityStateAutoGenerated model = BinaryData.fromString("{\"connectivityState\":\"Connected\"}")
            .toObject(AadConnectivityStateAutoGenerated.class);
        Assertions.assertEquals(AadConnectivityState.CONNECTED, model.connectivityState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AadConnectivityStateAutoGenerated model
            = new AadConnectivityStateAutoGenerated().withConnectivityState(AadConnectivityState.CONNECTED);
        model = BinaryData.fromObject(model).toObject(AadConnectivityStateAutoGenerated.class);
        Assertions.assertEquals(AadConnectivityState.CONNECTED, model.connectivityState());
    }
}
