// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ProcessGroupDetectionGroupExtractionArgs;
import com.pulumi.dynatrace.inputs.ProcessGroupDetectionInstanceExtractionArgs;
import com.pulumi.dynatrace.inputs.ProcessGroupDetectionProcessDetectionArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProcessGroupDetectionState extends com.pulumi.resources.ResourceArgs {

    public static final ProcessGroupDetectionState Empty = new ProcessGroupDetectionState();

    /**
     * This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * You can define the properties that should be used to identify your process groups.
     * 
     */
    @Import(name="groupExtraction")
    private @Nullable Output<ProcessGroupDetectionGroupExtractionArgs> groupExtraction;

    /**
     * @return You can define the properties that should be used to identify your process groups.
     * 
     */
    public Optional<Output<ProcessGroupDetectionGroupExtractionArgs>> groupExtraction() {
        return Optional.ofNullable(this.groupExtraction);
    }

    /**
     * You can define the properties that should be used to identify your process instances.
     * 
     */
    @Import(name="instanceExtraction")
    private @Nullable Output<ProcessGroupDetectionInstanceExtractionArgs> instanceExtraction;

    /**
     * @return You can define the properties that should be used to identify your process instances.
     * 
     */
    public Optional<Output<ProcessGroupDetectionInstanceExtractionArgs>> instanceExtraction() {
        return Optional.ofNullable(this.instanceExtraction);
    }

    /**
     * Apply this rule to processes where the selected property contains the specified string.
     * 
     */
    @Import(name="processDetection")
    private @Nullable Output<ProcessGroupDetectionProcessDetectionArgs> processDetection;

    /**
     * @return Apply this rule to processes where the selected property contains the specified string.
     * 
     */
    public Optional<Output<ProcessGroupDetectionProcessDetectionArgs>> processDetection() {
        return Optional.ofNullable(this.processDetection);
    }

    private ProcessGroupDetectionState() {}

    private ProcessGroupDetectionState(ProcessGroupDetectionState $) {
        this.enabled = $.enabled;
        this.groupExtraction = $.groupExtraction;
        this.instanceExtraction = $.instanceExtraction;
        this.processDetection = $.processDetection;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProcessGroupDetectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProcessGroupDetectionState $;

        public Builder() {
            $ = new ProcessGroupDetectionState();
        }

        public Builder(ProcessGroupDetectionState defaults) {
            $ = new ProcessGroupDetectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
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
         * @param groupExtraction You can define the properties that should be used to identify your process groups.
         * 
         * @return builder
         * 
         */
        public Builder groupExtraction(@Nullable Output<ProcessGroupDetectionGroupExtractionArgs> groupExtraction) {
            $.groupExtraction = groupExtraction;
            return this;
        }

        /**
         * @param groupExtraction You can define the properties that should be used to identify your process groups.
         * 
         * @return builder
         * 
         */
        public Builder groupExtraction(ProcessGroupDetectionGroupExtractionArgs groupExtraction) {
            return groupExtraction(Output.of(groupExtraction));
        }

        /**
         * @param instanceExtraction You can define the properties that should be used to identify your process instances.
         * 
         * @return builder
         * 
         */
        public Builder instanceExtraction(@Nullable Output<ProcessGroupDetectionInstanceExtractionArgs> instanceExtraction) {
            $.instanceExtraction = instanceExtraction;
            return this;
        }

        /**
         * @param instanceExtraction You can define the properties that should be used to identify your process instances.
         * 
         * @return builder
         * 
         */
        public Builder instanceExtraction(ProcessGroupDetectionInstanceExtractionArgs instanceExtraction) {
            return instanceExtraction(Output.of(instanceExtraction));
        }

        /**
         * @param processDetection Apply this rule to processes where the selected property contains the specified string.
         * 
         * @return builder
         * 
         */
        public Builder processDetection(@Nullable Output<ProcessGroupDetectionProcessDetectionArgs> processDetection) {
            $.processDetection = processDetection;
            return this;
        }

        /**
         * @param processDetection Apply this rule to processes where the selected property contains the specified string.
         * 
         * @return builder
         * 
         */
        public Builder processDetection(ProcessGroupDetectionProcessDetectionArgs processDetection) {
            return processDetection(Output.of(processDetection));
        }

        public ProcessGroupDetectionState build() {
            return $;
        }
    }

}
