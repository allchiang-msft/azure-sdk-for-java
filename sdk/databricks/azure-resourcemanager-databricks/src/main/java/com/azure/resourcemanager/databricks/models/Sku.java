// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SKU for the resource. */
@Fluent
public final class Sku {
    /*
     * The SKU name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The SKU tier.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /** Creates an instance of Sku class. */
    public Sku() {
    }

    /**
     * Get the name property: The SKU name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The SKU name.
     *
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The SKU tier.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The SKU tier.
     *
     * @param tier the tier value to set.
     * @return the Sku object itself.
     */
    public Sku withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model Sku"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Sku.class);
}
