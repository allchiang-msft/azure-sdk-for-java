// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.EnvironmentResourceInner;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.Gen2EnvironmentResourceProperties;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * An environment is a set of time-series data available for query, and is the top level Azure Time Series Insights
 * resource. Gen2 environments do not have set data retention limits.
 */
@Fluent
public final class Gen2EnvironmentResource extends EnvironmentResourceInner {
    /*
     * The kind of the environment.
     */
    private EnvironmentResourceKind kind = EnvironmentResourceKind.GEN2;

    /*
     * Properties of the Gen2 environment.
     */
    private Gen2EnvironmentResourceProperties innerProperties = new Gen2EnvironmentResourceProperties();

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of Gen2EnvironmentResource class.
     */
    public Gen2EnvironmentResource() {
    }

    /**
     * Get the kind property: The kind of the environment.
     * 
     * @return the kind value.
     */
    @Override
    public EnvironmentResourceKind kind() {
        return this.kind;
    }

    /**
     * Get the innerProperties property: Properties of the Gen2 environment.
     * 
     * @return the innerProperties value.
     */
    private Gen2EnvironmentResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gen2EnvironmentResource withSku(Sku sku) {
        super.withSku(sku);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gen2EnvironmentResource withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gen2EnvironmentResource withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the timeSeriesIdProperties property: The list of event properties which will be used to define the
     * environment's time series id.
     * 
     * @return the timeSeriesIdProperties value.
     */
    public List<TimeSeriesIdProperty> timeSeriesIdProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().timeSeriesIdProperties();
    }

    /**
     * Set the timeSeriesIdProperties property: The list of event properties which will be used to define the
     * environment's time series id.
     * 
     * @param timeSeriesIdProperties the timeSeriesIdProperties value to set.
     * @return the Gen2EnvironmentResource object itself.
     */
    public Gen2EnvironmentResource withTimeSeriesIdProperties(List<TimeSeriesIdProperty> timeSeriesIdProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new Gen2EnvironmentResourceProperties();
        }
        this.innerProperties().withTimeSeriesIdProperties(timeSeriesIdProperties);
        return this;
    }

    /**
     * Get the storageConfiguration property: The storage configuration provides the connection details that allows the
     * Time Series Insights service to connect to the customer storage account that is used to store the environment's
     * data.
     * 
     * @return the storageConfiguration value.
     */
    public Gen2StorageConfigurationOutput storageConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().storageConfiguration();
    }

    /**
     * Set the storageConfiguration property: The storage configuration provides the connection details that allows the
     * Time Series Insights service to connect to the customer storage account that is used to store the environment's
     * data.
     * 
     * @param storageConfiguration the storageConfiguration value to set.
     * @return the Gen2EnvironmentResource object itself.
     */
    public Gen2EnvironmentResource withStorageConfiguration(Gen2StorageConfigurationOutput storageConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new Gen2EnvironmentResourceProperties();
        }
        this.innerProperties().withStorageConfiguration(storageConfiguration);
        return this;
    }

    /**
     * Get the warmStoreConfiguration property: The warm store configuration provides the details to create a warm store
     * cache that will retain a copy of the environment's data available for faster query.
     * 
     * @return the warmStoreConfiguration value.
     */
    public WarmStoreConfigurationProperties warmStoreConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().warmStoreConfiguration();
    }

    /**
     * Set the warmStoreConfiguration property: The warm store configuration provides the details to create a warm store
     * cache that will retain a copy of the environment's data available for faster query.
     * 
     * @param warmStoreConfiguration the warmStoreConfiguration value to set.
     * @return the Gen2EnvironmentResource object itself.
     */
    public Gen2EnvironmentResource withWarmStoreConfiguration(WarmStoreConfigurationProperties warmStoreConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new Gen2EnvironmentResourceProperties();
        }
        this.innerProperties().withWarmStoreConfiguration(warmStoreConfiguration);
        return this;
    }

    /**
     * Get the dataAccessId property: An id used to access the environment data, e.g. to query the environment's events
     * or upload reference data for the environment.
     * 
     * @return the dataAccessId value.
     */
    public UUID dataAccessId() {
        return this.innerProperties() == null ? null : this.innerProperties().dataAccessId();
    }

    /**
     * Get the dataAccessFqdn property: The fully qualified domain name used to access the environment data, e.g. to
     * query the environment's events or upload reference data for the environment.
     * 
     * @return the dataAccessFqdn value.
     */
    public String dataAccessFqdn() {
        return this.innerProperties() == null ? null : this.innerProperties().dataAccessFqdn();
    }

    /**
     * Get the status property: An object that represents the status of the environment, and its internal state in the
     * Time Series Insights service.
     * 
     * @return the status value.
     */
    public EnvironmentStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the creationTime property: The time the resource was created.
     * 
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().creationTime();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model Gen2EnvironmentResource"));
        } else {
            innerProperties().validate();
        }
        if (sku() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property sku in model Gen2EnvironmentResource"));
        } else {
            sku().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Gen2EnvironmentResource.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeJsonField("sku", sku());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Gen2EnvironmentResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Gen2EnvironmentResource if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Gen2EnvironmentResource.
     */
    public static Gen2EnvironmentResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Gen2EnvironmentResource deserializedGen2EnvironmentResource = new Gen2EnvironmentResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedGen2EnvironmentResource.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedGen2EnvironmentResource.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedGen2EnvironmentResource.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedGen2EnvironmentResource.withLocation(reader.getString());
                } else if ("sku".equals(fieldName)) {
                    deserializedGen2EnvironmentResource.withSku(Sku.fromJson(reader));
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedGen2EnvironmentResource.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedGen2EnvironmentResource.innerProperties
                        = Gen2EnvironmentResourceProperties.fromJson(reader);
                } else if ("kind".equals(fieldName)) {
                    deserializedGen2EnvironmentResource.kind = EnvironmentResourceKind.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGen2EnvironmentResource;
        });
    }
}
