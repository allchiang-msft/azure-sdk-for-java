// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.datalakestore.DataLakeStoreManager;
import com.azure.resourcemanager.datalakestore.models.DataLakeStoreAccountBasic;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AccountsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"accountId\":\"35a8200f-b642-4a47-8b4d-d5070765b19c\",\"provisioningState\":\"Creating\",\"state\":\"Suspended\",\"creationTime\":\"2021-06-02T09:19:15Z\",\"lastModifiedTime\":\"2021-03-02T12:24:45Z\",\"endpoint\":\"ltyfsop\"},\"location\":\"usue\",\"tags\":{\"jbavorxzdm\":\"wd\",\"nvowgujju\":\"hctbqvudwxdn\",\"zj\":\"wdkcglhsl\"},\"id\":\"yggdtjixh\",\"name\":\"kuofqweykhme\",\"type\":\"evfyexfwhybcib\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataLakeStoreManager manager = DataLakeStoreManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DataLakeStoreAccountBasic> response = manager.accounts()
            .list("v", 514021855, 303390013, "gwdslfhotwm", "ynpwlbj", true, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("usue", response.iterator().next().location());
        Assertions.assertEquals("wd", response.iterator().next().tags().get("jbavorxzdm"));
    }
}
