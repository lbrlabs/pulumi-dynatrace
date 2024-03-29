// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.K8sPvcAnomaliesLowDiskSpaceCriticalArgs;
import com.pulumi.dynatrace.inputs.K8sPvcAnomaliesLowDiskSpaceCriticalPercentageArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class K8sPvcAnomaliesState extends com.pulumi.resources.ResourceArgs {

    public static final K8sPvcAnomaliesState Empty = new K8sPvcAnomaliesState();

    /**
     * Alerts on low disk space in megabytes for a persistent volume claim.
     * 
     */
    @Import(name="lowDiskSpaceCritical")
    private @Nullable Output<K8sPvcAnomaliesLowDiskSpaceCriticalArgs> lowDiskSpaceCritical;

    /**
     * @return Alerts on low disk space in megabytes for a persistent volume claim.
     * 
     */
    public Optional<Output<K8sPvcAnomaliesLowDiskSpaceCriticalArgs>> lowDiskSpaceCritical() {
        return Optional.ofNullable(this.lowDiskSpaceCritical);
    }

    /**
     * Alerts on low disk space in % for a persistent volume claim.
     * 
     */
    @Import(name="lowDiskSpaceCriticalPercentage")
    private @Nullable Output<K8sPvcAnomaliesLowDiskSpaceCriticalPercentageArgs> lowDiskSpaceCriticalPercentage;

    /**
     * @return Alerts on low disk space in % for a persistent volume claim.
     * 
     */
    public Optional<Output<K8sPvcAnomaliesLowDiskSpaceCriticalPercentageArgs>> lowDiskSpaceCriticalPercentage() {
        return Optional.ofNullable(this.lowDiskSpaceCriticalPercentage);
    }

    /**
     * The scope of this setting (CLOUD*APPLICATION*NAMESPACE, KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope of this setting (CLOUD*APPLICATION*NAMESPACE, KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private K8sPvcAnomaliesState() {}

    private K8sPvcAnomaliesState(K8sPvcAnomaliesState $) {
        this.lowDiskSpaceCritical = $.lowDiskSpaceCritical;
        this.lowDiskSpaceCriticalPercentage = $.lowDiskSpaceCriticalPercentage;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(K8sPvcAnomaliesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private K8sPvcAnomaliesState $;

        public Builder() {
            $ = new K8sPvcAnomaliesState();
        }

        public Builder(K8sPvcAnomaliesState defaults) {
            $ = new K8sPvcAnomaliesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param lowDiskSpaceCritical Alerts on low disk space in megabytes for a persistent volume claim.
         * 
         * @return builder
         * 
         */
        public Builder lowDiskSpaceCritical(@Nullable Output<K8sPvcAnomaliesLowDiskSpaceCriticalArgs> lowDiskSpaceCritical) {
            $.lowDiskSpaceCritical = lowDiskSpaceCritical;
            return this;
        }

        /**
         * @param lowDiskSpaceCritical Alerts on low disk space in megabytes for a persistent volume claim.
         * 
         * @return builder
         * 
         */
        public Builder lowDiskSpaceCritical(K8sPvcAnomaliesLowDiskSpaceCriticalArgs lowDiskSpaceCritical) {
            return lowDiskSpaceCritical(Output.of(lowDiskSpaceCritical));
        }

        /**
         * @param lowDiskSpaceCriticalPercentage Alerts on low disk space in % for a persistent volume claim.
         * 
         * @return builder
         * 
         */
        public Builder lowDiskSpaceCriticalPercentage(@Nullable Output<K8sPvcAnomaliesLowDiskSpaceCriticalPercentageArgs> lowDiskSpaceCriticalPercentage) {
            $.lowDiskSpaceCriticalPercentage = lowDiskSpaceCriticalPercentage;
            return this;
        }

        /**
         * @param lowDiskSpaceCriticalPercentage Alerts on low disk space in % for a persistent volume claim.
         * 
         * @return builder
         * 
         */
        public Builder lowDiskSpaceCriticalPercentage(K8sPvcAnomaliesLowDiskSpaceCriticalPercentageArgs lowDiskSpaceCriticalPercentage) {
            return lowDiskSpaceCriticalPercentage(Output.of(lowDiskSpaceCriticalPercentage));
        }

        /**
         * @param scope The scope of this setting (CLOUD*APPLICATION*NAMESPACE, KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of this setting (CLOUD*APPLICATION*NAMESPACE, KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public K8sPvcAnomaliesState build() {
            return $;
        }
    }

}
