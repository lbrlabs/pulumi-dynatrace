// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.HttpMonitorAnomalyDetectionArgs;
import com.pulumi.dynatrace.inputs.HttpMonitorScriptArgs;
import com.pulumi.dynatrace.inputs.HttpMonitorTagArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HttpMonitorState extends com.pulumi.resources.ResourceArgs {

    public static final HttpMonitorState Empty = new HttpMonitorState();

    /**
     * The anomaly detection configuration.
     * 
     */
    @Import(name="anomalyDetections")
    private @Nullable Output<List<HttpMonitorAnomalyDetectionArgs>> anomalyDetections;

    /**
     * @return The anomaly detection configuration.
     * 
     */
    public Optional<Output<List<HttpMonitorAnomalyDetectionArgs>>> anomalyDetections() {
        return Optional.ofNullable(this.anomalyDetections);
    }

    /**
     * The monitor is enabled (`true`) or disabled (`false`).
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return The monitor is enabled (`true`) or disabled (`false`).
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The frequency of the monitor, in minutes.
     * 
     */
    @Import(name="frequency")
    private @Nullable Output<Integer> frequency;

    /**
     * @return The frequency of the monitor, in minutes.
     * 
     */
    public Optional<Output<Integer>> frequency() {
        return Optional.ofNullable(this.frequency);
    }

    /**
     * A list of locations from which the monitor is executed. To specify a location, use its entity ID.
     * 
     */
    @Import(name="locations")
    private @Nullable Output<List<String>> locations;

    /**
     * @return A list of locations from which the monitor is executed. To specify a location, use its entity ID.
     * 
     */
    public Optional<Output<List<String>>> locations() {
        return Optional.ofNullable(this.locations);
    }

    /**
     * A set of manually assigned applications.
     * 
     */
    @Import(name="manuallyAssignedApps")
    private @Nullable Output<List<String>> manuallyAssignedApps;

    /**
     * @return A set of manually assigned applications.
     * 
     */
    public Optional<Output<List<String>>> manuallyAssignedApps() {
        return Optional.ofNullable(this.manuallyAssignedApps);
    }

    /**
     * The name of the monitor.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the monitor.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The HTTP Script
     * 
     */
    @Import(name="script")
    private @Nullable Output<HttpMonitorScriptArgs> script;

    /**
     * @return The HTTP Script
     * 
     */
    public Optional<Output<HttpMonitorScriptArgs>> script() {
        return Optional.ofNullable(this.script);
    }

    /**
     * A set of tags assigned to the monitor. You can specify only the value of the tag here and the `CONTEXTLESS` context and
     * source &#39;USER&#39; will be added automatically.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<HttpMonitorTagArgs>> tags;

    /**
     * @return A set of tags assigned to the monitor. You can specify only the value of the tag here and the `CONTEXTLESS` context and
     * source &#39;USER&#39; will be added automatically.
     * 
     */
    public Optional<Output<List<HttpMonitorTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private HttpMonitorState() {}

    private HttpMonitorState(HttpMonitorState $) {
        this.anomalyDetections = $.anomalyDetections;
        this.enabled = $.enabled;
        this.frequency = $.frequency;
        this.locations = $.locations;
        this.manuallyAssignedApps = $.manuallyAssignedApps;
        this.name = $.name;
        this.script = $.script;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpMonitorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpMonitorState $;

        public Builder() {
            $ = new HttpMonitorState();
        }

        public Builder(HttpMonitorState defaults) {
            $ = new HttpMonitorState(Objects.requireNonNull(defaults));
        }

        /**
         * @param anomalyDetections The anomaly detection configuration.
         * 
         * @return builder
         * 
         */
        public Builder anomalyDetections(@Nullable Output<List<HttpMonitorAnomalyDetectionArgs>> anomalyDetections) {
            $.anomalyDetections = anomalyDetections;
            return this;
        }

        /**
         * @param anomalyDetections The anomaly detection configuration.
         * 
         * @return builder
         * 
         */
        public Builder anomalyDetections(List<HttpMonitorAnomalyDetectionArgs> anomalyDetections) {
            return anomalyDetections(Output.of(anomalyDetections));
        }

        /**
         * @param anomalyDetections The anomaly detection configuration.
         * 
         * @return builder
         * 
         */
        public Builder anomalyDetections(HttpMonitorAnomalyDetectionArgs... anomalyDetections) {
            return anomalyDetections(List.of(anomalyDetections));
        }

        /**
         * @param enabled The monitor is enabled (`true`) or disabled (`false`).
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled The monitor is enabled (`true`) or disabled (`false`).
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param frequency The frequency of the monitor, in minutes.
         * 
         * @return builder
         * 
         */
        public Builder frequency(@Nullable Output<Integer> frequency) {
            $.frequency = frequency;
            return this;
        }

        /**
         * @param frequency The frequency of the monitor, in minutes.
         * 
         * @return builder
         * 
         */
        public Builder frequency(Integer frequency) {
            return frequency(Output.of(frequency));
        }

        /**
         * @param locations A list of locations from which the monitor is executed. To specify a location, use its entity ID.
         * 
         * @return builder
         * 
         */
        public Builder locations(@Nullable Output<List<String>> locations) {
            $.locations = locations;
            return this;
        }

        /**
         * @param locations A list of locations from which the monitor is executed. To specify a location, use its entity ID.
         * 
         * @return builder
         * 
         */
        public Builder locations(List<String> locations) {
            return locations(Output.of(locations));
        }

        /**
         * @param locations A list of locations from which the monitor is executed. To specify a location, use its entity ID.
         * 
         * @return builder
         * 
         */
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }

        /**
         * @param manuallyAssignedApps A set of manually assigned applications.
         * 
         * @return builder
         * 
         */
        public Builder manuallyAssignedApps(@Nullable Output<List<String>> manuallyAssignedApps) {
            $.manuallyAssignedApps = manuallyAssignedApps;
            return this;
        }

        /**
         * @param manuallyAssignedApps A set of manually assigned applications.
         * 
         * @return builder
         * 
         */
        public Builder manuallyAssignedApps(List<String> manuallyAssignedApps) {
            return manuallyAssignedApps(Output.of(manuallyAssignedApps));
        }

        /**
         * @param manuallyAssignedApps A set of manually assigned applications.
         * 
         * @return builder
         * 
         */
        public Builder manuallyAssignedApps(String... manuallyAssignedApps) {
            return manuallyAssignedApps(List.of(manuallyAssignedApps));
        }

        /**
         * @param name The name of the monitor.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the monitor.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param script The HTTP Script
         * 
         * @return builder
         * 
         */
        public Builder script(@Nullable Output<HttpMonitorScriptArgs> script) {
            $.script = script;
            return this;
        }

        /**
         * @param script The HTTP Script
         * 
         * @return builder
         * 
         */
        public Builder script(HttpMonitorScriptArgs script) {
            return script(Output.of(script));
        }

        /**
         * @param tags A set of tags assigned to the monitor. You can specify only the value of the tag here and the `CONTEXTLESS` context and
         * source &#39;USER&#39; will be added automatically.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<HttpMonitorTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A set of tags assigned to the monitor. You can specify only the value of the tag here and the `CONTEXTLESS` context and
         * source &#39;USER&#39; will be added automatically.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<HttpMonitorTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A set of tags assigned to the monitor. You can specify only the value of the tag here and the `CONTEXTLESS` context and
         * source &#39;USER&#39; will be added automatically.
         * 
         * @return builder
         * 
         */
        public Builder tags(HttpMonitorTagArgs... tags) {
            return tags(List.of(tags));
        }

        public HttpMonitorState build() {
            return $;
        }
    }

}
