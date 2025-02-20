// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestack.models.DeploymentLicenseRequest;
import org.junit.jupiter.api.Assertions;

public final class DeploymentLicenseRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeploymentLicenseRequest model
            = BinaryData.fromString("{\"verificationVersion\":\"wby\"}").toObject(DeploymentLicenseRequest.class);
        Assertions.assertEquals("wby", model.verificationVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeploymentLicenseRequest model = new DeploymentLicenseRequest().withVerificationVersion("wby");
        model = BinaryData.fromObject(model).toObject(DeploymentLicenseRequest.class);
        Assertions.assertEquals("wby", model.verificationVersion());
    }
}
