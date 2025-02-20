// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkanalytics.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.networkanalytics.NetworkAnalyticsManager;
import com.azure.resourcemanager.networkanalytics.models.DataProductsCatalog;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DataProductsCatalogsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Failed\",\"publishers\":[{\"publisherName\":\"qzvszjf\",\"dataProducts\":[{\"dataProductName\":\"vjfdx\",\"description\":\"ivetvtcq\",\"dataProductVersions\":[]},{\"dataProductName\":\"qtdo\",\"description\":\"mcbxvwvxysl\",\"dataProductVersions\":[]},{\"dataProductName\":\"bhsfxob\",\"description\":\"ytkblmpew\",\"dataProductVersions\":[]}]},{\"publisherName\":\"wfbkrvrns\",\"dataProducts\":[{\"dataProductName\":\"hqjohxcrsbfova\",\"description\":\"rruvwbhsq\",\"dataProductVersions\":[]},{\"dataProductName\":\"sub\",\"description\":\"gjb\",\"dataProductVersions\":[]},{\"dataProductName\":\"rxbpyb\",\"description\":\"rfbjf\",\"dataProductVersions\":[]}]},{\"publisherName\":\"twss\",\"dataProducts\":[{\"dataProductName\":\"ftpvjzbexil\",\"description\":\"znfqqnvwpmqtar\",\"dataProductVersions\":[]}]}]},\"id\":\"ujmkcjhwqy\",\"name\":\"jrybnwjewgdrjer\",\"type\":\"naenqpehindo\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        NetworkAnalyticsManager manager = NetworkAnalyticsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DataProductsCatalog response = manager.dataProductsCatalogs()
            .getByResourceGroupWithResponse("vkr", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("qzvszjf", response.properties().publishers().get(0).publisherName());
        Assertions.assertEquals("vjfdx",
            response.properties().publishers().get(0).dataProducts().get(0).dataProductName());
        Assertions.assertEquals("ivetvtcq",
            response.properties().publishers().get(0).dataProducts().get(0).description());
    }
}
