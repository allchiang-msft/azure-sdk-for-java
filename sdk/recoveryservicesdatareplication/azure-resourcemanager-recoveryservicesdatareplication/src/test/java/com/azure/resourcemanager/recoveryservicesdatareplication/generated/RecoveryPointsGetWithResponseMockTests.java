// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.RecoveryPointModel;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.RecoveryPointType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class RecoveryPointsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"recoveryPointTime\":\"2021-06-24T02:15:33Z\",\"recoveryPointType\":\"CrashConsistent\",\"customProperties\":{\"instanceType\":\"RecoveryPointModelCustomProperties\"}},\"id\":\"gvriibakclac\",\"name\":\"rnxousxauzlwvsg\",\"type\":\"ohqfzizv\",\"systemData\":{\"createdBy\":\"mk\",\"createdByType\":\"vthn\",\"createdAt\":\"2021-08-05T06:49:59Z\",\"lastModifiedBy\":\"ekov\",\"lastModifiedByType\":\"ibiattg\",\"lastModifiedAt\":\"2021-06-24T14:54:49Z\"}}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        RecoveryServicesDataReplicationManager manager = RecoveryServicesDataReplicationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        RecoveryPointModel response = manager.recoveryPoints()
            .getWithResponse("icrmnzh", "gmqgjs", "vpqcb", "rmbodt", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(OffsetDateTime.parse("2021-06-24T02:15:33Z"),
            response.properties().recoveryPointTime());
        Assertions.assertEquals(RecoveryPointType.CRASH_CONSISTENT, response.properties().recoveryPointType());
    }
}
