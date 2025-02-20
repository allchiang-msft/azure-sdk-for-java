// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.InformixSink;

public final class InformixSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InformixSink model = BinaryData.fromString(
            "{\"type\":\"InformixSink\",\"preCopyScript\":\"dataxvjjwlwysrs\",\"writeBatchSize\":\"datahciazwebts\",\"writeBatchTimeout\":\"dataqkanuxjud\",\"sinkRetryCount\":\"datazodnxlcdgkc\",\"sinkRetryWait\":\"dataancjlkrskzw\",\"maxConcurrentConnections\":\"databafqzihmvw\",\"disableMetricsCollection\":\"datajwvqiahoqjz\",\"\":{\"hgwzbystwuuwe\":\"datawdlrtcfulmz\",\"qichzcajity\":\"datantjssjbpnatpym\"}}")
            .toObject(InformixSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InformixSink model = new InformixSink().withWriteBatchSize("datahciazwebts")
            .withWriteBatchTimeout("dataqkanuxjud")
            .withSinkRetryCount("datazodnxlcdgkc")
            .withSinkRetryWait("dataancjlkrskzw")
            .withMaxConcurrentConnections("databafqzihmvw")
            .withDisableMetricsCollection("datajwvqiahoqjz")
            .withPreCopyScript("dataxvjjwlwysrs");
        model = BinaryData.fromObject(model).toObject(InformixSink.class);
    }
}
