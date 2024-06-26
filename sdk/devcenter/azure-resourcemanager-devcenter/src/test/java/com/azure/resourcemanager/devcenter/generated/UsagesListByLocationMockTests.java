// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.devcenter.DevCenterManager;
import com.azure.resourcemanager.devcenter.models.Usage;
import com.azure.resourcemanager.devcenter.models.UsageUnit;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class UsagesListByLocationMockTests {
    @Test
    public void testListByLocation() throws Exception {
        String responseStr
            = "{\"value\":[{\"currentValue\":8699353472291566676,\"limit\":2498968605221615188,\"unit\":\"Count\",\"name\":{\"localizedValue\":\"vapcoh\",\"value\":\"ucqpqojxcxzrz\"},\"id\":\"gdzbenr\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DevCenterManager manager = DevCenterManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Usage> response
            = manager.usages().listByLocation("xojpslsvjgp", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(8699353472291566676L, response.iterator().next().currentValue());
        Assertions.assertEquals(2498968605221615188L, response.iterator().next().limit());
        Assertions.assertEquals(UsageUnit.COUNT, response.iterator().next().unit());
        Assertions.assertEquals("vapcoh", response.iterator().next().name().localizedValue());
        Assertions.assertEquals("ucqpqojxcxzrz", response.iterator().next().name().value());
        Assertions.assertEquals("gdzbenr", response.iterator().next().id());
    }
}
