// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.K8sClusterAnomaliesCpuRequestsSaturationArgs;
import com.pulumi.dynatrace.inputs.K8sClusterAnomaliesMemoryRequestsSaturationArgs;
import com.pulumi.dynatrace.inputs.K8sClusterAnomaliesMonitoringIssuesArgs;
import com.pulumi.dynatrace.inputs.K8sClusterAnomaliesPodsSaturationArgs;
import com.pulumi.dynatrace.inputs.K8sClusterAnomaliesReadinessIssuesArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class K8sClusterAnomaliesState extends com.pulumi.resources.ResourceArgs {

    public static final K8sClusterAnomaliesState Empty = new K8sClusterAnomaliesState();

    /**
     * no documentation available
     * 
     */
    @Import(name="cpuRequestsSaturation")
    private @Nullable Output<K8sClusterAnomaliesCpuRequestsSaturationArgs> cpuRequestsSaturation;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<K8sClusterAnomaliesCpuRequestsSaturationArgs>> cpuRequestsSaturation() {
        return Optional.ofNullable(this.cpuRequestsSaturation);
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="memoryRequestsSaturation")
    private @Nullable Output<K8sClusterAnomaliesMemoryRequestsSaturationArgs> memoryRequestsSaturation;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<K8sClusterAnomaliesMemoryRequestsSaturationArgs>> memoryRequestsSaturation() {
        return Optional.ofNullable(this.memoryRequestsSaturation);
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="monitoringIssues")
    private @Nullable Output<K8sClusterAnomaliesMonitoringIssuesArgs> monitoringIssues;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<K8sClusterAnomaliesMonitoringIssuesArgs>> monitoringIssues() {
        return Optional.ofNullable(this.monitoringIssues);
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="podsSaturation")
    private @Nullable Output<K8sClusterAnomaliesPodsSaturationArgs> podsSaturation;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<K8sClusterAnomaliesPodsSaturationArgs>> podsSaturation() {
        return Optional.ofNullable(this.podsSaturation);
    }

    /**
     * Alerts if cluster has not been ready for a given amount of time
     * 
     */
    @Import(name="readinessIssues")
    private @Nullable Output<K8sClusterAnomaliesReadinessIssuesArgs> readinessIssues;

    /**
     * @return Alerts if cluster has not been ready for a given amount of time
     * 
     */
    public Optional<Output<K8sClusterAnomaliesReadinessIssuesArgs>> readinessIssues() {
        return Optional.ofNullable(this.readinessIssues);
    }

    /**
     * The scope of this setting (KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope of this setting (KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private K8sClusterAnomaliesState() {}

    private K8sClusterAnomaliesState(K8sClusterAnomaliesState $) {
        this.cpuRequestsSaturation = $.cpuRequestsSaturation;
        this.memoryRequestsSaturation = $.memoryRequestsSaturation;
        this.monitoringIssues = $.monitoringIssues;
        this.podsSaturation = $.podsSaturation;
        this.readinessIssues = $.readinessIssues;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(K8sClusterAnomaliesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private K8sClusterAnomaliesState $;

        public Builder() {
            $ = new K8sClusterAnomaliesState();
        }

        public Builder(K8sClusterAnomaliesState defaults) {
            $ = new K8sClusterAnomaliesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpuRequestsSaturation no documentation available
         * 
         * @return builder
         * 
         */
        public Builder cpuRequestsSaturation(@Nullable Output<K8sClusterAnomaliesCpuRequestsSaturationArgs> cpuRequestsSaturation) {
            $.cpuRequestsSaturation = cpuRequestsSaturation;
            return this;
        }

        /**
         * @param cpuRequestsSaturation no documentation available
         * 
         * @return builder
         * 
         */
        public Builder cpuRequestsSaturation(K8sClusterAnomaliesCpuRequestsSaturationArgs cpuRequestsSaturation) {
            return cpuRequestsSaturation(Output.of(cpuRequestsSaturation));
        }

        /**
         * @param memoryRequestsSaturation no documentation available
         * 
         * @return builder
         * 
         */
        public Builder memoryRequestsSaturation(@Nullable Output<K8sClusterAnomaliesMemoryRequestsSaturationArgs> memoryRequestsSaturation) {
            $.memoryRequestsSaturation = memoryRequestsSaturation;
            return this;
        }

        /**
         * @param memoryRequestsSaturation no documentation available
         * 
         * @return builder
         * 
         */
        public Builder memoryRequestsSaturation(K8sClusterAnomaliesMemoryRequestsSaturationArgs memoryRequestsSaturation) {
            return memoryRequestsSaturation(Output.of(memoryRequestsSaturation));
        }

        /**
         * @param monitoringIssues no documentation available
         * 
         * @return builder
         * 
         */
        public Builder monitoringIssues(@Nullable Output<K8sClusterAnomaliesMonitoringIssuesArgs> monitoringIssues) {
            $.monitoringIssues = monitoringIssues;
            return this;
        }

        /**
         * @param monitoringIssues no documentation available
         * 
         * @return builder
         * 
         */
        public Builder monitoringIssues(K8sClusterAnomaliesMonitoringIssuesArgs monitoringIssues) {
            return monitoringIssues(Output.of(monitoringIssues));
        }

        /**
         * @param podsSaturation no documentation available
         * 
         * @return builder
         * 
         */
        public Builder podsSaturation(@Nullable Output<K8sClusterAnomaliesPodsSaturationArgs> podsSaturation) {
            $.podsSaturation = podsSaturation;
            return this;
        }

        /**
         * @param podsSaturation no documentation available
         * 
         * @return builder
         * 
         */
        public Builder podsSaturation(K8sClusterAnomaliesPodsSaturationArgs podsSaturation) {
            return podsSaturation(Output.of(podsSaturation));
        }

        /**
         * @param readinessIssues Alerts if cluster has not been ready for a given amount of time
         * 
         * @return builder
         * 
         */
        public Builder readinessIssues(@Nullable Output<K8sClusterAnomaliesReadinessIssuesArgs> readinessIssues) {
            $.readinessIssues = readinessIssues;
            return this;
        }

        /**
         * @param readinessIssues Alerts if cluster has not been ready for a given amount of time
         * 
         * @return builder
         * 
         */
        public Builder readinessIssues(K8sClusterAnomaliesReadinessIssuesArgs readinessIssues) {
            return readinessIssues(Output.of(readinessIssues));
        }

        /**
         * @param scope The scope of this setting (KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of this setting (KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public K8sClusterAnomaliesState build() {
            return $;
        }
    }

}
