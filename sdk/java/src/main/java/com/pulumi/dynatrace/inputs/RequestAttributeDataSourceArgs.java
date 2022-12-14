// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.RequestAttributeDataSourceCicsSdkMethodNodeConditionArgs;
import com.pulumi.dynatrace.inputs.RequestAttributeDataSourceIibLabelMethodNodeConditionArgs;
import com.pulumi.dynatrace.inputs.RequestAttributeDataSourceIibMethodNodeConditionArgs;
import com.pulumi.dynatrace.inputs.RequestAttributeDataSourceMethodArgs;
import com.pulumi.dynatrace.inputs.RequestAttributeDataSourceScopeArgs;
import com.pulumi.dynatrace.inputs.RequestAttributeDataSourceValueProcessingArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RequestAttributeDataSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RequestAttributeDataSourceArgs Empty = new RequestAttributeDataSourceArgs();

    /**
     * Specifies the location where the values are captured and stored.  Required if the **source** is one of the following: `GET_PARAMETER`, `URI`, `REQUEST_HEADER`, `RESPONSE_HEADER`.   Not applicable in other cases.   If the **source** value is `REQUEST_HEADER` or `RESPONSE_HEADER`, the `CAPTURE_AND_STORE_ON_BOTH` location is not allowed
     * 
     */
    @Import(name="capturingAndStorageLocation")
    private @Nullable Output<String> capturingAndStorageLocation;

    /**
     * @return Specifies the location where the values are captured and stored.  Required if the **source** is one of the following: `GET_PARAMETER`, `URI`, `REQUEST_HEADER`, `RESPONSE_HEADER`.   Not applicable in other cases.   If the **source** value is `REQUEST_HEADER` or `RESPONSE_HEADER`, the `CAPTURE_AND_STORE_ON_BOTH` location is not allowed
     * 
     */
    public Optional<Output<String>> capturingAndStorageLocation() {
        return Optional.ofNullable(this.capturingAndStorageLocation);
    }

    /**
     * IBM integration bus label node name condition for which the value is captured
     * 
     */
    @Import(name="cicsSdkMethodNodeCondition")
    private @Nullable Output<RequestAttributeDataSourceCicsSdkMethodNodeConditionArgs> cicsSdkMethodNodeCondition;

    /**
     * @return IBM integration bus label node name condition for which the value is captured
     * 
     */
    public Optional<Output<RequestAttributeDataSourceCicsSdkMethodNodeConditionArgs>> cicsSdkMethodNodeCondition() {
        return Optional.ofNullable(this.cicsSdkMethodNodeCondition);
    }

    /**
     * The data source is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return The data source is enabled (`true`) or disabled (`false`)
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * IBM integration bus label node name condition for which the value is captured
     * 
     */
    @Import(name="iibLabelMethodNodeCondition")
    private @Nullable Output<RequestAttributeDataSourceIibLabelMethodNodeConditionArgs> iibLabelMethodNodeCondition;

    /**
     * @return IBM integration bus label node name condition for which the value is captured
     * 
     */
    public Optional<Output<RequestAttributeDataSourceIibLabelMethodNodeConditionArgs>> iibLabelMethodNodeCondition() {
        return Optional.ofNullable(this.iibLabelMethodNodeCondition);
    }

    /**
     * IBM integration bus label node name condition for which the value is captured
     * 
     */
    @Import(name="iibMethodNodeCondition")
    private @Nullable Output<RequestAttributeDataSourceIibMethodNodeConditionArgs> iibMethodNodeCondition;

    /**
     * @return IBM integration bus label node name condition for which the value is captured
     * 
     */
    public Optional<Output<RequestAttributeDataSourceIibMethodNodeConditionArgs>> iibMethodNodeCondition() {
        return Optional.ofNullable(this.iibMethodNodeCondition);
    }

    /**
     * The IBM integration bus node type for which the value is captured.  This or `iibMethodNodeCondition` is required if the **source** is: `IIB_NODE`.  Not applicable in other cases
     * 
     */
    @Import(name="iibNodeType")
    private @Nullable Output<String> iibNodeType;

    /**
     * @return The IBM integration bus node type for which the value is captured.  This or `iibMethodNodeCondition` is required if the **source** is: `IIB_NODE`.  Not applicable in other cases
     * 
     */
    public Optional<Output<String>> iibNodeType() {
        return Optional.ofNullable(this.iibNodeType);
    }

    /**
     * The method specification if the **source** value is `METHOD_PARAM`.   Not applicable in other cases
     * 
     */
    @Import(name="methods")
    private @Nullable Output<List<RequestAttributeDataSourceMethodArgs>> methods;

    /**
     * @return The method specification if the **source** value is `METHOD_PARAM`.   Not applicable in other cases
     * 
     */
    public Optional<Output<List<RequestAttributeDataSourceMethodArgs>>> methods() {
        return Optional.ofNullable(this.methods);
    }

    /**
     * The name of the web request parameter to capture.  Required if the **source** is one of the following: `POST_PARAMETER`, `GET_PARAMETER`, `REQUEST_HEADER`, `RESPONSE_HEADER`, `CUSTOM_ATTRIBUTE`.  Not applicable in other cases
     * 
     */
    @Import(name="parameterName")
    private @Nullable Output<String> parameterName;

    /**
     * @return The name of the web request parameter to capture.  Required if the **source** is one of the following: `POST_PARAMETER`, `GET_PARAMETER`, `REQUEST_HEADER`, `RESPONSE_HEADER`, `CUSTOM_ATTRIBUTE`.  Not applicable in other cases
     * 
     */
    public Optional<Output<String>> parameterName() {
        return Optional.ofNullable(this.parameterName);
    }

    /**
     * Conditions for data capturing
     * 
     */
    @Import(name="scope")
    private @Nullable Output<RequestAttributeDataSourceScopeArgs> scope;

    /**
     * @return Conditions for data capturing
     * 
     */
    public Optional<Output<RequestAttributeDataSourceScopeArgs>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * The technology of the session attribute to capture if the **source** value is `SESSION_ATTRIBUTE`.
     * 
     */
    @Import(name="sessionAttributeTechnology")
    private @Nullable Output<String> sessionAttributeTechnology;

    /**
     * @return The technology of the session attribute to capture if the **source** value is `SESSION_ATTRIBUTE`.
     * 
     */
    public Optional<Output<String>> sessionAttributeTechnology() {
        return Optional.ofNullable(this.sessionAttributeTechnology);
    }

    /**
     * The source of the attribute to capture. Works in conjunction with **parameterName** or **methods** and **technology**
     * 
     */
    @Import(name="source", required=true)
    private Output<String> source;

    /**
     * @return The source of the attribute to capture. Works in conjunction with **parameterName** or **methods** and **technology**
     * 
     */
    public Output<String> source() {
        return this.source;
    }

    @Import(name="technology")
    private @Nullable Output<String> technology;

    public Optional<Output<String>> technology() {
        return Optional.ofNullable(this.technology);
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

    @Import(name="valueProcessing")
    private @Nullable Output<RequestAttributeDataSourceValueProcessingArgs> valueProcessing;

    public Optional<Output<RequestAttributeDataSourceValueProcessingArgs>> valueProcessing() {
        return Optional.ofNullable(this.valueProcessing);
    }

    private RequestAttributeDataSourceArgs() {}

    private RequestAttributeDataSourceArgs(RequestAttributeDataSourceArgs $) {
        this.capturingAndStorageLocation = $.capturingAndStorageLocation;
        this.cicsSdkMethodNodeCondition = $.cicsSdkMethodNodeCondition;
        this.enabled = $.enabled;
        this.iibLabelMethodNodeCondition = $.iibLabelMethodNodeCondition;
        this.iibMethodNodeCondition = $.iibMethodNodeCondition;
        this.iibNodeType = $.iibNodeType;
        this.methods = $.methods;
        this.parameterName = $.parameterName;
        this.scope = $.scope;
        this.sessionAttributeTechnology = $.sessionAttributeTechnology;
        this.source = $.source;
        this.technology = $.technology;
        this.unknowns = $.unknowns;
        this.valueProcessing = $.valueProcessing;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RequestAttributeDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RequestAttributeDataSourceArgs $;

        public Builder() {
            $ = new RequestAttributeDataSourceArgs();
        }

        public Builder(RequestAttributeDataSourceArgs defaults) {
            $ = new RequestAttributeDataSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capturingAndStorageLocation Specifies the location where the values are captured and stored.  Required if the **source** is one of the following: `GET_PARAMETER`, `URI`, `REQUEST_HEADER`, `RESPONSE_HEADER`.   Not applicable in other cases.   If the **source** value is `REQUEST_HEADER` or `RESPONSE_HEADER`, the `CAPTURE_AND_STORE_ON_BOTH` location is not allowed
         * 
         * @return builder
         * 
         */
        public Builder capturingAndStorageLocation(@Nullable Output<String> capturingAndStorageLocation) {
            $.capturingAndStorageLocation = capturingAndStorageLocation;
            return this;
        }

        /**
         * @param capturingAndStorageLocation Specifies the location where the values are captured and stored.  Required if the **source** is one of the following: `GET_PARAMETER`, `URI`, `REQUEST_HEADER`, `RESPONSE_HEADER`.   Not applicable in other cases.   If the **source** value is `REQUEST_HEADER` or `RESPONSE_HEADER`, the `CAPTURE_AND_STORE_ON_BOTH` location is not allowed
         * 
         * @return builder
         * 
         */
        public Builder capturingAndStorageLocation(String capturingAndStorageLocation) {
            return capturingAndStorageLocation(Output.of(capturingAndStorageLocation));
        }

        /**
         * @param cicsSdkMethodNodeCondition IBM integration bus label node name condition for which the value is captured
         * 
         * @return builder
         * 
         */
        public Builder cicsSdkMethodNodeCondition(@Nullable Output<RequestAttributeDataSourceCicsSdkMethodNodeConditionArgs> cicsSdkMethodNodeCondition) {
            $.cicsSdkMethodNodeCondition = cicsSdkMethodNodeCondition;
            return this;
        }

        /**
         * @param cicsSdkMethodNodeCondition IBM integration bus label node name condition for which the value is captured
         * 
         * @return builder
         * 
         */
        public Builder cicsSdkMethodNodeCondition(RequestAttributeDataSourceCicsSdkMethodNodeConditionArgs cicsSdkMethodNodeCondition) {
            return cicsSdkMethodNodeCondition(Output.of(cicsSdkMethodNodeCondition));
        }

        /**
         * @param enabled The data source is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled The data source is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param iibLabelMethodNodeCondition IBM integration bus label node name condition for which the value is captured
         * 
         * @return builder
         * 
         */
        public Builder iibLabelMethodNodeCondition(@Nullable Output<RequestAttributeDataSourceIibLabelMethodNodeConditionArgs> iibLabelMethodNodeCondition) {
            $.iibLabelMethodNodeCondition = iibLabelMethodNodeCondition;
            return this;
        }

        /**
         * @param iibLabelMethodNodeCondition IBM integration bus label node name condition for which the value is captured
         * 
         * @return builder
         * 
         */
        public Builder iibLabelMethodNodeCondition(RequestAttributeDataSourceIibLabelMethodNodeConditionArgs iibLabelMethodNodeCondition) {
            return iibLabelMethodNodeCondition(Output.of(iibLabelMethodNodeCondition));
        }

        /**
         * @param iibMethodNodeCondition IBM integration bus label node name condition for which the value is captured
         * 
         * @return builder
         * 
         */
        public Builder iibMethodNodeCondition(@Nullable Output<RequestAttributeDataSourceIibMethodNodeConditionArgs> iibMethodNodeCondition) {
            $.iibMethodNodeCondition = iibMethodNodeCondition;
            return this;
        }

        /**
         * @param iibMethodNodeCondition IBM integration bus label node name condition for which the value is captured
         * 
         * @return builder
         * 
         */
        public Builder iibMethodNodeCondition(RequestAttributeDataSourceIibMethodNodeConditionArgs iibMethodNodeCondition) {
            return iibMethodNodeCondition(Output.of(iibMethodNodeCondition));
        }

        /**
         * @param iibNodeType The IBM integration bus node type for which the value is captured.  This or `iibMethodNodeCondition` is required if the **source** is: `IIB_NODE`.  Not applicable in other cases
         * 
         * @return builder
         * 
         */
        public Builder iibNodeType(@Nullable Output<String> iibNodeType) {
            $.iibNodeType = iibNodeType;
            return this;
        }

        /**
         * @param iibNodeType The IBM integration bus node type for which the value is captured.  This or `iibMethodNodeCondition` is required if the **source** is: `IIB_NODE`.  Not applicable in other cases
         * 
         * @return builder
         * 
         */
        public Builder iibNodeType(String iibNodeType) {
            return iibNodeType(Output.of(iibNodeType));
        }

        /**
         * @param methods The method specification if the **source** value is `METHOD_PARAM`.   Not applicable in other cases
         * 
         * @return builder
         * 
         */
        public Builder methods(@Nullable Output<List<RequestAttributeDataSourceMethodArgs>> methods) {
            $.methods = methods;
            return this;
        }

        /**
         * @param methods The method specification if the **source** value is `METHOD_PARAM`.   Not applicable in other cases
         * 
         * @return builder
         * 
         */
        public Builder methods(List<RequestAttributeDataSourceMethodArgs> methods) {
            return methods(Output.of(methods));
        }

        /**
         * @param methods The method specification if the **source** value is `METHOD_PARAM`.   Not applicable in other cases
         * 
         * @return builder
         * 
         */
        public Builder methods(RequestAttributeDataSourceMethodArgs... methods) {
            return methods(List.of(methods));
        }

        /**
         * @param parameterName The name of the web request parameter to capture.  Required if the **source** is one of the following: `POST_PARAMETER`, `GET_PARAMETER`, `REQUEST_HEADER`, `RESPONSE_HEADER`, `CUSTOM_ATTRIBUTE`.  Not applicable in other cases
         * 
         * @return builder
         * 
         */
        public Builder parameterName(@Nullable Output<String> parameterName) {
            $.parameterName = parameterName;
            return this;
        }

        /**
         * @param parameterName The name of the web request parameter to capture.  Required if the **source** is one of the following: `POST_PARAMETER`, `GET_PARAMETER`, `REQUEST_HEADER`, `RESPONSE_HEADER`, `CUSTOM_ATTRIBUTE`.  Not applicable in other cases
         * 
         * @return builder
         * 
         */
        public Builder parameterName(String parameterName) {
            return parameterName(Output.of(parameterName));
        }

        /**
         * @param scope Conditions for data capturing
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<RequestAttributeDataSourceScopeArgs> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Conditions for data capturing
         * 
         * @return builder
         * 
         */
        public Builder scope(RequestAttributeDataSourceScopeArgs scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param sessionAttributeTechnology The technology of the session attribute to capture if the **source** value is `SESSION_ATTRIBUTE`.
         * 
         * @return builder
         * 
         */
        public Builder sessionAttributeTechnology(@Nullable Output<String> sessionAttributeTechnology) {
            $.sessionAttributeTechnology = sessionAttributeTechnology;
            return this;
        }

        /**
         * @param sessionAttributeTechnology The technology of the session attribute to capture if the **source** value is `SESSION_ATTRIBUTE`.
         * 
         * @return builder
         * 
         */
        public Builder sessionAttributeTechnology(String sessionAttributeTechnology) {
            return sessionAttributeTechnology(Output.of(sessionAttributeTechnology));
        }

        /**
         * @param source The source of the attribute to capture. Works in conjunction with **parameterName** or **methods** and **technology**
         * 
         * @return builder
         * 
         */
        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The source of the attribute to capture. Works in conjunction with **parameterName** or **methods** and **technology**
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        public Builder technology(@Nullable Output<String> technology) {
            $.technology = technology;
            return this;
        }

        public Builder technology(String technology) {
            return technology(Output.of(technology));
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

        public Builder valueProcessing(@Nullable Output<RequestAttributeDataSourceValueProcessingArgs> valueProcessing) {
            $.valueProcessing = valueProcessing;
            return this;
        }

        public Builder valueProcessing(RequestAttributeDataSourceValueProcessingArgs valueProcessing) {
            return valueProcessing(Output.of(valueProcessing));
        }

        public RequestAttributeDataSourceArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}
