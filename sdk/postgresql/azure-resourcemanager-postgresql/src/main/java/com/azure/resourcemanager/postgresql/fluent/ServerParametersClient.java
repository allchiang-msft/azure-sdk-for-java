// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.postgresql.fluent.models.ConfigurationListResultInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ServerParametersClient.
 */
public interface ServerParametersClient {
    /**
     * Update a list of configurations in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The parameters for updating a list of server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server configurations along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> listUpdateConfigurationsWithResponseAsync(String resourceGroupName,
        String serverName, ConfigurationListResultInner value);

    /**
     * Update a list of configurations in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The parameters for updating a list of server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a list of server configurations.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<ConfigurationListResultInner>, ConfigurationListResultInner>
        beginListUpdateConfigurationsAsync(String resourceGroupName, String serverName,
            ConfigurationListResultInner value);

    /**
     * Update a list of configurations in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The parameters for updating a list of server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a list of server configurations.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ConfigurationListResultInner>, ConfigurationListResultInner>
        beginListUpdateConfigurations(String resourceGroupName, String serverName, ConfigurationListResultInner value);

    /**
     * Update a list of configurations in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The parameters for updating a list of server configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a list of server configurations.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ConfigurationListResultInner>, ConfigurationListResultInner> beginListUpdateConfigurations(
        String resourceGroupName, String serverName, ConfigurationListResultInner value, Context context);

    /**
     * Update a list of configurations in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The parameters for updating a list of server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server configurations on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ConfigurationListResultInner> listUpdateConfigurationsAsync(String resourceGroupName, String serverName,
        ConfigurationListResultInner value);

    /**
     * Update a list of configurations in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The parameters for updating a list of server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server configurations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationListResultInner listUpdateConfigurations(String resourceGroupName, String serverName,
        ConfigurationListResultInner value);

    /**
     * Update a list of configurations in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The parameters for updating a list of server configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server configurations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationListResultInner listUpdateConfigurations(String resourceGroupName, String serverName,
        ConfigurationListResultInner value, Context context);
}
