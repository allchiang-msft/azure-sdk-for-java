// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagepool.models.IscsiLun;
import org.junit.jupiter.api.Assertions;

public final class IscsiLunTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IscsiLun model
            = BinaryData.fromString("{\"name\":\"yat\",\"managedDiskAzureResourceId\":\"dckcbc\",\"lun\":1827810592}")
                .toObject(IscsiLun.class);
        Assertions.assertEquals("yat", model.name());
        Assertions.assertEquals("dckcbc", model.managedDiskAzureResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IscsiLun model = new IscsiLun().withName("yat").withManagedDiskAzureResourceId("dckcbc");
        model = BinaryData.fromObject(model).toObject(IscsiLun.class);
        Assertions.assertEquals("yat", model.name());
        Assertions.assertEquals("dckcbc", model.managedDiskAzureResourceId());
    }
}
