// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.RequestAttributeDataSourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RequestAttributeState extends com.pulumi.resources.ResourceArgs {

    public static final RequestAttributeState Empty = new RequestAttributeState();

    /**
     * Aggregation type for the request values
     * 
     */
    @Import(name="aggregation")
    private @Nullable Output<String> aggregation;

    /**
     * @return Aggregation type for the request values
     * 
     */
    public Optional<Output<String>> aggregation() {
        return Optional.ofNullable(this.aggregation);
    }

    /**
     * Confidential data flag. Set `true` to treat the captured data as confidential
     * 
     */
    @Import(name="confidential")
    private @Nullable Output<Boolean> confidential;

    /**
     * @return Confidential data flag. Set `true` to treat the captured data as confidential
     * 
     */
    public Optional<Output<Boolean>> confidential() {
        return Optional.ofNullable(this.confidential);
    }

    /**
     * The list of data sources
     * 
     */
    @Import(name="dataSources")
    private @Nullable Output<List<RequestAttributeDataSourceArgs>> dataSources;

    /**
     * @return The list of data sources
     * 
     */
    public Optional<Output<List<RequestAttributeDataSourceArgs>>> dataSources() {
        return Optional.ofNullable(this.dataSources);
    }

    /**
     * The data type of the request attribute
     * 
     */
    @Import(name="dataType")
    private @Nullable Output<String> dataType;

    /**
     * @return The data type of the request attribute
     * 
     */
    public Optional<Output<String>> dataType() {
        return Optional.ofNullable(this.dataType);
    }

    /**
     * The request attribute is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return The request attribute is enabled (`true`) or disabled (`false`)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The name of the request attribute
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the request attribute
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * String values transformation.   If the **dataType** is not `string`, set the `Original` here
     * 
     */
    @Import(name="normalization")
    private @Nullable Output<String> normalization;

    /**
     * @return String values transformation.   If the **dataType** is not `string`, set the `Original` here
     * 
     */
    public Optional<Output<String>> normalization() {
        return Optional.ofNullable(this.normalization);
    }

    /**
     * Personal data masking flag. Set `true` to skip masking.   Warning: This will potentially access personalized data
     * 
     */
    @Import(name="skipPersonalDataMasking")
    private @Nullable Output<Boolean> skipPersonalDataMasking;

    /**
     * @return Personal data masking flag. Set `true` to skip masking.   Warning: This will potentially access personalized data
     * 
     */
    public Optional<Output<Boolean>> skipPersonalDataMasking() {
        return Optional.ofNullable(this.skipPersonalDataMasking);
    }

    /**
     * allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    private RequestAttributeState() {}

    private RequestAttributeState(RequestAttributeState $) {
        this.aggregation = $.aggregation;
        this.confidential = $.confidential;
        this.dataSources = $.dataSources;
        this.dataType = $.dataType;
        this.enabled = $.enabled;
        this.name = $.name;
        this.normalization = $.normalization;
        this.skipPersonalDataMasking = $.skipPersonalDataMasking;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RequestAttributeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RequestAttributeState $;

        public Builder() {
            $ = new RequestAttributeState();
        }

        public Builder(RequestAttributeState defaults) {
            $ = new RequestAttributeState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregation Aggregation type for the request values
         * 
         * @return builder
         * 
         */
        public Builder aggregation(@Nullable Output<String> aggregation) {
            $.aggregation = aggregation;
            return this;
        }

        /**
         * @param aggregation Aggregation type for the request values
         * 
         * @return builder
         * 
         */
        public Builder aggregation(String aggregation) {
            return aggregation(Output.of(aggregation));
        }

        /**
         * @param confidential Confidential data flag. Set `true` to treat the captured data as confidential
         * 
         * @return builder
         * 
         */
        public Builder confidential(@Nullable Output<Boolean> confidential) {
            $.confidential = confidential;
            return this;
        }

        /**
         * @param confidential Confidential data flag. Set `true` to treat the captured data as confidential
         * 
         * @return builder
         * 
         */
        public Builder confidential(Boolean confidential) {
            return confidential(Output.of(confidential));
        }

        /**
         * @param dataSources The list of data sources
         * 
         * @return builder
         * 
         */
        public Builder dataSources(@Nullable Output<List<RequestAttributeDataSourceArgs>> dataSources) {
            $.dataSources = dataSources;
            return this;
        }

        /**
         * @param dataSources The list of data sources
         * 
         * @return builder
         * 
         */
        public Builder dataSources(List<RequestAttributeDataSourceArgs> dataSources) {
            return dataSources(Output.of(dataSources));
        }

        /**
         * @param dataSources The list of data sources
         * 
         * @return builder
         * 
         */
        public Builder dataSources(RequestAttributeDataSourceArgs... dataSources) {
            return dataSources(List.of(dataSources));
        }

        /**
         * @param dataType The data type of the request attribute
         * 
         * @return builder
         * 
         */
        public Builder dataType(@Nullable Output<String> dataType) {
            $.dataType = dataType;
            return this;
        }

        /**
         * @param dataType The data type of the request attribute
         * 
         * @return builder
         * 
         */
        public Builder dataType(String dataType) {
            return dataType(Output.of(dataType));
        }

        /**
         * @param enabled The request attribute is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled The request attribute is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name The name of the request attribute
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the request attribute
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param normalization String values transformation.   If the **dataType** is not `string`, set the `Original` here
         * 
         * @return builder
         * 
         */
        public Builder normalization(@Nullable Output<String> normalization) {
            $.normalization = normalization;
            return this;
        }

        /**
         * @param normalization String values transformation.   If the **dataType** is not `string`, set the `Original` here
         * 
         * @return builder
         * 
         */
        public Builder normalization(String normalization) {
            return normalization(Output.of(normalization));
        }

        /**
         * @param skipPersonalDataMasking Personal data masking flag. Set `true` to skip masking.   Warning: This will potentially access personalized data
         * 
         * @return builder
         * 
         */
        public Builder skipPersonalDataMasking(@Nullable Output<Boolean> skipPersonalDataMasking) {
            $.skipPersonalDataMasking = skipPersonalDataMasking;
            return this;
        }

        /**
         * @param skipPersonalDataMasking Personal data masking flag. Set `true` to skip masking.   Warning: This will potentially access personalized data
         * 
         * @return builder
         * 
         */
        public Builder skipPersonalDataMasking(Boolean skipPersonalDataMasking) {
            return skipPersonalDataMasking(Output.of(skipPersonalDataMasking));
        }

        /**
         * @param unknowns allows for configuring properties that are not explicitly supported by the current version of this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        /**
         * @param unknowns allows for configuring properties that are not explicitly supported by the current version of this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public RequestAttributeState build() {
            return $;
        }
    }

}
