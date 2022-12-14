// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class K8sCredentialsEventsFieldSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final K8sCredentialsEventsFieldSelectorArgs Empty = new K8sCredentialsEventsFieldSelectorArgs();

    /**
     * Whether subscription to this events field selector is enabled (value set to `true`). If disabled (value set to `false`), Dynatrace will stop fetching events from the Kubernetes API for this events field selector
     * 
     */
    @Import(name="active", required=true)
    private Output<Boolean> active;

    /**
     * @return Whether subscription to this events field selector is enabled (value set to `true`). If disabled (value set to `false`), Dynatrace will stop fetching events from the Kubernetes API for this events field selector
     * 
     */
    public Output<Boolean> active() {
        return this.active;
    }

    /**
     * The field selector string (url decoding is applied) when storing it.
     * 
     */
    @Import(name="fieldSelector", required=true)
    private Output<String> fieldSelector;

    /**
     * @return The field selector string (url decoding is applied) when storing it.
     * 
     */
    public Output<String> fieldSelector() {
        return this.fieldSelector;
    }

    /**
     * A label of the events field selector.
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return A label of the events field selector.
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    /**
     * Any attributes that aren&#39;t yet supported by this provider
     * 
     */
    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    /**
     * @return Any attributes that aren&#39;t yet supported by this provider
     * 
     */
    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    private K8sCredentialsEventsFieldSelectorArgs() {}

    private K8sCredentialsEventsFieldSelectorArgs(K8sCredentialsEventsFieldSelectorArgs $) {
        this.active = $.active;
        this.fieldSelector = $.fieldSelector;
        this.label = $.label;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(K8sCredentialsEventsFieldSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private K8sCredentialsEventsFieldSelectorArgs $;

        public Builder() {
            $ = new K8sCredentialsEventsFieldSelectorArgs();
        }

        public Builder(K8sCredentialsEventsFieldSelectorArgs defaults) {
            $ = new K8sCredentialsEventsFieldSelectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param active Whether subscription to this events field selector is enabled (value set to `true`). If disabled (value set to `false`), Dynatrace will stop fetching events from the Kubernetes API for this events field selector
         * 
         * @return builder
         * 
         */
        public Builder active(Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active Whether subscription to this events field selector is enabled (value set to `true`). If disabled (value set to `false`), Dynatrace will stop fetching events from the Kubernetes API for this events field selector
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        /**
         * @param fieldSelector The field selector string (url decoding is applied) when storing it.
         * 
         * @return builder
         * 
         */
        public Builder fieldSelector(Output<String> fieldSelector) {
            $.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * @param fieldSelector The field selector string (url decoding is applied) when storing it.
         * 
         * @return builder
         * 
         */
        public Builder fieldSelector(String fieldSelector) {
            return fieldSelector(Output.of(fieldSelector));
        }

        /**
         * @param label A label of the events field selector.
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label A label of the events field selector.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param unknowns Any attributes that aren&#39;t yet supported by this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        /**
         * @param unknowns Any attributes that aren&#39;t yet supported by this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public K8sCredentialsEventsFieldSelectorArgs build() {
            $.active = Objects.requireNonNull($.active, "expected parameter 'active' to be non-null");
            $.fieldSelector = Objects.requireNonNull($.fieldSelector, "expected parameter 'fieldSelector' to be non-null");
            $.label = Objects.requireNonNull($.label, "expected parameter 'label' to be non-null");
            return $;
        }
    }

}
