// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.managementgroups.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.managementgroups.fluent.models.CheckNameAvailabilityResultInner;
import com.azure.resourcemanager.managementgroups.fluent.models.TenantBackfillStatusResultInner;
import com.azure.resourcemanager.managementgroups.models.CheckNameAvailabilityRequest;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ResourceProvidersClient.
 */
public final class ResourceProvidersClientImpl implements ResourceProvidersClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ResourceProvidersService service;

    /**
     * The service client containing this operation class.
     */
    private final ManagementGroupsApiImpl client;

    /**
     * Initializes an instance of ResourceProvidersClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ResourceProvidersClientImpl(ManagementGroupsApiImpl client) {
        this.service
            = RestProxy.create(ResourceProvidersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ManagementGroupsApiResourceProviders to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ManagementGroupsApiR")
    public interface ResourceProvidersService {
        @Headers({ "Content-Type: application/json" })
        @Post("/providers/Microsoft.Management/checkNameAvailability")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckNameAvailabilityResultInner>> checkNameAvailability(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CheckNameAvailabilityRequest checkNameAvailabilityRequest,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Post("/providers/Microsoft.Management/startTenantBackfill")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<TenantBackfillStatusResultInner>> startTenantBackfill(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Post("/providers/Microsoft.Management/tenantBackfillStatus")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<TenantBackfillStatusResultInner>> tenantBackfillStatus(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Checks if the specified management group name is valid and unique.
     * 
     * @param checkNameAvailabilityRequest Management group name availability check parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of the request to check management group name availability along with
     * {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityResultInner>>
        checkNameAvailabilityWithResponseAsync(CheckNameAvailabilityRequest checkNameAvailabilityRequest) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (checkNameAvailabilityRequest == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter checkNameAvailabilityRequest is required and cannot be null."));
        } else {
            checkNameAvailabilityRequest.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.checkNameAvailability(this.client.getEndpoint(),
                this.client.getApiVersion(), checkNameAvailabilityRequest, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Checks if the specified management group name is valid and unique.
     * 
     * @param checkNameAvailabilityRequest Management group name availability check parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of the request to check management group name availability along with
     * {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityResultInner>> checkNameAvailabilityWithResponseAsync(
        CheckNameAvailabilityRequest checkNameAvailabilityRequest, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (checkNameAvailabilityRequest == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter checkNameAvailabilityRequest is required and cannot be null."));
        } else {
            checkNameAvailabilityRequest.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.checkNameAvailability(this.client.getEndpoint(), this.client.getApiVersion(),
            checkNameAvailabilityRequest, accept, context);
    }

    /**
     * Checks if the specified management group name is valid and unique.
     * 
     * @param checkNameAvailabilityRequest Management group name availability check parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of the request to check management group name availability on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckNameAvailabilityResultInner>
        checkNameAvailabilityAsync(CheckNameAvailabilityRequest checkNameAvailabilityRequest) {
        return checkNameAvailabilityWithResponseAsync(checkNameAvailabilityRequest)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Checks if the specified management group name is valid and unique.
     * 
     * @param checkNameAvailabilityRequest Management group name availability check parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of the request to check management group name availability along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckNameAvailabilityResultInner>
        checkNameAvailabilityWithResponse(CheckNameAvailabilityRequest checkNameAvailabilityRequest, Context context) {
        return checkNameAvailabilityWithResponseAsync(checkNameAvailabilityRequest, context).block();
    }

    /**
     * Checks if the specified management group name is valid and unique.
     * 
     * @param checkNameAvailabilityRequest Management group name availability check parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of the request to check management group name availability.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckNameAvailabilityResultInner
        checkNameAvailability(CheckNameAvailabilityRequest checkNameAvailabilityRequest) {
        return checkNameAvailabilityWithResponse(checkNameAvailabilityRequest, Context.NONE).getValue();
    }

    /**
     * Starts backfilling subscriptions for the Tenant.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the tenant backfill status along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<TenantBackfillStatusResultInner>> startTenantBackfillWithResponseAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.startTenantBackfill(this.client.getEndpoint(), this.client.getApiVersion(),
                accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Starts backfilling subscriptions for the Tenant.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the tenant backfill status along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<TenantBackfillStatusResultInner>> startTenantBackfillWithResponseAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.startTenantBackfill(this.client.getEndpoint(), this.client.getApiVersion(), accept, context);
    }

    /**
     * Starts backfilling subscriptions for the Tenant.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the tenant backfill status on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<TenantBackfillStatusResultInner> startTenantBackfillAsync() {
        return startTenantBackfillWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Starts backfilling subscriptions for the Tenant.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the tenant backfill status along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<TenantBackfillStatusResultInner> startTenantBackfillWithResponse(Context context) {
        return startTenantBackfillWithResponseAsync(context).block();
    }

    /**
     * Starts backfilling subscriptions for the Tenant.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the tenant backfill status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TenantBackfillStatusResultInner startTenantBackfill() {
        return startTenantBackfillWithResponse(Context.NONE).getValue();
    }

    /**
     * Gets tenant backfill status.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tenant backfill status along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<TenantBackfillStatusResultInner>> tenantBackfillStatusWithResponseAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.tenantBackfillStatus(this.client.getEndpoint(), this.client.getApiVersion(),
                accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets tenant backfill status.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tenant backfill status along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<TenantBackfillStatusResultInner>> tenantBackfillStatusWithResponseAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.tenantBackfillStatus(this.client.getEndpoint(), this.client.getApiVersion(), accept, context);
    }

    /**
     * Gets tenant backfill status.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tenant backfill status on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<TenantBackfillStatusResultInner> tenantBackfillStatusAsync() {
        return tenantBackfillStatusWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets tenant backfill status.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tenant backfill status along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<TenantBackfillStatusResultInner> tenantBackfillStatusWithResponse(Context context) {
        return tenantBackfillStatusWithResponseAsync(context).block();
    }

    /**
     * Gets tenant backfill status.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tenant backfill status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TenantBackfillStatusResultInner tenantBackfillStatus() {
        return tenantBackfillStatusWithResponse(Context.NONE).getValue();
    }
}
