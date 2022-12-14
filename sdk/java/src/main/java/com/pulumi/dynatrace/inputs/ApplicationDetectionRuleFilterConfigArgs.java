// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApplicationDetectionRuleFilterConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationDetectionRuleFilterConfigArgs Empty = new ApplicationDetectionRuleFilterConfigArgs();

    /**
     * Where to look for the pattern value, possible values are `DOMAIN` or `URL`
     * 
     */
    @Import(name="applicationMatchTarget", required=true)
    private Output<String> applicationMatchTarget;

    /**
     * @return Where to look for the pattern value, possible values are `DOMAIN` or `URL`
     * 
     */
    public Output<String> applicationMatchTarget() {
        return this.applicationMatchTarget;
    }

    /**
     * The operator used for matching the application detection rule, possible values are `BEGINS_WITH`, `CONTAINS`, `ENDS_WITH`, `EQUALS`, `MATCHES`
     * 
     */
    @Import(name="applicationMatchType", required=true)
    private Output<String> applicationMatchType;

    /**
     * @return The operator used for matching the application detection rule, possible values are `BEGINS_WITH`, `CONTAINS`, `ENDS_WITH`, `EQUALS`, `MATCHES`
     * 
     */
    public Output<String> applicationMatchType() {
        return this.applicationMatchType;
    }

    /**
     * The value to look for with the application detection rule
     * 
     */
    @Import(name="pattern", required=true)
    private Output<String> pattern;

    /**
     * @return The value to look for with the application detection rule
     * 
     */
    public Output<String> pattern() {
        return this.pattern;
    }

    private ApplicationDetectionRuleFilterConfigArgs() {}

    private ApplicationDetectionRuleFilterConfigArgs(ApplicationDetectionRuleFilterConfigArgs $) {
        this.applicationMatchTarget = $.applicationMatchTarget;
        this.applicationMatchType = $.applicationMatchType;
        this.pattern = $.pattern;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationDetectionRuleFilterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationDetectionRuleFilterConfigArgs $;

        public Builder() {
            $ = new ApplicationDetectionRuleFilterConfigArgs();
        }

        public Builder(ApplicationDetectionRuleFilterConfigArgs defaults) {
            $ = new ApplicationDetectionRuleFilterConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationMatchTarget Where to look for the pattern value, possible values are `DOMAIN` or `URL`
         * 
         * @return builder
         * 
         */
        public Builder applicationMatchTarget(Output<String> applicationMatchTarget) {
            $.applicationMatchTarget = applicationMatchTarget;
            return this;
        }

        /**
         * @param applicationMatchTarget Where to look for the pattern value, possible values are `DOMAIN` or `URL`
         * 
         * @return builder
         * 
         */
        public Builder applicationMatchTarget(String applicationMatchTarget) {
            return applicationMatchTarget(Output.of(applicationMatchTarget));
        }

        /**
         * @param applicationMatchType The operator used for matching the application detection rule, possible values are `BEGINS_WITH`, `CONTAINS`, `ENDS_WITH`, `EQUALS`, `MATCHES`
         * 
         * @return builder
         * 
         */
        public Builder applicationMatchType(Output<String> applicationMatchType) {
            $.applicationMatchType = applicationMatchType;
            return this;
        }

        /**
         * @param applicationMatchType The operator used for matching the application detection rule, possible values are `BEGINS_WITH`, `CONTAINS`, `ENDS_WITH`, `EQUALS`, `MATCHES`
         * 
         * @return builder
         * 
         */
        public Builder applicationMatchType(String applicationMatchType) {
            return applicationMatchType(Output.of(applicationMatchType));
        }

        /**
         * @param pattern The value to look for with the application detection rule
         * 
         * @return builder
         * 
         */
        public Builder pattern(Output<String> pattern) {
            $.pattern = pattern;
            return this;
        }

        /**
         * @param pattern The value to look for with the application detection rule
         * 
         * @return builder
         * 
         */
        public Builder pattern(String pattern) {
            return pattern(Output.of(pattern));
        }

        public ApplicationDetectionRuleFilterConfigArgs build() {
            $.applicationMatchTarget = Objects.requireNonNull($.applicationMatchTarget, "expected parameter 'applicationMatchTarget' to be non-null");
            $.applicationMatchType = Objects.requireNonNull($.applicationMatchType, "expected parameter 'applicationMatchType' to be non-null");
            $.pattern = Objects.requireNonNull($.pattern, "expected parameter 'pattern' to be non-null");
            return $;
        }
    }

}
