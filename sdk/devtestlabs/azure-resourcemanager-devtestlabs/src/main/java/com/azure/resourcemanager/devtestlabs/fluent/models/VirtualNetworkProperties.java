// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devtestlabs.models.ExternalSubnet;
import com.azure.resourcemanager.devtestlabs.models.Subnet;
import com.azure.resourcemanager.devtestlabs.models.SubnetOverride;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Properties of a virtual network. */
@Fluent
public final class VirtualNetworkProperties {
    /*
     * The allowed subnets of the virtual network.
     */
    @JsonProperty(value = "allowedSubnets")
    private List<Subnet> allowedSubnets;

    /*
     * The description of the virtual network.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The Microsoft.Network resource identifier of the virtual network.
     */
    @JsonProperty(value = "externalProviderResourceId")
    private String externalProviderResourceId;

    /*
     * The external subnet properties.
     */
    @JsonProperty(value = "externalSubnets", access = JsonProperty.Access.WRITE_ONLY)
    private List<ExternalSubnet> externalSubnets;

    /*
     * The subnet overrides of the virtual network.
     */
    @JsonProperty(value = "subnetOverrides")
    private List<SubnetOverride> subnetOverrides;

    /*
     * The creation date of the virtual network.
     */
    @JsonProperty(value = "createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDate;

    /*
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "uniqueIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueIdentifier;

    /** Creates an instance of VirtualNetworkProperties class. */
    public VirtualNetworkProperties() {
    }

    /**
     * Get the allowedSubnets property: The allowed subnets of the virtual network.
     *
     * @return the allowedSubnets value.
     */
    public List<Subnet> allowedSubnets() {
        return this.allowedSubnets;
    }

    /**
     * Set the allowedSubnets property: The allowed subnets of the virtual network.
     *
     * @param allowedSubnets the allowedSubnets value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withAllowedSubnets(List<Subnet> allowedSubnets) {
        this.allowedSubnets = allowedSubnets;
        return this;
    }

    /**
     * Get the description property: The description of the virtual network.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the virtual network.
     *
     * @param description the description value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the externalProviderResourceId property: The Microsoft.Network resource identifier of the virtual network.
     *
     * @return the externalProviderResourceId value.
     */
    public String externalProviderResourceId() {
        return this.externalProviderResourceId;
    }

    /**
     * Set the externalProviderResourceId property: The Microsoft.Network resource identifier of the virtual network.
     *
     * @param externalProviderResourceId the externalProviderResourceId value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withExternalProviderResourceId(String externalProviderResourceId) {
        this.externalProviderResourceId = externalProviderResourceId;
        return this;
    }

    /**
     * Get the externalSubnets property: The external subnet properties.
     *
     * @return the externalSubnets value.
     */
    public List<ExternalSubnet> externalSubnets() {
        return this.externalSubnets;
    }

    /**
     * Get the subnetOverrides property: The subnet overrides of the virtual network.
     *
     * @return the subnetOverrides value.
     */
    public List<SubnetOverride> subnetOverrides() {
        return this.subnetOverrides;
    }

    /**
     * Set the subnetOverrides property: The subnet overrides of the virtual network.
     *
     * @param subnetOverrides the subnetOverrides value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withSubnetOverrides(List<SubnetOverride> subnetOverrides) {
        this.subnetOverrides = subnetOverrides;
        return this;
    }

    /**
     * Get the createdDate property: The creation date of the virtual network.
     *
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Get the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (allowedSubnets() != null) {
            allowedSubnets().forEach(e -> e.validate());
        }
        if (externalSubnets() != null) {
            externalSubnets().forEach(e -> e.validate());
        }
        if (subnetOverrides() != null) {
            subnetOverrides().forEach(e -> e.validate());
        }
    }
}
