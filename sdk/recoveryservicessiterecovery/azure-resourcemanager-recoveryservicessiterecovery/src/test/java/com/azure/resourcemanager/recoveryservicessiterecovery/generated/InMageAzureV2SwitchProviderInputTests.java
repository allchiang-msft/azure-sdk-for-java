// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageAzureV2SwitchProviderInput;
import org.junit.jupiter.api.Assertions;

public final class InMageAzureV2SwitchProviderInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageAzureV2SwitchProviderInput model = BinaryData.fromString(
            "{\"instanceType\":\"InMageAzureV2\",\"targetVaultID\":\"nimx\",\"targetFabricID\":\"pnerxrzut\",\"targetApplianceID\":\"lcurzaqmnbx\"}")
            .toObject(InMageAzureV2SwitchProviderInput.class);
        Assertions.assertEquals("nimx", model.targetVaultId());
        Assertions.assertEquals("pnerxrzut", model.targetFabricId());
        Assertions.assertEquals("lcurzaqmnbx", model.targetApplianceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageAzureV2SwitchProviderInput model = new InMageAzureV2SwitchProviderInput().withTargetVaultId("nimx")
            .withTargetFabricId("pnerxrzut")
            .withTargetApplianceId("lcurzaqmnbx");
        model = BinaryData.fromObject(model).toObject(InMageAzureV2SwitchProviderInput.class);
        Assertions.assertEquals("nimx", model.targetVaultId());
        Assertions.assertEquals("pnerxrzut", model.targetFabricId());
        Assertions.assertEquals("lcurzaqmnbx", model.targetApplianceId());
    }
}
