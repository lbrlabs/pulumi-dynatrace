// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BrowserMonitorKeyPerformanceMetricsArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrowserMonitorKeyPerformanceMetricsArgs Empty = new BrowserMonitorKeyPerformanceMetricsArgs();

    /**
     * Defines the key performance metric for load actions. Supported values are `VISUALLY_COMPLETE`, `SPEED_INDEX`, `USER_ACTION_DURATION`, `TIME_TO_FIRST_BYTE`, `HTML_DOWNLOADED`, `DOM_INTERACTIVE`, `LOAD_EVENT_START` and `LOAD_EVENT_END`.
     * 
     */
    @Import(name="loadActionKpm", required=true)
    private Output<String> loadActionKpm;

    /**
     * @return Defines the key performance metric for load actions. Supported values are `VISUALLY_COMPLETE`, `SPEED_INDEX`, `USER_ACTION_DURATION`, `TIME_TO_FIRST_BYTE`, `HTML_DOWNLOADED`, `DOM_INTERACTIVE`, `LOAD_EVENT_START` and `LOAD_EVENT_END`.
     * 
     */
    public Output<String> loadActionKpm() {
        return this.loadActionKpm;
    }

    /**
     * Defines the key performance metric for XHR actions. Supported values are `VISUALLY_COMPLETE`, `USER_ACTION_DURATION`, `TIME_TO_FIRST_BYTE` and `RESPONSE_END`.
     * 
     */
    @Import(name="xhrActionKpm", required=true)
    private Output<String> xhrActionKpm;

    /**
     * @return Defines the key performance metric for XHR actions. Supported values are `VISUALLY_COMPLETE`, `USER_ACTION_DURATION`, `TIME_TO_FIRST_BYTE` and `RESPONSE_END`.
     * 
     */
    public Output<String> xhrActionKpm() {
        return this.xhrActionKpm;
    }

    private BrowserMonitorKeyPerformanceMetricsArgs() {}

    private BrowserMonitorKeyPerformanceMetricsArgs(BrowserMonitorKeyPerformanceMetricsArgs $) {
        this.loadActionKpm = $.loadActionKpm;
        this.xhrActionKpm = $.xhrActionKpm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrowserMonitorKeyPerformanceMetricsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrowserMonitorKeyPerformanceMetricsArgs $;

        public Builder() {
            $ = new BrowserMonitorKeyPerformanceMetricsArgs();
        }

        public Builder(BrowserMonitorKeyPerformanceMetricsArgs defaults) {
            $ = new BrowserMonitorKeyPerformanceMetricsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param loadActionKpm Defines the key performance metric for load actions. Supported values are `VISUALLY_COMPLETE`, `SPEED_INDEX`, `USER_ACTION_DURATION`, `TIME_TO_FIRST_BYTE`, `HTML_DOWNLOADED`, `DOM_INTERACTIVE`, `LOAD_EVENT_START` and `LOAD_EVENT_END`.
         * 
         * @return builder
         * 
         */
        public Builder loadActionKpm(Output<String> loadActionKpm) {
            $.loadActionKpm = loadActionKpm;
            return this;
        }

        /**
         * @param loadActionKpm Defines the key performance metric for load actions. Supported values are `VISUALLY_COMPLETE`, `SPEED_INDEX`, `USER_ACTION_DURATION`, `TIME_TO_FIRST_BYTE`, `HTML_DOWNLOADED`, `DOM_INTERACTIVE`, `LOAD_EVENT_START` and `LOAD_EVENT_END`.
         * 
         * @return builder
         * 
         */
        public Builder loadActionKpm(String loadActionKpm) {
            return loadActionKpm(Output.of(loadActionKpm));
        }

        /**
         * @param xhrActionKpm Defines the key performance metric for XHR actions. Supported values are `VISUALLY_COMPLETE`, `USER_ACTION_DURATION`, `TIME_TO_FIRST_BYTE` and `RESPONSE_END`.
         * 
         * @return builder
         * 
         */
        public Builder xhrActionKpm(Output<String> xhrActionKpm) {
            $.xhrActionKpm = xhrActionKpm;
            return this;
        }

        /**
         * @param xhrActionKpm Defines the key performance metric for XHR actions. Supported values are `VISUALLY_COMPLETE`, `USER_ACTION_DURATION`, `TIME_TO_FIRST_BYTE` and `RESPONSE_END`.
         * 
         * @return builder
         * 
         */
        public Builder xhrActionKpm(String xhrActionKpm) {
            return xhrActionKpm(Output.of(xhrActionKpm));
        }

        public BrowserMonitorKeyPerformanceMetricsArgs build() {
            $.loadActionKpm = Objects.requireNonNull($.loadActionKpm, "expected parameter 'loadActionKpm' to be non-null");
            $.xhrActionKpm = Objects.requireNonNull($.xhrActionKpm, "expected parameter 'xhrActionKpm' to be non-null");
            return $;
        }
    }

}
