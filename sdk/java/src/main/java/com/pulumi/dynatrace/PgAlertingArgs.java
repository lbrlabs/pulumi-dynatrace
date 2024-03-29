// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PgAlertingArgs extends com.pulumi.resources.ResourceArgs {

    public static final PgAlertingArgs Empty = new PgAlertingArgs();

    /**
     * **if any process becomes unavailable:**
     * Dynatrace will open a new problem if a single process in this group shuts down or crashes.
     * 
     */
    @Import(name="alertingMode")
    private @Nullable Output<String> alertingMode;

    /**
     * @return **if any process becomes unavailable:**
     * Dynatrace will open a new problem if a single process in this group shuts down or crashes.
     * 
     */
    public Optional<Output<String>> alertingMode() {
        return Optional.ofNullable(this.alertingMode);
    }

    /**
     * Enable process group availability monitoring
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Enable process group availability monitoring
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Open a new problem if the number of active process instances in the group is fewer than:
     * 
     */
    @Import(name="minimumInstanceThreshold")
    private @Nullable Output<Integer> minimumInstanceThreshold;

    /**
     * @return Open a new problem if the number of active process instances in the group is fewer than:
     * 
     */
    public Optional<Output<Integer>> minimumInstanceThreshold() {
        return Optional.ofNullable(this.minimumInstanceThreshold);
    }

    /**
     * The process group ID for availability monitoring
     * 
     */
    @Import(name="processGroup", required=true)
    private Output<String> processGroup;

    /**
     * @return The process group ID for availability monitoring
     * 
     */
    public Output<String> processGroup() {
        return this.processGroup;
    }

    private PgAlertingArgs() {}

    private PgAlertingArgs(PgAlertingArgs $) {
        this.alertingMode = $.alertingMode;
        this.enabled = $.enabled;
        this.minimumInstanceThreshold = $.minimumInstanceThreshold;
        this.processGroup = $.processGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PgAlertingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PgAlertingArgs $;

        public Builder() {
            $ = new PgAlertingArgs();
        }

        public Builder(PgAlertingArgs defaults) {
            $ = new PgAlertingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertingMode **if any process becomes unavailable:**
         * Dynatrace will open a new problem if a single process in this group shuts down or crashes.
         * 
         * @return builder
         * 
         */
        public Builder alertingMode(@Nullable Output<String> alertingMode) {
            $.alertingMode = alertingMode;
            return this;
        }

        /**
         * @param alertingMode **if any process becomes unavailable:**
         * Dynatrace will open a new problem if a single process in this group shuts down or crashes.
         * 
         * @return builder
         * 
         */
        public Builder alertingMode(String alertingMode) {
            return alertingMode(Output.of(alertingMode));
        }

        /**
         * @param enabled Enable process group availability monitoring
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable process group availability monitoring
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param minimumInstanceThreshold Open a new problem if the number of active process instances in the group is fewer than:
         * 
         * @return builder
         * 
         */
        public Builder minimumInstanceThreshold(@Nullable Output<Integer> minimumInstanceThreshold) {
            $.minimumInstanceThreshold = minimumInstanceThreshold;
            return this;
        }

        /**
         * @param minimumInstanceThreshold Open a new problem if the number of active process instances in the group is fewer than:
         * 
         * @return builder
         * 
         */
        public Builder minimumInstanceThreshold(Integer minimumInstanceThreshold) {
            return minimumInstanceThreshold(Output.of(minimumInstanceThreshold));
        }

        /**
         * @param processGroup The process group ID for availability monitoring
         * 
         * @return builder
         * 
         */
        public Builder processGroup(Output<String> processGroup) {
            $.processGroup = processGroup;
            return this;
        }

        /**
         * @param processGroup The process group ID for availability monitoring
         * 
         * @return builder
         * 
         */
        public Builder processGroup(String processGroup) {
            return processGroup(Output.of(processGroup));
        }

        public PgAlertingArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.processGroup = Objects.requireNonNull($.processGroup, "expected parameter 'processGroup' to be non-null");
            return $;
        }
    }

}
