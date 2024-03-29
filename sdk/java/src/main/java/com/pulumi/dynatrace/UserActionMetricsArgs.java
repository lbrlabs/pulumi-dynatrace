// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.UserActionMetricsFiltersArgs;
import com.pulumi.dynatrace.inputs.UserActionMetricsValueArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserActionMetricsArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserActionMetricsArgs Empty = new UserActionMetricsArgs();

    /**
     * Defines the fields that are used as dimensions. A dimension is a collection of reference information about a metric data point that is of interest to your business. Dimensions are parameters like &#34;application&#34;, &#34;type&#34;, &#34;name&#34;. For example, using &#34;type&#34; as a dimension allows you to split chart data based on the user action type.
     * 
     */
    @Import(name="dimensions")
    private @Nullable Output<List<String>> dimensions;

    /**
     * @return Defines the fields that are used as dimensions. A dimension is a collection of reference information about a metric data point that is of interest to your business. Dimensions are parameters like &#34;application&#34;, &#34;type&#34;, &#34;name&#34;. For example, using &#34;type&#34; as a dimension allows you to split chart data based on the user action type.
     * 
     */
    public Optional<Output<List<String>>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    /**
     * This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Defines the filters for the user action. Filters apply at the moment of extracting the data and only sessions that satisfy the filtering criteria will be used to extract the custom metrics. You will not be able to modify these filters in the metric data explorer. For example, using &#34;type equals Xhr&#34; will give you only data from xhr actions, while forcing the rest of user actions of different types to be ignored.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<UserActionMetricsFiltersArgs> filters;

    /**
     * @return Defines the filters for the user action. Filters apply at the moment of extracting the data and only sessions that satisfy the filtering criteria will be used to extract the custom metrics. You will not be able to modify these filters in the metric data explorer. For example, using &#34;type equals Xhr&#34; will give you only data from xhr actions, while forcing the rest of user actions of different types to be ignored.
     * 
     */
    public Optional<Output<UserActionMetricsFiltersArgs>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Metric key
     * 
     */
    @Import(name="metricKey", required=true)
    private Output<String> metricKey;

    /**
     * @return Metric key
     * 
     */
    public Output<String> metricKey() {
        return this.metricKey;
    }

    /**
     * Defines the type of value to be extracted from the user action. When using **user action counter**, the number of user actions is counted (similar to count(*) when using USQL). When using **user action field value**, the value of a user action field is extracted.
     * 
     */
    @Import(name="value", required=true)
    private Output<UserActionMetricsValueArgs> value;

    /**
     * @return Defines the type of value to be extracted from the user action. When using **user action counter**, the number of user actions is counted (similar to count(*) when using USQL). When using **user action field value**, the value of a user action field is extracted.
     * 
     */
    public Output<UserActionMetricsValueArgs> value() {
        return this.value;
    }

    private UserActionMetricsArgs() {}

    private UserActionMetricsArgs(UserActionMetricsArgs $) {
        this.dimensions = $.dimensions;
        this.enabled = $.enabled;
        this.filters = $.filters;
        this.metricKey = $.metricKey;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserActionMetricsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserActionMetricsArgs $;

        public Builder() {
            $ = new UserActionMetricsArgs();
        }

        public Builder(UserActionMetricsArgs defaults) {
            $ = new UserActionMetricsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dimensions Defines the fields that are used as dimensions. A dimension is a collection of reference information about a metric data point that is of interest to your business. Dimensions are parameters like &#34;application&#34;, &#34;type&#34;, &#34;name&#34;. For example, using &#34;type&#34; as a dimension allows you to split chart data based on the user action type.
         * 
         * @return builder
         * 
         */
        public Builder dimensions(@Nullable Output<List<String>> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        /**
         * @param dimensions Defines the fields that are used as dimensions. A dimension is a collection of reference information about a metric data point that is of interest to your business. Dimensions are parameters like &#34;application&#34;, &#34;type&#34;, &#34;name&#34;. For example, using &#34;type&#34; as a dimension allows you to split chart data based on the user action type.
         * 
         * @return builder
         * 
         */
        public Builder dimensions(List<String> dimensions) {
            return dimensions(Output.of(dimensions));
        }

        /**
         * @param dimensions Defines the fields that are used as dimensions. A dimension is a collection of reference information about a metric data point that is of interest to your business. Dimensions are parameters like &#34;application&#34;, &#34;type&#34;, &#34;name&#34;. For example, using &#34;type&#34; as a dimension allows you to split chart data based on the user action type.
         * 
         * @return builder
         * 
         */
        public Builder dimensions(String... dimensions) {
            return dimensions(List.of(dimensions));
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param filters Defines the filters for the user action. Filters apply at the moment of extracting the data and only sessions that satisfy the filtering criteria will be used to extract the custom metrics. You will not be able to modify these filters in the metric data explorer. For example, using &#34;type equals Xhr&#34; will give you only data from xhr actions, while forcing the rest of user actions of different types to be ignored.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<UserActionMetricsFiltersArgs> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Defines the filters for the user action. Filters apply at the moment of extracting the data and only sessions that satisfy the filtering criteria will be used to extract the custom metrics. You will not be able to modify these filters in the metric data explorer. For example, using &#34;type equals Xhr&#34; will give you only data from xhr actions, while forcing the rest of user actions of different types to be ignored.
         * 
         * @return builder
         * 
         */
        public Builder filters(UserActionMetricsFiltersArgs filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param metricKey Metric key
         * 
         * @return builder
         * 
         */
        public Builder metricKey(Output<String> metricKey) {
            $.metricKey = metricKey;
            return this;
        }

        /**
         * @param metricKey Metric key
         * 
         * @return builder
         * 
         */
        public Builder metricKey(String metricKey) {
            return metricKey(Output.of(metricKey));
        }

        /**
         * @param value Defines the type of value to be extracted from the user action. When using **user action counter**, the number of user actions is counted (similar to count(*) when using USQL). When using **user action field value**, the value of a user action field is extracted.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<UserActionMetricsValueArgs> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Defines the type of value to be extracted from the user action. When using **user action counter**, the number of user actions is counted (similar to count(*) when using USQL). When using **user action field value**, the value of a user action field is extracted.
         * 
         * @return builder
         * 
         */
        public Builder value(UserActionMetricsValueArgs value) {
            return value(Output.of(value));
        }

        public UserActionMetricsArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.metricKey = Objects.requireNonNull($.metricKey, "expected parameter 'metricKey' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
